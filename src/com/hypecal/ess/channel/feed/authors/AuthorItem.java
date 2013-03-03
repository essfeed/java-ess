package com.hypecal.ess.channel.feed.authors;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hypecal.ess.channel.feed.authors.AuthorItem;
import com.hypecal.ess.channel.feed.authors.AuthorTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "uri",
	"firstname",
	"lastname",
	"organization",
	"address",
	"city",
	"zip",
	"state",
	"state_code",
	"country",
	"country_code",
	"email",
	"phone"
})
public class AuthorItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected AuthorTypes type = AuthorTypes.AUTHOR;
	public void setType( AuthorTypes o ) 	{ this.type = o; }
	public AuthorTypes getType()			{ return this.type; }
	
	@XmlAttribute(required = false)
	protected int priority = 1;
	public void setPriority( int o )		{ this.priority = o; }
	public int getPriority()				{ return this.priority; }
	
	
	// --- item elements
	@XmlElement(	required = true, name = "name")
    protected String name;
	public void setName( String o )			{ this.name = o; }
	public String getName() 				{ return this.name; }
	
	@XmlElement(	required = true, name = "uri")
    protected String uri;
	public void setUri( String o )			{ this.uri = o; }
	public String getUri() 					{ return this.uri; }
	
	@XmlElement(	required = true, name = "firstname")
    protected String firstname;
	public void setFirstname( String o )	{ this.firstname = o; }
	public String getFirstname() 			{ return this.firstname; }
	
	@XmlElement(	required = true, name = "lastname")
    protected String lastname;
	public void setLastname( String o )		{ this.lastname = o; }
	public String getLastname() 			{ return this.lastname; }
	
	@XmlElement(	required = true, name = "organization")
    protected String organization;
	public void setOrganization( String o )	{ this.organization = o; }
	public String getOrganization() 		{ return this.organization; }
	
	@XmlElement(	required = true, name = "address")
    protected String address;
	public void setAddress( String o )		{ this.address = o; }
	public String getAddress() 				{ return this.address; }
	
	@XmlElement(	required = true, name = "city")
    protected String city;
	public void setCity( String o )			{ this.city = o; }
	public String getCity() 				{ return this.city; }
	
	@XmlElement(	required = true, name = "zip")
    protected String zip;
	public void setZip( String o )			{ this.zip = o; }
	public String getZip() 					{ return this.zip; }
	
	@XmlElement(	required = true, name = "state")
    protected String state;
	public void setState( String o )		{ this.state = o; }
	public String getState() 				{ return this.state; }
	
	@XmlElement(	required = true, name = "state_code")
    protected String state_code;
	public void setState_code( String o )	{ this.state_code = o; }
	public String getState_code() 			{ return this.state_code; }
	
	@XmlElement(	required = true, name = "country")
    protected String country;
	public void setCountry( String o )		{ this.country = o; }
	public String getCountry() 				{ return this.country; }
	
	@XmlElement(	required = true, name = "country_code")
    protected String country_code;
	public void setCountry_code( String o )	{ this.country_code = o; }
	public String getCountry_code() 		{ return this.country_code; }
	
	@XmlElement(	required = true, name = "email")
    protected String email;
	public void setEmail( String o )		{ this.email = o; }
	public String getEmail() 				{ return this.email; }
	
	@XmlElement(	required = true, name = "phone")
    protected String phone;
	public void setName( String o )			{ this.phone = o; }
	public String getName() 				{ return this.phone; }
}