package ai.robby.ess.channel.feed.media;

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
