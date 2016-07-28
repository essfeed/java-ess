package ai.robby.ess.channel.feed.relations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ai.robby.ess.Ess;
import ai.robby.ess.channel.feed.relations.RelationTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "uri",
    "id"
})
public class RelationItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected RelationTypes type = RelationTypes.ALTERNATIVE;
	public void setType( RelationTypes o ) 	{ this.type = o; }
	public RelationTypes getType()				{ return this.type; }
	
	@XmlAttribute(required = false)
	protected int priority = 1;
	public void setPriority( int o )		{ this.priority = o; }
	public int getPriority()				{ return this.priority; }
	
	
	// --- item elements
	@XmlElement(required = true, name="name")
    protected String name;
	public void setName( String o )			{ this.name = o; }
	public String getName() 				{ return this.name; }
	
	@XmlElement(required = true, name="uri")
    protected String uri;
	public void setUri( String o )			{ this.uri = o; this.id = this.setId( o ); }
	public String getUri() 					{ return this.uri; }
	
	@XmlElement(required = true, name="id")
    protected String id;
	public void setId( String o )			{ this.id = Ess.uuid( o, "EVENTID:" ); }
	public String getId() 					{ return this.id; }
}
