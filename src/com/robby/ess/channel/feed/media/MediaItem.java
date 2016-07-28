package ai.robby.ess.channel.feed.media;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ai.robby.ess.channel.feed.media.MediaTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "uri"
})
public class MediaItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected MediaTypes type = MediaTypes.IMAGE;
	public void setType( MediaTypes o ) 	{ this.type = o; }
	public MediaTypes getType()				{ return this.type; }
	
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
	public void setUri( String o )			{ this.uri = o; }
	public String getUri() 					{ return this.uri; }
}
