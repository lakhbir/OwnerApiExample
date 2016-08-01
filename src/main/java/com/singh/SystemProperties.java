
package com.singh;

import org.aeonbits.owner.Config;

public interface SystemProperties extends Config {
	
		//System properties
		@Key("file.separator")  String fileSeparator();
		@Key("path.separator")  String pathSeparator();
		@Key("line.separator")  String lineSeparator();
		
		@Key("java.class.path") String javaClassPath();
    @Key("java.home")       String javaHome();
		@Key("java.vendor")     String javaVendor();
		@Key("java.vendor.url") String javaVendorUrl();
		@Key("java.version")    String javaVersion();
		
		@Key("user.home")       String userHome();
		@Key("user.dir")        String userDir();
		@Key("user.name")       String userName();
		
		@Key("os.version")      String osVersion();
		@Key("os.name")         String osName();
		@Key("os.arch")         String osArch();
		
		//Environment variables
		@Key("HOME")           String home();
    @Key("USER")           String user();
		@Key("HOSTNAME")       String hostName();
		@Key("MAIL")           String mail();
		@Key("SDK_HOME")       String sdkHome();
		
}
