package com.hypecal.ess.channel.feed.places;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PlaceTypes 
{
	@XmlEnumValue(value = "fix")
	FIX,
	
	@XmlEnumValue(value = "area")
	AREA,
	
	@XmlEnumValue(value = "moving")
	MOVING,
	
	@XmlEnumValue(value = "virtual")
	VIRTUAL
}
