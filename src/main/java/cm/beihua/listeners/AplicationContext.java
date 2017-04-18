package cm.beihua.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class AplicationContext implements ServletContextListener {

	Logger logger = Logger.getLogger(AplicationContext.class);
	

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		logger.info("服务器启动了..........");
		
	}

}
