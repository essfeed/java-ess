package com.hypecal.ess.channel.feed.prices;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PriceTypes 
{
	@XmlEnumValue(value = "standalone")
	STANDALONE,
	
	@XmlEnumValue(value = "recurrent")
	RECURRENT
}