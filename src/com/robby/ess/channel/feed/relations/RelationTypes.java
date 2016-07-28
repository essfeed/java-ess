package ai.robby.ess.channel.feed.relations;

import javax.xml.bind.annotation.XmlEnumValue;

public enum RelationTypes 
{
	@XmlEnumValue(value = "alternative")
	ALTERNATIVE,
	
	@XmlEnumValue(value = "related")
	RELATED,
	
	@XmlEnumValue(value = "enclosure")
	ENCLOSURE
}