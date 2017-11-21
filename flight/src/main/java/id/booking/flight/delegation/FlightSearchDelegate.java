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
import id.booking.flight.service.soap.impl.FlightSearchImplProxy;

public class FlightSearchDelegate implements JavaDelegate{
	
	private final static Logger LOGGER = Logger.getLogger("FLIGHT-SEARCH");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("Calling class id.booking.flight.delegation.FlightSearchDelegate");
		LOGGER.info("Processing request by '" + execution.getVariable("customerId") + "'...");
		
		String origin = execution.getVariable("origin").toString();
		String destination = execution.getVariable("destination").toString();

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Date departureDateMin = df.parse(execution.getVariable("departureDateMax").toString());
        Date departureDateMax = df.parse(execution.getVariable("departureDateMin").toString());

		LOGGER.info("Processing request by '" + execution.getVariable("userId") + "'...");
	    
//	    LOGGER.info("Searching flight with parameters origin: " + origin + " destination: " +
//	    		destination + " departure date: " + departureDate	 + " number of passengers: " + childPsg +
//	    		" child, " + adultPsg + " adult, " + infantPsg + " infant, class: " + flightClass);
	    FlightSearchImpl impl = new FlightSearchImplProxy();
	    Calendar boardingMin = Calendar.getInstance();
	    boardingMin.setTime(departureDateMin);
	    
	    Calendar boardingMax = Calendar.getInstance();
	    boardingMax.setTime(departureDateMin);
	    
//		Flight[] flights = impl.findFlightByBoarding(boardingMin, boardingMax, origin, destination)
	}
}
