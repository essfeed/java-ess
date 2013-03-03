package com.hypecal.ess.channel.feed.dates;

import javax.xml.bind.annotation.XmlEnumValue;

public enum DateTypes 
{
	@XmlEnumValue(value = "standalone")
	STANDALONE,
	
	@XmlEnumValue(value = "recurent")
	RECURENT
}