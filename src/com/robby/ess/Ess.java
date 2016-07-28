package ai.robby.ess;

import java.util.Date;
import java.util.UUID;
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

import ai.robby.ess.channel.Channel;


/**
 * Universal ESS Feed Writer class
 * Generate ESS Feed v0.91 
 *                             
 * @package     ESSFeedWriter
 * @access		public
 * @author      Brice Pissard
 * @link        http://essfeed.org
 * @see			http://www.mkyong.com/java/jaxb-hello-world-example
 * @see			http://jaxb.java.net
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
		"http://www.robby.ai/api/v1/ess/aggregator.json?feed=",
		"http://..."
	};
	
	// --- [ END ] ----------------------------------------------------------------------------------------------- 
	
	
	/**
	 * ESS <ess> Default Name-Space attribute
	 */
	@XmlAttribute(required = true, name = "xmlns")
	protected String xmlns = "http://eventstandardsyndication.org/history/";
	
	/**
	 * ESS <ess> Default 'version' attribute
	 */
	@XmlAttribute(required = true, name = "version")
	protected String version = "0.9";
	
	/**
	 * ESS <ess> Default Language attribute
	 * 
	 * @see 
	 */
	@XmlAttribute(required = true, name = "lang")
	protected String lang = "en";
	
	
	
	/**
	 * ESS <ess> XML child element.
	 */
	@XmlElement(required = true, name = "channel")
	protected Channel channel;
	
	
	
	Ess()
	{
		this.setXmlns( this.xmlns + this.version );
		this.setVersion( this.version );
		this.setLang( this.lang );
		this.setGenerator( "ess:java:generator:version:" + this.version );
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
	
	
	
	
	// --- Ess Attributes ---
	
	private void setXmlns( String o ) 		{ this.xmlns = o; }
	public int getXmlns() 					{ return xmlns; }
	
	
	public void setVersion( String o ) 		{ this.version = o; }
	public String getVersion() 				{ return version; }
	
	
	public void setLang( String o ) 		{ this.lang = o; }
	public String getLang()					{ return lang; }
	
	
	
	
	// --- Ess Element ---
	
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
  		// TODO: convert key submited into UUID;
		return prefix + UUID.randomUUID().toString();
 	}
  	
  	/**
  	 * Generate current String date in ISO standard format
	 * 
	 * @access   public
	 * @return   String
	 */ 
  	public static Date getISODate( String date )
  	{
  		SimpleDateFormat formatDate = new SimpleDateFormat( "yyyy-MM-ddTHH:mm:ss" );
  		
  		return formatDate.parse( date );
  	}
}
