java-ess
========

Generate ESS XML feed with a JAVA Object
The com.hypecal.com Package allow to generate ESS feed.

To use this JAVA Package a complete example is available in EssSample.java



## Usage

	package com.hypecal.ess;
	 
	import java.util.ArrayList;
 	import java.util.List;
 	
 	import com.hypecal.ess.Ess;
 	import com.hypecal.ess.channel.Channel;
 	import com.hypecal.ess.channel.feed.Feed;
 	import com.hypecal.ess.channel.feed.AccessTypes;
 	import com.hypecal.ess.channel.feed.Country;
 	import com.hypecal.ess.channel.feed.authors.AuthorItem;
 	import com.hypecal.ess.channel.feed.authors.AuthorTypes;
 	import com.hypecal.ess.channel.feed.categories.CategoryItem;
 	import com.hypecal.ess.channel.feed.categories.CategoryTypes;
 	import com.hypecal.ess.channel.feed.dates.DateItem;
 	import com.hypecal.ess.channel.feed.dates.DateTypes;
 	import com.hypecal.ess.channel.feed.dates.DateUnits;
 	import com.hypecal.ess.channel.feed.people.PeopleItem;
 	import com.hypecal.ess.channel.feed.people.PeopleTypes;
 	import com.hypecal.ess.channel.feed.places.PlaceItem;
 	import com.hypecal.ess.channel.feed.places.PlaceTypes;
 	import com.hypecal.ess.channel.feed.prices.PriceCurrencies;
 	import com.hypecal.ess.channel.feed.prices.PriceItem;
 	import com.hypecal.ess.channel.feed.prices.PriceModes;
 	import com.hypecal.ess.channel.feed.prices.PriceTypes;
 	import com.hypecal.ess.channel.feed.prices.PriceUnits;
 	import com.hypecal.ess.channel.feed.media.MediaItem;
 	import com.hypecal.ess.channel.feed.media.MediaTypes;
 	import com.hypecal.ess.channel.feed.relations.RelationItem;
 	import com.hypecal.ess.channel.feed.relations.RelationTypes; 
 	 
 	
 	public final class EssSample 
 	{
	 	public static void main( String[] args ) 
	 	{
			Ess ess = new Ess();
			ess.setLang( "en" );
			ess.setVersion( "0.9" );
			
				Channel channel = new Channel();
				channel.setTitle( 		"ESS Feed" );
				channel.setLink( 		"http://example.com/feeds/events.ess" ); // must be unique, it define the ESSID across all event's feeds.
				channel.setPublished( 	Ess.getISODate( "2013-04-22 10:30" );
				channel.setUpdated(		Ess.getISODate( "2013-04-22 10:30" );
				channel.setRights( 		"Copyright (c) ESS Java Generator." );
				
				// -- Instanciate variables used by severals Event's Feeds --
				Feed 				feed 			= new Feed();
				List<Feed> 			feedsList 		= new ArrayList<Feed>();
				List<String> 		tagsList		= new ArrayList<String>();
				CategoryItem 		category 		= new CategoryItem();
				List<CategoryItem> 	categoriesList	= new ArrayList<CategoryItem>();
				DateItem 			date	 		= new DateItem();
				List<DateItem> 		datesList		= new ArrayList<DateItem>();
				PlaceItem 			place	 		= new PlaceItem();
				List<PlaceItem> 	placesList		= new ArrayList<PlaceItem>();
				PriceItem 			price	 		= new PriceItem();
				List<PriceItem> 	pricesList		= new ArrayList<PriceItem>();
				MediaItem 			media	 		= new MediaItem();
				List<MediaItem> 	mediaList		= new ArrayList<MediaItem>();
				PeopleItem 			people	 		= new PeopleItem();
				List<PeopleItem> 	peopleList		= new ArrayList<PeopleItem>();
				AuthorItem 			author	 		= new AuthorItem();
				List<AuthorItem> 	authorsList		= new ArrayList<AuthorItem>();
				RelationItem 		relation 		= new RelationItem();
				List<RelationItem> 	relationsList	= new ArrayList<RelationItem>();
				
					// -------------------------------------------------------------
					// -- Event 01 -------------------------------------------------
					// -------------------------------------------------------------
					feed.setTitle( 			"Football match every saturdays" ); // must be unique, it define the EVENTID across all events (IF THE EVENT URI IS NOT DEFINED).
					feed.setUri( 			"http://sample.com/events/specific-and-unique-event-page" ); // must be unique, it define the EVENTID across all events.
					feed.setPublished( 		Ess.getISODate( "2013-04-22 10:30" ) );
					feed.setUpdated( 		Ess.getISODate( "2013-04-22 10:30" ) );
					feed.setAccess( 		AccessTypes.PUBLIC );
					feed.setDescription(	"Welcome to my first football match event.\n <b>This football</b> match is very important.\nAs our team meets the main competitor of the league." );
						
						// -- Tags ------------------------------------------------
						tagsList.add( 		"Sport" );
						tagsList.add( 		"Football" );
						tagsList.add( 		"match" );
					feed.setTags( tagsList );
						
						// -- Categories ------------------------------------------
						category.setType( 	CategoryTypes.COMPETITION );
						category.setName( 	"Football match" );
						category.setId( 	"C2AH" );
						categoriesList.add( category );
					feed.setCategories( categoriesList );
						
						// -- Dates -----------------------------------------------
						date.setType( 		DateTypes.STANDALONE );
						date.setName(		"Match Date" );
						date.getStart(		Ess.getISODate( "2013-10-25 15:30" ) );
						date.setDuration(	7200 ); // 2 hours = 7200 seconds
						datesList.add( date ); // add date 01
						date = new DateItem();
						date.setType( 		DateTypes.RECURRENT );
						date.setUnit( 		DateUnits.WEEK );
						date.setName(		"Match Date" );
						date.getStart(		Ess.getISODate( "2013-10-25 15:30" ) );
						date.setDuration(	7200 ); // 2 hours = 7200 seconds
						datesList.add( date ); // add date 02
					feed.setDates( datesList );
					
						// -- Places ----------------------------------------------
						place.setType( 			PlaceTypes.FIXED );
						place.setCountry(   	Country.getByCode( "US" ).getName() );
						place.setCountry_code(	Country.getByCode( "US" ).getAlpha2() );
						place.setName(			"NY Stadium" );
						place.setLatitude(		40.71675 ); 
						place.setLongitude(		-74.00674 ); 
						place.setAddress(		"Ave of Americas, 871" ); 
						place.setCity(			"New York" ); 
						place.setZip(			"10001" ); 
						place.setState(			"New York" ); 
						place.setState_code(	"NY" );
						placesList.add( place );
					feed.setPlaces( placesList );
					
						// -- Prices -----------------------------------------------
						price.setType( 			PriceTypes.STANDALONE );
						price.setMode( 			PriceModes.FREE );
						price.setPriority(		1 );
						price.setName(			"Free Entrance" );
						price.setValue(			0 );
						pricesList.add( price ); // add price 01
						price = new PriceItem();
						price.setType( 			PriceTypes.STANDALONE );
						price.setMode( 			PriceModes.FIXED );
						price.setPriority(		2 );
						price.setName(			"Entrance with VIP access" );
						price.setValue(			10 );
						price.setCurrency(		PriceCurrencies.USD.getCode() );
						price.setUri(			"http://payment.com/api?mode=entrance&price=10" );
						pricesList.add( price ); // add price 02
						price = new PriceItem();
						price.setType( 			PriceTypes.RECURRENT );
						price.setMode( 			PriceModes.FIXED );
						price.setUnit(   		PriceUnits.MONTH );
						price.setPriority(		3 );
						price.setName(			"Monthly subscription" );
						price.setValue(			20 );
						price.setCurrency(		PriceCurrencies.USD.getCode() );
						price.setStart(			Ess.getISODate( "2013-10-25 00:00" ) );
						price.setUri(			"http://payment.com/api?mode=monthly&price=20" );
						pricesList.add( price ); // add price 03
					feed.setPrices( pricesList );
					
						// -- Media -----------------------------------------------
						media.setType( 			MediaTypes.IMAGE );
						media.setName(			"The image" );
						media.setUri(			"http://example.com/image.png" );
						media.setPriority(		1 );
						mediaList.add( media ); // add media 01
						media = new MediaItem();
						media.setType( 			MediaTypes.SOUND );
						media.setName(			"The sound" );
						media.setUri(			"http://example.com/sound.mp3" );
						media.setPriority(		2 );
						mediaList.add( media ); // add media 02
						media = new MediaItem();
						media.setType( 			MediaTypes.VIDEO );
						media.setName(			"The video" );
						media.setUri(			"http://example.com/video.mp4" );
						media.setPriority(		3 );
						mediaList.add( media ); // add media 03
						media = new MediaItem();
						media.setType( 			MediaTypes.WEBSITE );
						media.setName(			"The website" );
						media.setUri(			"http://example.com/" );
						media.setPriority(		4 );
						mediaList.add( media ); // add media 04
					feed.setMedia( mediaList );
					
						// -- People -----------------------------------------------
						people.setType(			PeopleTypes.ORGANIZER );
						people.setName(			"The Football Club Association" );
						people.setFirstname(	"John" );
						people.setLastname(		"Doe" );
						people.setOrganization( "Football AC" );
						people.setLogo(			"http://example.com/logo_120x60.png" );
						people.setIcon(			"http://example.com/icon_64x64.png" );
						people.setUri(			"http://example.com" );
						people.setAddress(		"Ave of Americas, 875" );
						people.setCity(			"New York" );
						people.setZip(			"10001" );
						people.setState(		"New York" );
						people.setState_code(	"NY" );
						people.setCountry(   	Country.getByCode( "US" ).getName() );
						people.setCountry_code(	Country.getByCode( "US" ).getAlpha2() );
						people.setEmail(		"contact@example.com" );
						people.setPhone(		"+001 (646) 225-9987" );
						peopleList.add( people ); // add organizer to people list
						people = new PeopleItem();
						people.setType(			PeopleTypes.PERFORMER );
						people.setName(			"The main player" );
						people.setFirstname(	"Cristiano" );
						people.setLastname(		"Ronaldo" );
						peopleList.add( people ); // add performer to people list
						people = new PeopleItem();
						people.setType(			PeopleTypes.ATTENDEE );
						people.setName(			"All kind of public are welcome." );
						people.setMinpeople(	0 );
						people.setMaxpeople(	20000 );
						people.setMinage(		18 );
						peopleList.add( people ); // add attendee to people list
					feed.setPeople( peopleList );
						
						// -- Authors -----------------------------------------------
						author.setType( 		AuthorTypes.AUTHOR );
						author.setName(			"John Doe" );
						author.setEmail( 		"jdoe@example.com" );
						author.setUri( 			"http://event-provider.com" ); // must be unique, it define the AUTHORID across all event's authors
						author.setPhone( 		"+001 (646) 490-8899" );
						author.setFirstname( 	"Janette" );
						author.setLastname( 	"Doe" );
						author.setOrganization( "Football club association" );
						author.setAddress( 		"80, 5th avenue / 45st E - #504" );
						author.setCity( 		"New York" );
						author.setZip(			"10001" );
						author.setState( 		"New York" );
						author.setState_code( 	"NY" );
						author.setCountry( 		Country.getByCode( "US" ).getName() );
						author.setCountry_code( Country.getByCode( "US" ).getAlpha2() );
						authorsList.add( author );
					feed.setAuthors( authorsList );
					
						// -- Relations ---------------------------------------------
						relation.setType( 		RelationTypes.ALTERNATIVE );
						relation.setPriority(	1 );
						relation.setName( 		"Another match elswhere the same day." );
						relation.setUri( 		"http://example.com/alternative/event" ); // must be unique, it define the EVENTID across all events.
						relationsList.add( relation ); // add event relation 01
						relation = new RelationItem();
						relation.setType( 		RelationTypes.RELATED );
						relation.setPriority(	2 );
						relation.setName( 		"Art exposition about Football." );
						relation.setUri( 		"http://example.com/related/event" ); // must be unique, it define the EVENTID across all events.
						relationsList.add( relation ); // add event relation 02
						relation = new RelationItem();
						relation.setType( 		RelationTypes.ENCLOSURE );
						relation.setPriority(	3 );
						relation.setName( 		"Another event near the stadium the same day." );
						relation.setUri( 		"http://example.com/enclosure/event" ); // must be unique, it define the EVENTID across all events.
						relationsList.add( relation ); // add event relation 03
					feed.setRelations( relationsList );
					// --------------------------------------------------------------
					// -- [ end of Event 01 ] ---------------------------------------
					// --------------------------------------------------------------
				feedsList.add( feed ); // -- add Event 01 to the feed's list
				
				
				
					
					// --------------------------------------------------------------
					// -- Event 02 --------------------------------------------------
					// --------------------------------------------------------------
					feed = new Feed();
					feed.setTitle( 			"Madonna Concert" ); // must be unique, it define the EVENTID across all events (IF THE EVENT URI IS NOT DEFINED).
					feed.setUri( 			"http://sample.com/events/madona-concert-event-page" ); // must be unique, it define the EVENTID across all events.
					feed.setPublished( 		Ess.getISODate( "2013-04-22 10:30" ) );
					feed.setAccess( 		AccessTypes.PUBLIC );
					feed.setDescription(	"This is the description of the Madonna concert." );
						// -- Tags ------------------------------------------------
						tagsList = new ArrayList<String>();
						tagsList.add( 		"music" );
						tagsList.add( 		"pop" );
						tagsList.add( 		"80s" );
						tagsList.add( 		"Madonna" );
						tagsList.add( 		"concert" );
					feed.setTags( tagsList );
						// -- Categories ------------------------------------------
						categoriesList	= new ArrayList<CategoryItem>();
						category = new CategoryItem();
						category.setType( 	CategoryTypes.CONCERT );
						category.setName( 	"Rock Music" );
						category.setId( 	"M22" );
						categoriesList.add( category );
					feed.setCategories( categoriesList );
						// -- Dates -----------------------------------------------
						datesList = new ArrayList<DateItem>();
						date = new DateItem();
						date.setType( 		DateTypes.RECURRENT );
						date.setUnit( 		DateUnits.YEAR );
						date.setName(		"Yearly concert" );
						date.getStart(		Ess.getISODate( "2013-10-25 15:30" ) );
						date.setDuration(	10800 ); // 3 hours = 10800 seconds
						datesList.add( date );
					feed.setDates( datesList );
						// -- Places ----------------------------------------------
						placesList = new ArrayList<PlaceItem>();
						place = new PlaceItem();
						place.setType( 			PlaceTypes.FIXED );
						place.setCountry(   	Country.getByCode( "US" ).getName() );
						place.setCountry_code(	Country.getByCode( "US" ).getAlpha2() );
						place.setName(			"NY Stadium" );
						place.setLatitude(		40.71675 ); 
						place.setLongitude(		-74.00674 ); 
						place.setAddress(		"Ave of Americas, 871" ); 
						place.setCity(			"New York" ); 
						place.setZip(			"10001" ); 
						place.setState(			"New York" ); 
						place.setState_code(	"NY" );
						placesList.add( place );
					feed.setPlaces( placesList );
						// -- Prices -----------------------------------------------
						pricesList = new ArrayList<PriceItem>();
						price = new PriceItem();
						price.setType( 			PriceTypes.STANDALONE );
						price.setMode( 			PriceModes.FIXED );
						price.setName(			"Entrance with VIP access" );
						price.setValue(			90 );
						price.setCurrency(		PriceCurrencies.USD.getCode() );
						price.setUri(			"http://madonna.com/payment/api.do?price=90" );
						pricesList.add( price ); 
					feed.setPrices( placesList );
						// -- People -----------------------------------------------
						peopleList = new ArrayList<PeopleItem>();
						people = new PeopleItem();
						people.setType(			PeopleTypes.PERFORMER );
						people.setName(			"Madonna" );
						peopleList.add( people );
					feed.setPlaces( peopleList );
						// -- Media -----------------------------------------------
						mediaList = new ArrayList<MediaItem>();
						media = new MediaItem();
						media.setType( 			MediaTypes.IMAGE );
						media.setName(			"Foto of Madonna" );
						media.setUri(			"http://madonna.com/image.png" );
						mediaList.add( media );
					feed.setMedia( mediaList );
					// --------------------------------------------------------------
					// -- [ end of Event 02 ] ---------------------------------------
					// --------------------------------------------------------------
				feedsList.add( feed ); // -- add Event 02 to the feed's list	
				
				// ...
				
				
				
				channel.setFeed( feedsList );
			ess.setChannel( channel );
			
			
			// -- Generate the ESS Feed ----------------------------------------------
			ess.genarateFeedFile( "/var/local/www/site/feeds/events.ess", true );
		}
	}




# Contributing

Contributions to the project are welcome. Feel free to fork and improve. I accept pull requests and issues,
especially when tests are included.

# License

(The MIT License)

Copyright (c) 2013

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
'Software'), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
