package org.thunderbolts.tpod.tasks;

import org.thunderbolts.tpod.modals.PictureEntry;
import org.thunderbolts.tpod.parsers.HtmlFormParser;

import android.os.AsyncTask;
import android.util.Log;

public class FormDataRetrieverTask extends AsyncTask<String, String, PictureEntry> {

	private PictureEntry event;
	
	
	public FormDataRetrieverTask(PictureEntry e){
		this.event = e;
	}
	
	private static final String TAG = "FormDataRetrieverTask";
	
	@Override
	protected PictureEntry doInBackground(String... arg0) {
		try{
			HtmlFormParser parser = new HtmlFormParser();
			event.setActualImageLocation(parser.getImage());
			event.setImageTitle(parser.getTitle());
			event.setImageDesc(parser.getPictureDescription());
			event.setProcessdate(parser.getDate());
			event.setAuthor(parser.getAuthor());
		}catch(Exception e){
			Log.v(TAG,"Exception whilst doing background process : " + e.getMessage());
		}
		return event;
	}

	@Override
	protected void onPostExecute(PictureEntry result) {
	}

	@Override
	protected void onPreExecute() {
	}

	@Override
	protected void onProgressUpdate(String... text) {
	}

}
