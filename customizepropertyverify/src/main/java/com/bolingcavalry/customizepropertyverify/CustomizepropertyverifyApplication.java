package com.bolingcavalry.customizepropertyverify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bolingcavalry.customizepropertyverify.context.CustomApplicationContext;

@SpringBootApplication
public class CustomizepropertyverifyApplication {
	// org.springframework.context.support.AbstractApplicationContext
	public static void main(String[] args) {

		// Properties properties = System.getProperties();
		// Iterator it = properties.entrySet().iterator();
		// while (it.hasNext()) {
		// Entry entry = (Entry) it.next();
		// System.out.print(entry.getKey() + "=");
		// System.out.println(entry.getValue());
		// }

		System.setProperty("MYSQL_HOST", "1111");
		SpringApplication springApplication = new SpringApplication(CustomizepropertyverifyApplication.class);
		springApplication.setApplicationContextClass(CustomApplicationContext.class);
		springApplication.run(args);
	}
}
