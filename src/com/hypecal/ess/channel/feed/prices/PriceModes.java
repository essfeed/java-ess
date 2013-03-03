package com.hypecal.ess.channel.feed.prices;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PriceModes
{
	@XmlEnumValue(value = "fix")
	FIX,
	
	@XmlEnumValue(value = "free")
	FREE,
	
	@XmlEnumValue(value = "invitation")
	INVITATION,
	
	@XmlEnumValue(value = "bepayed")
	BEPAYED
}