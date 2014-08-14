package org.thunderbolts.tpod.db;

import java.util.List;

import org.thunderbolts.tpod.modals.PictureEntry;

public interface ApplicationDao {
	public int insertPictureEvent(PictureEntry entry) throws Exception;
	public List<PictureEntry> getEntries() throws Exception;
	public boolean hasToday() throws Exception;
}
