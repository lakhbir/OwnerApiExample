
package com.singh;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({ "classpath:mainConfig.xml" })
public interface XMLConfig extends Config {
	
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
