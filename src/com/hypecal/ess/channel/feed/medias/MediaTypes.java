package com.hypecal.ess.channel.feed.medias;

import javax.xml.bind.annotation.XmlEnumValue;

public enum MediaTypes 
{
	@XmlEnumValue(value = "image")
	IMAGE,
	
	@XmlEnumValue(value = "video")
	VIDEO,
	
	@XmlEnumValue(value = "sound")
	SOUND,
	
	@XmlEnumValue(value = "website")
	WEBSITE
}
