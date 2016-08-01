
package com.singh;

import java.util.List;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:mainConfig.properties" })
public interface PropertyConfig extends Config {
	
	@DefaultValue("8080")				
	int port();
	
	@DefaultValue("testHost")   
	String hostname();
	
	@DefaultValue("142")        
	int maxThreads();
	
	@Key("defaultEmail")
	@DefaultValue("DefaultAdmin@yahoo.com")  
	public String defaultEmail();
	
	@Separator(";") // separator is require if using separator other than comms (,)
	@Key("emailRecipients")
	@DefaultValue("default1@yahoo.com,default2@gmail.com") 
	public List<String> emailRecipients();
	
	public String phoneNumber();
	
	
	
		
}
