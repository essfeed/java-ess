package com.hypecal.ess.channel.feed;

import javax.xml.bind.annotation.XmlEnumValue;

public enum AccessTypes 
{
	@XmlEnumValue(value = "PUBLIC")
	PUBLIC,
	
	@XmlEnumValue(value = "PRIVATE")
	PRIVATE,
}
