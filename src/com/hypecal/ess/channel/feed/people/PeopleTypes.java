package com.hypecal.ess.channel.feed.people;

import javax.xml.bind.annotation.XmlEnumValue;

public enum PeopleTypes 
{
	@XmlEnumValue(value = "organizer")
	ORGANIZER,
	
	@XmlEnumValue(value = "performer")
	PERFORMER,
	
	@XmlEnumValue(value = "attendee")
	ATTENDEE
}
