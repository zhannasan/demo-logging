package dev.console;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import dev.service.*;

public class App {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	public static void main(String[] args) {
		LOG.info("Bonjour Slf4J !");
		LOG.info("Implementation Logback");
		System.out.println("Bonjour Slf4J !");
		System.out.println("Implementation Logback");
		
		String p = "C'est la premiere execution";
		AppService appS= new AppService();
		appS.executer(p);
	}

}
