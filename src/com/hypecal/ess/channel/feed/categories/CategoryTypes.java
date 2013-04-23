package com.hypecal.ess.channel.feed.categories;

import javax.xml.bind.annotation.XmlEnumValue;

public enum CategoryTypes 
{
	@XmlEnumValue(value = "award")
	AWARD,
	
	@XmlEnumValue(value = "competition")
	COMPETITION, 
	
	@XmlEnumValue(value = "commemoration")
	COMMEMORATION,
	
	@XmlEnumValue(value = "conference")
	CONFERENCE, 
	
	@XmlEnumValue(value = "concert")
	CONCERT,
	
	@XmlEnumValue(value = "diner")
	DINER,
	
	@XmlEnumValue(value = "cocktail")
	COCKTAIL,
	
	@XmlEnumValue(value = "course")
	COURSE,
	
	@XmlEnumValue(value = "exhibition")
	EXHIBITION,
	
	@XmlEnumValue(value = "family")
	FAMILY,
	
	@XmlEnumValue(value = "friends")
	FRIENDS,
	
	@XmlEnumValue(value = "festival")
	FESTIVAL,
	
	@XmlEnumValue(value = "meeting")
	MEETING,
	
	@XmlEnumValue(value = "networking")
	NETWORKING,
	
	@XmlEnumValue(value = "party")
	PARTY,
	
	@XmlEnumValue(value = "seminar")
	SEMINAR,
	
	@XmlEnumValue(value = "theme")
	THEME
}
