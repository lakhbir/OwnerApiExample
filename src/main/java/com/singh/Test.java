/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.singh;


import java.sql.Timestamp;
import java.util.Calendar;
import org.aeonbits.owner.ConfigFactory;

public class Test {
    
	 
    public static void main(String[] args) {
			try {
				
				// Load properties file
				System.out.println("------ Properties File ------------");
				PropertyConfig cfg = ConfigFactory.create(PropertyConfig.class);
				System.out.println("Host name :" + cfg.hostname() );
				System.out.println("Poart number :" + cfg.port() );
				System.out.println("Max threads :" + cfg.maxThreads());
				
				
				// Load xml file
				System.out.println("------ XML File ------------");
				XMLConfig xmlConfig = ConfigFactory.create(XMLConfig.class);
				System.out.println("Log file :" + xmlConfig.mainLogFile());
				System.out.println("Poll Max :" + xmlConfig.pollMax());
				System.out.println("Sleep Time :" + xmlConfig.sleepTime());
				System.out.println("Port  :" + xmlConfig.listenerPort());
				System.out.println("smtp host  :" + xmlConfig.smtpHost());
				
				
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
			catch(Exception e){
				e.printStackTrace();
				}
			
    }

}