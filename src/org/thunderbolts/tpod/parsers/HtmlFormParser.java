package org.thunderbolts.tpod.parsers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.thunderbolts.tpod.modals.PictureEntry;

import android.util.Log;

public class HtmlFormParser {

	private static final String TAG = "HtmlFormParser";
	private static final String TPOD_URL = "http://www.thunderbolts.info/wp/daily-tpod/";
	private static final String IMAGE_SEARCH = "img[class^=wp-image-]";
	private static final String TITLE_SEARCH = "h2.entry-title > a";
	private static final String AUTHOR_SEARCH = "div.entry-meta > a";
	private static final String DATE_SEARCH = "div.entry-meta > a";
	private static final String CAPTION_SEARCH = "p.wp-caption-text";
	
	private static final String IMAGE_SRC = "src";
	
	private Document doc;

	public HtmlFormParser() throws Exception{
		try{
			doc =  Jsoup.connect(TPOD_URL).get();
			Log.v(TAG,"[Attempting to retrieve all form data]");
		}catch(Exception e){
			throw e;
		}
	}

	public PictureEntry getDailyEvent() {
		return null;
	}

	public String getPictureDescription() {
		String pictureCaption = null;
		try {
			Element img = doc.select(CAPTION_SEARCH).first();
			pictureCaption = img.ownText();
			Log.v(TAG, "Picture Description : " + pictureCaption);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return pictureCaption;
	}

	public String getPictureStory() {
		String story = null;
		try {
			Element img = doc.select(IMAGE_SEARCH).first();
			String imgSrc = img.attr(IMAGE_SRC);
			Log.v(TAG, "Picture Story : " + imgSrc);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return story;
	}

	public String getDate() {
		String dateString = null;
		try {
			Element img = doc.select(DATE_SEARCH).first();
			dateString = img.ownText();
			Log.v(TAG, "Date : " + dateString);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return dateString;
	}
	
	public String getAuthor() {
		String author = null;
		try {
			Elements img = doc.select(AUTHOR_SEARCH);
			Element authorElement = img.get(1);
			author = authorElement.ownText();
			Log.v(TAG, "Author : " + author);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return author;
	}

	public String getTitle() {
		String title = null;
		try {
			Element titleElement = doc.select(TITLE_SEARCH).first();
			title = titleElement.ownText();
			Log.v(TAG, "Title : " + title);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return title;
	}

	public String getImage() {
		String imageURL = null;
		try {
			Element img = doc.select(IMAGE_SEARCH).first();
			imageURL = img.attr(IMAGE_SRC);
			Log.v(TAG, "Image URL : " + imageURL);
		} catch (Exception e) {
			Log.v(TAG, "Exception : " + e.getMessage());
		}
		return imageURL;
	}
}
