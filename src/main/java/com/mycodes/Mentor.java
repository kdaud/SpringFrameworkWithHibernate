package com.mycodes;


public class Mentor {
	
	private String language;
	
	public String getLanguage() {
		return this.language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mentor [language=" + language + "]";
	}
	
}
