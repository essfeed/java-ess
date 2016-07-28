package ai.robby.ess.channel.feed.people;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ai.robby.ess.channel.feed.people.PeopleTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "id",
	"firstname",
	"lastname",
	"organization",
	"logo",
	"icon",
	"uri",
	"address",
	"city",
	"zip",
	"state",
	"state_code",
	"country",
	"country_code",
	"email",
	"phone",
	"minpeople",
	"maxpeople",
	"minage",
	"restriction"
})
public class PeopleItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected PeopleTypes type = PeopleTypes.ORGANIZER;
	public void setType( PeopleTypes o ) 	{ this.type = o; }
	public PeopleTypes getType()			{ return this.type; }
	
	@XmlAttribute(required = false)
	protected int priority = 1;
	public void setPriority( int o )		{ this.priority = o; }
	public int getPriority()				{ return this.priority; }
	
	
	// --- item elements
	@XmlElement(required = true, name="name")
    protected String name;
	public void setName( String o )			{ this.name = o; }
	public String getName() 				{ return this.name; }
	
	@XmlElement(required = false, name="id")
    protected String id;
	public void setId( String o )			{ this.id = o; }
	public String getId() 					{ return this.id; }
	
	@XmlElement(required = false, name="firstname")
    protected String firstname;
	public void setFirstname( String o )	{ this.firstname = o; }
	public String getFirstname() 			{ return this.firstname; }
	
	@XmlElement(required = false, name="lastname")
    protected String lastname;
	public void setLastname( String o )		{ this.lastname = o; }
	public String getLastname() 			{ return this.lastname; }
	
	@XmlElement(required = false, name="organization")
    protected String organization;
	public void setOrganization( String o )	{ this.organization = o; }
	public String getOrganization() 		{ return this.organization; }
	
	@XmlElement(required = false, name="logo")
    protected String logo;
	public void setLogo( String o )			{ this.logo = o; }
	public String getLogo() 				{ return this.logo; }
	
	@XmlElement(required = false, name="icon")
    protected String icon;
	public void setIcon( String o )			{ this.icon = o; }
	public String getIcon() 				{ return this.icon; }
	
	@XmlElement(required = false, name="uri")
    protected String uri;
	public void setUri( String o )			{ this.uri = o; }
	public String getUri() 					{ return this.uri; }
	
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
	
	@XmlElement(required = false, name="country")
    protected String country;
	public void setCountry( String o )		{ this.country = o; }
	public String getCountry() 				{ return this.country; }
	
	@XmlElement(required = false, name="country_code")
    protected String country_code;
	public void setCountry_code( String o )	{ this.country_code = o; }
	public String getCountry_code()			{ return this.country_code; }
	
	@XmlElement(required = false, name="email")
    protected String email;
	public void setEmail( String o )		{ this.email = o; }
	public String getEmail() 				{ return this.email; }
	
	@XmlElement(required = false, name="phone")
    protected String phone;
	public void setPhone( String o )		{ this.phone = o; }
	public String getPhone() 				{ return this.phone; }
	
	@XmlElement(required = false, name="minpeople")
    protected String minpeople;
	public void setMinpeople( String o )	{ this.minpeople = o; }
	public String getMinpeople() 			{ return this.minpeople; }
	
	@XmlElement(required = false, name="maxpeople")
    protected String maxpeople;
	public void setMaxpeople( String o )	{ this.maxpeople = o; }
	public String getMaxpeople() 			{ return this.maxpeople; }
	
	@XmlElement(required = false, name="minage")
    protected String minage;
	public void setMinage( String o )		{ this.minage = o; }
	public String getMinage() 				{ return this.minage; }
	
	@XmlElement(required = false, name="restriction")
    protected String restriction;
	public void setRestriction( String o )	{ this.restriction = o; }
	public String getRestriction() 			{ return this.restriction; }
}