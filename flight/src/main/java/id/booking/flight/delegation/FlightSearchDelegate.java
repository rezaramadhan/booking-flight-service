package id.booking.flight.delegation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.impl.bpmn.delegate.JavaDelegateInvocation;
import id.booking.flight.entity.*;

public class FlightSearchDelegate extends JavaDelegateInvocation {

	public FlightSearchDelegate(JavaDelegate delegateInstance, DelegateExecution execution) {
		super(delegateInstance, execution);
		// TODO Auto-generated constructor stub
	}
	
	private final static Logger LOGGER = Logger.getLogger("FLIGHT-SEARCH");

	public void execute(DelegateExecution execution) throws Exception {
		String origin = execution.getVariable("origin").toString();
		String destination = execution.getVariable("destination").toString();
		Date departureDate = new Date(execution.getVariable("departureDate").toString());
		int childPsg = Integer.parseInt(execution.getVariable("childPassengers").toString());
		int adultPsg = Integer.parseInt(execution.getVariable("adultPassengers").toString());
		int infantPsg = Integer.parseInt(execution.getVariable("infantPassengers").toString());
		String flightClass = execution.getVariable("class").toString();

		LOGGER.info("Processing request by '" + execution.getVariable("userId") + "'...");
	    
	    LOGGER.info("Searching flight with parameters origin: " + origin + " destination: " +
	    		destination + " departure date: " + departureDate	 + " number of passengers: " + childPsg +
	    		" child, " + adultPsg + " adult, " + infantPsg + " infant, class: " + flightClass);

	    List<Flight> listOfFlight = searchFlight(origin, destination, departureDate, adultPsg, childPsg, infantPsg, flightClass);
	    
	}
	
	private List<Flight> searchFlight(String origin, String destination, Date departureDate, int adultPsg,
			int childPsg, int infantPsg, String flightClass) {
		LOGGER.info("Searching flight...");
		return new ArrayList();
	}

}
