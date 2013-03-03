package com.hypecal.ess.channel.feed.places;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hypecal.ess.channel.feed.places.PlaceTypes;
import com.hypecal.ess.channel.feed.places.PlaceMediumTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "country",
	"country_code",
	"latitude",		
	"longitude", 	
	"address", 		
	"city", 			
	"zip", 			
	"state", 		
	"state_code",	
	"start", 		
	"stop", 			
	"medium", 		
	"kml"
})
public class PlaceItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected PlaceTypes type = PlaceTypes.FIX;
	public void setType( PlaceTypes o ) 	{ this.type = o; }
	public PlaceTypes getType()				{ return this.type; }
	
	@XmlAttribute(required = false)
	protected int priority = 1;
	public void setPriority( int o )		{ this.priority = o; }
	public int getPriority()				{ return this.priority; }
	
	
	// --- item elements
	@XmlElement(required = true, name="name")
    protected String name;
	public void setName( String o )			{ this.name = o; }
	public String getName() 				{ return this.name; }
	
	@XmlElement(required = true, name="country")
    protected String country;
	public void setCountry( String o )		{ this.country = o; }
	public String getCountry() 				{ return this.country; }
	
	@XmlElement(required = true, name="country_code")
    protected String country_code;
	public void setCountry_code( String o )	{ this.country_code = o; }
	public String getCountry_code() 		{ return this.country_code; }
	
	@XmlElement(required = false, name="latitude")
    protected Number latitude;
	public void setLatitude( Number o )		{ this.latitude = o; }
	public Number getLatitude() 			{ return this.latitude; }
	
	@XmlElement(required = false, name="longitude")
    protected Number longitude;
	public void setLongitude( Number o )	{ this.longitude = o; }
	public Number getLongitude() 			{ return this.longitude; }
	
	@XmlElement(required = false, name="address")
    protected String address;
	public void setAddress( String o )		{ this.address = o; }
	public String getAddress() 				{ return this.address; }
	
	@XmlElement(required = false, name="city")
    protected String city;
	public void setCity( String o )			{ this.city = o; }
	public String getCity() 				{ return this.city; }
	
	@XmlElement(required = false, name="zip")
    protected String zip;
	public void setZip( String o )			{ this.zip = o; }
	public String getZip() 					{ return this.zip; }
	
	@XmlElement(required = false, name="state")
    protected String state;
	public void setState( String o )		{ this.state = o; }
	public String getState() 				{ return this.state; }
	
	@XmlElement(required = false, name="state_code")
    protected String state_code;
	public void setState_code( String o )	{ this.state_code = o; }
	public String getState_code() 			{ return this.state_code; }
	
	@XmlElement(required = false, name="start")
    protected PlaceItem start;
	public void setStart( PlaceItem o )		{ this.start = o; }
	public PlaceItem getStart() 			{ return this.start; }
	
	@XmlElement(required = false, name="stop")
    protected PlaceItem stop;
	public void setStop( PlaceItem o )		{ this.stop = o; }
	public PlaceItem getStop() 				{ return this.stop; }
	
	@XmlElement(required = false, name="medium_name")
    protected String medium_name;
	public void setMedium_name( String o )	{ this.medium_name = o; }
	public String getMedium_name() 			{ return this.medium_name; }
	
	@XmlElement(required = false, name="medium_type")
    protected PlaceMediumTypes medium_type = PlaceMediumTypes.NONE;
	public void setMedium_type( PlaceMediumTypes o )	{ this.medium_type = o; }
	public PlaceMediumTypes getMedium_type() 			{ return this.medium_type; }
	
	@XmlElement(required = false, name="kml")
    protected String kml;
	public void setKml( String o )			{ this.kml = o; }
	public String getKml() 					{ return this.kml; }
}
