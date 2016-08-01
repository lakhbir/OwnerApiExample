/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.singh;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import org.aeonbits.owner.ConfigFactory;

public class Test {
    
	 
		private static void propertiesFile(){
			// Load properties file
				System.out.println("------ Properties File ------------");
				PropertyConfig cfg = ConfigFactory.create(PropertyConfig.class);
				System.out.println("Host name :" + cfg.hostname() );
				System.out.println("Poart number :" + cfg.port() );
				System.out.println("Max threads :" + cfg.maxThreads());
				
				System.out.println("defaultEmail :" + cfg.defaultEmail());
				
				List<String> emailRecipients = cfg.emailRecipients();
				for(String s : emailRecipients){
					System.out.println("Recipient :" + s);
				}
				
				System.out.println("phoneNumber :" + cfg.phoneNumber());
				
				
		}
		
		private static void propertyAndXmlFile(){
			//Load from main (xml and properties file mix)
				System.out.println("------ Mix File ------------");
				MainConfig mainConfig = ConfigFactory.create(MainConfig.class);
				System.out.println("Host name :" + mainConfig.hostname() );
				System.out.println("Poart number :" + mainConfig.port() );
				System.out.println("Max threads :" + mainConfig.maxThreads());
				
				System.out.println("Log file :" + mainConfig.mainLogFile());
				System.out.println("Poll Max :" + mainConfig.pollMax());
				System.out.println("Sleep Time :" + mainConfig.sleepTime());
				System.out.println("Port  :" + mainConfig.listenerPort());
				System.out.println("smtp host  :" + mainConfig.smtpHost());
				
				
		}
	
		private static void xmlFile(){
			// Load xml file
				System.out.println("------ XML File ------------");
				XMLConfig xmlConfig = ConfigFactory.create(XMLConfig.class);
				System.out.println("Log file :" + xmlConfig.mainLogFile());
				System.out.println("Poll Max :" + xmlConfig.pollMax());
				System.out.println("Sleep Time :" + xmlConfig.sleepTime());
				System.out.println("Port  :" + xmlConfig.listenerPort());
				System.out.println("smtp host  :" + xmlConfig.smtpHost());
		}
		
		private static void SystemProperties(){
			System.out.println("------ System Properties ------------");
			SystemProperties systemConfig = ConfigFactory.create(SystemProperties.class,System.getProperties(),System.getenv());
			System.out.println("fileSeparator :" + systemConfig.fileSeparator());
			System.out.println("home :" + systemConfig.home());
			System.out.println("javaHome :" + systemConfig.javaHome());
			System.out.println("javaClassPath :" + systemConfig.javaClassPath());
			System.out.println("javaVendor :" + systemConfig.javaVendor());
			System.out.println("javaVendorUrl :" + systemConfig.javaVendorUrl());
			System.out.println("javaVersion :" + systemConfig.javaVersion());
			System.out.println("osArch :" + systemConfig.osArch());
			System.out.println("osName :" + systemConfig.osName());
			System.out.println("osVersion :" + systemConfig.osVersion());
			
			System.out.println("------ Environemnt Properties ------------");
			System.out.println("HOME :" + systemConfig.user());
			System.out.println("USER :" + systemConfig.user());
			System.out.println("HOST_NAME :" + systemConfig.hostName());
			System.out.println("MAIL :" + systemConfig.mail());
			System.out.println("SDK_HOME :" + systemConfig.sdkHome());
		}
		
		private static void printAllEnvironmentVariables(){
			System.out.println("------ printAllEnvironmentVariables Properties ------------");
			Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                              envName,
                              env.get(envName));
        }
		}
		
		
    public static void main(String[] args) {
			try {
				propertiesFile();
				//xmlFile();
				//propertyAndXmlFile();
				//SystemProperties();
				//printAllEnvironmentVariables();
			} 
			catch(Exception e){
				e.printStackTrace();
				}
			
    }

}