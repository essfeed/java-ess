package com.hypecal.ess.channel.feed.dates;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hypecal.ess.channel.feed.dates.DateTypes;
import com.hypecal.ess.channel.feed.prices.PriceUnits;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "start",
    "duration"
})
public final class DateItem 
{
	// -- item @attribute
	@XmlAttribute(required = true, name = "type")
	protected DateTypes type = DateTypes.STANDALONE;
	public void setType( DateTypes o ) 		{ this.type = o; }
	public DateTypes getType()				{ return this.type; }
	
	@XmlAttribute(required = false, name = "unit")
	protected PriceUnits unit = PriceUnits.NONE;
	public void setUnit( PriceUnits o ) 	{ this.unit = o; }
	public PriceUnits getUnit()				{ return this.unit; }
	
	@XmlAttribute(required = false, name = "priority")
	protected int priority = 1;
	public void setPriority( int o )		{ this.priority = o; }
	public int getPriority()				{ return this.priority; }
	
	
	// --- item elements
	@XmlElement(required = true, name="name")
    protected String name;
	public void setName( String o )			{ this.name = o; }
	public String getName() 				{ return this.name; }
	
	@XmlElement(required = true, name="start")
    protected Date start;
	public void setStart( Date o )			{ this.start = o; }
	public Date getStart() 					{ return this.start; }
	
	@XmlElement(required = false, name="duration")
    protected int duration;
	public void setDuration( int o )		{ this.duration = o; }
	public int getDuration() 				{ return this.duration; }
	
	
}