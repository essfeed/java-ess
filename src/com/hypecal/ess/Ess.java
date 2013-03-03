package com.hypecal.ess;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.File;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.hypecal.ess.channel.Channel;


/**
 * Universal ESS Feed Writer class
 * Generate ESS Feed v0.91 
 *                             
 * @package     ESSFeedWriter
 * @access		public
 * @author      Brice Pissard
 * @link        http://eventstandardsyndication.org
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(required=true, name="ess")
public final class Ess 
{
	// --- [ EDITABLE ] ------------------------------------------------------------------------------------------
	//
	//	You can add any ESS aggregators where you want your event to be published or/and updated.
	//
	public String[] eventAggregators = {
		'http://api.hypecal.com/v1/ess/aggregator.json?feed=',
		'http://...' 					
	}
	
	// --- [ END ] ----------------------------------------------------------------------------------------------- 
	
	
	
	Ess()
	{
		this.setXmlns( this.xmlns + this.version );
		this.setVersion( this.version );
		this.setLang( this.lang );
		this.setGenerator( 'ess:java:generator:version:' + this.version );
	}
	
	/**
	 *  Genarate the ESS File.
	 *  output pretty printed
	 * 
	 * @access  public
	 * @param 	String	file path where to store the feed generated.
	 * @param	Ess		Ess feed Object that contain all sub elements and attributes.
	 * @return  void
	 */ 
	public void genarateFeedFile( String filePath, Boolean autoPush )
	{
		try 
		{
			String 		absPath			= this.channel.getLink();
			File 		file 			= new File( filePath );
			JAXBContext jaxbContext 	= JAXBContext.newInstance( Ess.class );
			Marshaller 	jaxbMarshaller 	= jaxbContext.createMarshaller();
	 
			jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
	 
			jaxbMarshaller.marshal( this, file );
			jaxbMarshaller.marshal( this, System.out );
			
			// TODO: dispatch absPath to feeds aggregators.
			// Set autoPush to 'true' to submit changes to ESS Feed Aggregators.
			if ( autoPush == true )
			{
				
			}
		} 
		catch( JAXBException e ) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	// --- Channel's Attributes ---
	
	@XmlAttribute(required = true, name = "xmlns")
	protected String xmlns = 'http://eventstandardsyndication.org/history/';
	private void setXmlns( String o ) 		{ this.xmlns = o; }
	public int getXmlns() 					{ return xmlns; }
	
	@XmlAttribute(required = true, name = "version")
	protected String version = '0.9'; 	// ESS Default Feed's version 
	public void setVersion( String o ) 		{ this.version = o; }
	public String getVersion() 				{ return version; }
	
	@XmlAttribute(required = true, name = "lang")
	protected String lang = 'en';		// ESS Default Feed's language
	public void setLang( String o ) 		{ this.lang = o; }
	public String getLang()					{ return lang; }
	
	
	
	
	// --- Channel's Elements ---
	
	@XmlElement(required = true, name = "channel")
	protected Channel channel;
	public void setChannel( Channel o )		{ this.channel = o; }
	public Channel getChannel() 			{ return channel; }
	
	
	
	
	// --- Public Static methods
	
	/**
  	 * Generates an UUID
	 *
	 * @access	public
	 * @param	String	key string to encode as a unic ID
   	 * @param	String  [OPTIONAL] String prefix
  	 * @return  String  the formated uuid
  	 */
  	public static String uuid( String key, String prefix ) 
	{
		String chars = md5( key );
		
		String  uuid  = substr( chars, 0,8   ) + '-';
				uuid += substr( chars, 8,4   ) + '-';
				uuid += substr( chars, 12,4  ) + '-';
				uuid += substr( chars, 16,4  ) + '-';
				uuid += substr( chars, 20,12 );

		return prefix + uuid;
 	}
  	
  	/**
  	 * Generate current String date in ISO standard format
	 * 
	 * @access   public
	 * @return   String
	 */ 
  	public static Date getISODate( String date )
  	{
  		SimpleDateFormat formatDate = new SimpleDateFormat( "yyyy-MM-dd HH:ii" );
  		
  		return formatDate.parse( date );
  	}
}
