
package com.singh;

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
		
}
