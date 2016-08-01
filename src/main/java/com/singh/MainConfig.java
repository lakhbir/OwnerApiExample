
package com.singh;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.aeonbits.owner.Config.Sources;

@LoadPolicy(LoadType.MERGE)
@Sources({ "classpath:mainConfig.properties",
					 "classpath:mainConfig.xml"})
public interface MainConfig extends Config {
	
	
	// ============  Properties file
	@DefaultValue("8080")
	int port();
	
	@DefaultValue("testHost")
	String hostname();
	
	@DefaultValue("142")
	int maxThreads();
	
	// ============== XML file
	@DefaultValue("8080")
	@Key("config.listenerPort")
  int listenerPort();
	
	@DefaultValue("8")
	@Key("config.pollMax")
  int pollMax();
	
	@DefaultValue("testHost")
	@Key("config.mainLogFile")
	String mainLogFile();
	
	@DefaultValue("142")
	@Key("config.defaultThreadSleepTime")
	int sleepTime();
	
	@Key("config.email.smtpHost")
	String smtpHost();
	
	
	
		
}
