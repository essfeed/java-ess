package com.hypecal.ess.channel.feed.places;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PlaceMediumTypes 
{
	@XmlEnumValue(value = "")
	NONE,
	
	@XmlEnumValue(value = "television")
	TELEVISION,
	
	@XmlEnumValue(value = "radio")
	RADIO,
	
	@XmlEnumValue(value = "internet")
	INTERNET
}
