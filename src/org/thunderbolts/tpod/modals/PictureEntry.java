package org.thunderbolts.tpod.modals;

import java.sql.Timestamp;

public class PictureEntry {
	
	private String imageCachedLocation;
	private String actualImageLocation;
	private String remoteImageLocation;
	private String imageTitle;
	private String imageDesc;
	private String processdate;
	private String author;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImageCachedLocation() {
		return imageCachedLocation;
	}
	public void setImageCachedLocation(String imageCachedLocation) {
		this.imageCachedLocation = imageCachedLocation;
	}
	public String getActualImageLocation() {
		return actualImageLocation;
	}
	public void setActualImageLocation(String actualImageLocation) {
		this.actualImageLocation = actualImageLocation;
	}
	public String getRemoteImageLocation() {
		return remoteImageLocation;
	}
	public void setRemoteImageLocation(String remoteImageLocation) {
		this.remoteImageLocation = remoteImageLocation;
	}
	public String getImageTitle() {
		return imageTitle;
	}
	public void setImageTitle(String imageTitle) {
		this.imageTitle = imageTitle;
	}
	public String getImageDesc() {
		return imageDesc;
	}
	public void setImageDesc(String imageDesc) {
		this.imageDesc = imageDesc;
	}
	public String getProcessdate() {
		return processdate;
	}
	public void setProcessdate(String processdate) {
		this.processdate = processdate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((actualImageLocation == null) ? 0 : actualImageLocation
						.hashCode());
		result = prime
				* result
				+ ((imageCachedLocation == null) ? 0 : imageCachedLocation
						.hashCode());
		result = prime * result
				+ ((imageDesc == null) ? 0 : imageDesc.hashCode());
		result = prime * result
				+ ((imageTitle == null) ? 0 : imageTitle.hashCode());
		result = prime * result
				+ ((processdate == null) ? 0 : processdate.hashCode());
		result = prime
				* result
				+ ((remoteImageLocation == null) ? 0 : remoteImageLocation
						.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PictureEntry other = (PictureEntry) obj;
		if (actualImageLocation == null) {
			if (other.actualImageLocation != null)
				return false;
		} else if (!actualImageLocation.equals(other.actualImageLocation))
			return false;
		if (imageCachedLocation == null) {
			if (other.imageCachedLocation != null)
				return false;
		} else if (!imageCachedLocation.equals(other.imageCachedLocation))
			return false;
		if (imageDesc == null) {
			if (other.imageDesc != null)
				return false;
		} else if (!imageDesc.equals(other.imageDesc))
			return false;
		if (imageTitle == null) {
			if (other.imageTitle != null)
				return false;
		} else if (!imageTitle.equals(other.imageTitle))
			return false;
		if (processdate == null) {
			if (other.processdate != null)
				return false;
		} else if (!processdate.equals(other.processdate))
			return false;
		if (remoteImageLocation == null) {
			if (other.remoteImageLocation != null)
				return false;
		} else if (!remoteImageLocation.equals(other.remoteImageLocation))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PictureEntry [imageCachedLocation=" + imageCachedLocation
				+ ", actualImageLocation=" + actualImageLocation
				+ ", remoteImageLocation=" + remoteImageLocation
				+ ", imageTitle=" + imageTitle + ", imageDesc=" + imageDesc
				+ ", processdate=" + processdate + "]";
	}
	
}
