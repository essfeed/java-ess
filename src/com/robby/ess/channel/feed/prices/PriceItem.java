package ai.robby.ess.channel.feed.prices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ai.robby.ess.channel.feed.prices.PriceTypes;
import ai.robby.ess.channel.feed.prices.PriceModes;
import ai.robby.ess.channel.feed.prices.PriceUnits;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
	"value",
	"currency",
	"start",
	"uri"
})
public class PriceItem 
{
	// -- item @attribute
	@XmlAttribute(required = true, name = "type")
	protected PriceTypes type = PriceTypes.STANDALONE;
	public void setType( PriceTypes o ) 	{ this.type = o; }
	public PriceTypes getType()				{ return this.type; }
	
	@XmlAttribute(required = true, name = "mode")
	protected PriceModes mode = PriceModes.FIX;
	public void setMode( PriceModes o ) 	{ this.mode = o; }
	public PriceModes getMode()				{ return this.mode; }
	
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
	
	@XmlElement(required = true, name="value")
    protected Number value;
	public void setValue( Number o )		{ this.value = o; }
	public Number getValue() 				{ return this.value; }
	
	@XmlElement(required = false, name="currency")
    protected String currency = PriceCurrencies.XXX.getCode();
	public void setCurrency( String o )		{ this.currency = o; }
	public String getCurrency() 			{ return this.currency; }
	
	@XmlElement(required = false, name="start")
    protected Date start;
	public void setStart( Date o )			{ this.start = o; }
	public Date getStart() 					{ return this.start; }
	
	@XmlElement(required = false, name="uri")
    protected String uri;
	public void setUri( String o )			{ this.uri = o; }
	public String getUri() 					{ return this.uri; }
}
