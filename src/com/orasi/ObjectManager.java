
package com.orasi;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.*;
import org.openqa.selenium.*;
import com.orasi.datasource.*;


public class ObjectManager {
  private static final ObjectManager singleton = new ObjectManager();
  
  public static final ObjectManager instance() {
    return singleton;
  }
  
  private final Map<String,ByFactory> objectMap = new HashMap<>( 10 );
  
  private ObjectManager() {
    ByFactoryCollection bC = null;
    /*
    Site: www.facebook.com
    Add a description of www.facebook.com
    */
    /* Page: Facebook  log in or sign up 
    
    */

    

bC = new ByFactoryCollection("email", "32438.2917", "");
bC.add( new ByFactory( ByXPath.class, "//input[@type='text']", "AttributeRule", "32438.2919", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@type='text']", "AttributeRule", "32438.2921", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@class='inputtext _55r1 _6luy']", "AttributeRule", "32438.2923", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='inputtext _55r1 _6luy']", "AttributeRule", "32438.2925", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@data-testid='royal-email']", "AttributeRule", "32438.2927", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@data-testid='royal-email']", "AttributeRule", "32438.2929", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@placeholder='Email address or phone number']", "AttributeRule", "32438.2931", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@placeholder='Email address or phone number']", "AttributeRule", "32438.2933", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@autofocus='1']", "AttributeRule", "32438.2935", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@autofocus='1']", "AttributeRule", "32438.2937", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@aria-label='Email address or phone number']", "AttributeRule", "32438.2939", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@aria-label='Email address or phone number']", "AttributeRule", "32438.2941", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@id=\"email\"]", "IDRule", "32438.2943", "" ) );
bC.add( new ByFactory( ById.class, "email", "IDRule", "32438.2945", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@id=\"email\"]", "IDRule", "32438.2947", "" ) );
bC.add( new ByFactory( ByXPath.class, "//input[@name=\"email\"]", "NameRule", "32438.2949", "" ) );
bC.add( new ByFactory( ByName.class, "email", "NameRule", "32438.2951", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@name=\"email\"]", "NameRule", "32438.2953", "" ) );


objectMap.put( "32438.2917", bC );


bC = new ByFactoryCollection("fb_logo_8ilhimg", "32438.2966", "");
bC.add( new ByFactory( ByXPath.class, "//img[@class='fb_logo _8ilh img']", "AttributeRule", "32438.2968", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='fb_logo _8ilh img']", "AttributeRule", "32438.2970", "" ) );
bC.add( new ByFactory( ByXPath.class, "//img[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']", "AttributeRule", "32438.2972", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@src='https://static.xx.fbcdn.net/rsrc.php/y1/r/4lCu2zih0ca.svg']", "AttributeRule", "32438.2974", "" ) );
bC.add( new ByFactory( ByXPath.class, "//img[@alt='Facebook']", "AttributeRule", "32438.2976", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@alt='Facebook']", "AttributeRule", "32438.2978", "" ) );
bC.add( new ByFactory( ByXPath.class, "//div[@class='_8ice']/img[1]", "ParentRule[AttributeRule]", "32438.2980", "" ) );
bC.add( new ByFactory( ByXPath.class, "//*[@class='_8ice']/img[1]", "ParentRule[AttributeRule]", "32438.2982", "" ) );
bC.add( new ByFactory( ByXPath.class, "/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]", "AbsoluteRule", "32438.2984", "" ) );


objectMap.put( "32438.2966", bC );
/* Page: default 
    
    */

    /*
    Site: www.google.com
    Add a description of www.google.com
    */
    /* Page: Google 
    
    */

    



  }
  
  public By getObject( Object alchemyIdentifier, Map<String,Object> contextMap, DataSourceProvider dM ) {
    
    if ( alchemyIdentifier instanceof By ) {
      return (By) alchemyIdentifier;
    }
    
    ByFactory by = objectMap.get( alchemyIdentifier + "" );
    if ( by == null ) {
      return new By() {
        @Override
        public List<WebElement> findElements(SearchContext sc) {
          throw new RuntimeException( "Could not find and object using [" + alchemyIdentifier + "]" );
        }
      };
    }
    return by.create(contextMap, dM);
  }

  public ByFactory getObject( String alchemyIdentifier ) {
   
    return objectMap.get( alchemyIdentifier );
  }
}
