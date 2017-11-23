package id.booking.flight.delegation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;
import id.booking.flight.entity.*;
import id.booking.flight.service.soap.impl.FlightSearchImpl;
//import id.booking.flight.service.soap.impl.FlightSearchImplProxy;

public class FlightSearchDelegate implements JavaDelegate{
	
	private final static Logger LOGGER = Logger.getLogger("FLIGHT-SEARCH");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.FlightSearchDelegate");
		LOGGER.info("Processing request by '" + execution.getVariable("customerId") + "'...");
		
		int origin = Integer.parseInt(execution.getVariable("origin").toString());
		int destination = Integer.parseInt(execution.getVariable("destination").toString());
		System.out.println("origin" + origin);
		System.out.println("origin" + destination);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Date departureDateMin = df.parse(execution.getVariable("departureDateMax").toString());
        Date departureDateMax = df.parse(execution.getVariable("departureDateMin").toString());
        System.out.println("datemin" + departureDateMin);
        System.out.println("datemax" + departureDateMax);
		LOGGER.info("Processing request by '" + execution.getVariable("userId") + "'...");
	    
//	    LOGGER.info("Searching flight with parameters origin: " + origin + " destination: " +
//	    		destination + " departure date: " + departureDate	 + " number of passengers: " + childPsg +
//	    		" child, " + adultPsg + " adult, " + infantPsg + " infant, class: " + flightClass);
	    FlightSearchImpl impl = new FlightSearchImpl();
//	    Calendar boardingMin = Calendar.getInstance();
//	    boardingMin.setTime(departureDateMin);
//	    
//	    Calendar boardingMax = Calendar.getInstance();
//	    boardingMax.setTime(departureDateMin);

		Flight[] flights = impl.findFlightByBoarding(departureDateMin, departureDateMax, new Airport(origin), new Airport(destination));
		
		if (flights != null && flights.length != 0) 
			execution.setVariable("flightId", flights[0].getId());
		else
			execution.setVariable("flightId", 1);
	}
}
