package com.hypecal.ess.channel.feed.categories;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hypecal.ess.channel.feed.categories.CategoryTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "name",
    "id"
})
public final class CategoryItem 
{
	// -- item @attribute
	@XmlAttribute(required = true)
	protected CategoryTypes type = CategoryTypes.EXHIBITION;
	public void setType( CategoryTypes o ) 	{ this.type = o; }
	public CategoryTypes getType()			{ return this.type; }
	
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
}
