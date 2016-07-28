package ai.robby.ess.channel.feed.prices;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PriceUnits
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