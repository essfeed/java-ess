package com.hypecal.ess.channel.feed.dates;

import javax.xml.bind.annotation.XmlEnumValue;

public enum DateUnits
{
	@XmlEnumValue(value = "")
	NONE,
	
	@XmlEnumValue(value = "hour")
	HOUR,
	
	@XmlEnumValue(value = "day")
	DAY,
	
	@XmlEnumValue(value = "week")
	WEEK,
	
	@XmlEnumValue(value = "month")
	MONTH,
	
	@XmlEnumValue(value = "year")
	YEAR
}