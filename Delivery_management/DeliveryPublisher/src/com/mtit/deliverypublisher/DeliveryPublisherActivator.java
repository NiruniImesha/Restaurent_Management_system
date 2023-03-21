package com.mtit.deliverypublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DeliveryPublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;//object to register service
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Delivery Publisher - Started");//this will display when service publisher starts
		DeliveryPublishImpl publisherService = new DeliveryPublishImpl();
		publishServiceRegistration = context.registerService(DeliveryPublish.class.getName(), publisherService, null);//register
	}
	
	public void stop(BundleContext context) throws Exception {
		System.out.println("Delivery Publisher - Stopped");//this will display when service publisher stops
		publishServiceRegistration.unregister();//unregister
	}

}
