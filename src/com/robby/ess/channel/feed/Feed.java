package ai.robby.ess.channel.feed;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ai.robby.ess.channel.feed.AccessTypes;
import ai.robby.ess.channel.feed.categories.CategoryItem;
import ai.robby.ess.channel.feed.dates.DateItem;
import ai.robby.ess.channel.feed.media.MediaItem;
import ai.robby.ess.channel.feed.people.PeopleItem;
import ai.robby.ess.channel.feed.places.PlaceItem;
import ai.robby.ess.channel.feed.prices.PriceItem;
import ai.robby.ess.channel.feed.relations.RelationItem;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feed", propOrder = {
    "title",
    "id",
    "uri",
    "access",
    "description",
    "published",
    "updated",
    "tags",
    
    "categories",
    "dates",
    "places",
    "prices",
    "media",
    "people",
    "retations"
})
public final class Feed 
{
	@XmlElement(		required = true, name = "title")
    protected String title = "";
	public void setTitle( String o )		{ this.title = o; }
	public String getTitle() 				{ return this.title; }
	
	@XmlElement(		required = true, name = "id")
    protected String id = "";
	public void setId( String o )			{ this.id = Ess.uuid( o, "FEEDID:" ); }
	public String getId() 					{ return this.id; }
	
	@XmlElement(		required = true, name = "access")
    protected AccessTypes access = AccessTypes.PUBLIC;
	public void setAccess( AccessTypes o )	{ this.access = o; }
	public AccessTypes getAccess() 			{ return this.access; }
	
	@XmlElement(		required = true, name = "description")
    protected String description;
	public void setDescription( String o )	{ this.description = "<[CDATA[" + o + "]]>"; }
	public String getDescription() 			{ return this.description; }
	
	@XmlElement(		required = true, name = "published")
    protected Date published;
	public void setPublished( Date o )		{ this.published = o; }
	public Date getPublished() 				{ return this.published; }
	
	@XmlElement(		required = false, name = "updated")
    protected Date updated;
	public void setUpdated( Date o )		{ this.updated = o; }
	public Date getUpdated() 				{ return this.updated; }
	
	@XmlElementWrapper(	required = false, name = "tags")
	@XmlElement(required = true, name = "tag")
	protected List<String> tags;
	public void setTags( List<String> o )	{ this.tags = o; }
	public List<String> getTags() 			{ return this.tags; }
	
	
	
	// --- complex elements ---
	
	@XmlElementWrapper(	required = true, name = "categories")
	@XmlElement(		required = true, name = "item")
    protected List<CategoryItem> categories;
	public void setCategories( List<CategoryItem> o )	{ this.categories = o; }
	public List<CategoryItem> getCategories() 			{ return this.categories; }
	
	@XmlElementWrapper(	required = true, name = "dates")
	@XmlElement(		required = true, name = "item")
	protected List<DateItem> dates;
	public void setDates( List<DateItem> o )			{ this.dates = o; }
	public List<DateItem> getDates() 					{ return this.dates; }
	
	@XmlElementWrapper(	required = true, name = "places")
	@XmlElement(		required = true, name = "item")
	protected Places places;
	public void setPlaces( List<PlaceItem> o )			{ this.places = o; }
	public List<PlaceItem> getPlaces() 					{ return this.places; }
	
	@XmlElementWrapper(	required = true, name = "prices")
	@XmlElement(		required = true, name = "item")
	protected Prices prices;
	public void setPrices( List<PriceItem> o )			{ this.prices = o; }
	public List<PriceItem> getPrices() 					{ return this.prices; }
	
	@XmlElementWrapper(	required = false, name = "media")
	@XmlElement(		required = true, name = "item")
	protected Media media;
	public void setMedia( List<MediaItem> o )			{ this.media = o; }
	public List<MediaItem> getMedia() 					{ return this.media; }
	
	@XmlElementWrapper(	required = false, name = "people")
	@XmlElement(		required = true, name = "item")
	protected People people;
	public void setPeople( List<PeopleItem> o )			{ this.people = o; }
	public List<PeopleItem> getPeople() 				{ return this.people; }
	
	@XmlElementWrapper(	required = false, name = "relations")
	@XmlElement(		required = true, name = "item")
	protected Relations relations;
	public void setRelations( List<RelationItem> o )	{ this.relations = o; }
	public List<RelationItem> getRelations() 			{ return this.relations; }
	
}
