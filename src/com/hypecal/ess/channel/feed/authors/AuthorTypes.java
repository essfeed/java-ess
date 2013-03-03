package com.hypecal.ess.channel.feed.authors;

import javax.xml.bind.annotation.XmlEnumValue;

public enum AuthorTypes 
{
	@XmlEnumValue(value = "author")
	AUTHOR,
	
	@XmlEnumValue(value = "contributor")
	CONTRIBUTOR
}
