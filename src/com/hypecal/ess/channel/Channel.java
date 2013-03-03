package com.hypecal.ess.channel;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.hypecal.ess.Ess;
import com.hypecal.ess.channel.feed.Feed;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel", propOrder = {
    "title",
    "link",
    "id",
    "generator",
    "published",
    "updated",
    "rights",
    "feed"
})
public final class Channel 
{
	@XmlElement(required = true, name = "title")
	protected String title = "";
	public void setTitle( String o )		{ this.title = o; }
	public String getTitle() 				{ return title; }
	
	@XmlElement(required = true, name = "link")
	protected String link;
	public void setLink( String o )			{ this.link= o; this.setId( o ); }
	public String getLink() 				{ return link; }
	
	@XmlElement(required = true, name = "id")
	protected String id;
	public void setId( String o )			{ this.id = Ess.uuid( o, "ESSID:" ); }
	public String getId() 					{ return id; }
	
	@XmlElement(required = false, name = "generator")
	protected String generator;
	public void setGenerator( String o )	{ this.generator = o; }
	public String getGenerator() 			{ return generator; }
	
	@XmlElement(required = true, name = "published")
	protected Date published;
	public void setPublished( Date o )		{ this.published = o; }
	public Date getPublished() 				{ return published; }
	
	@XmlElement(required = false, name = "updated")
	protected Date updated;
	public void setUpdated( Date o )		{ this.updated = o; }
	public Date getUpdated() 				{ return updated; }
	
	@XmlElement(required = false, name = "rights")
	protected String rights;
	public void setRights( String o )		{ this.rights = o; }
	public String getRights()				{ return rights; }
	
	@XmlElement(required = true, name = "feed")
	protected List<Feed> feed;
	public void setFeed( List<Feed> o )		{ this.feed = o; }
	public List<Feed> getFeed()				{ return feed; }
}