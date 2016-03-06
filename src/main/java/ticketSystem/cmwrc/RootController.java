package ticketSystem.cmwrc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ticketSystem.cmwrc.dao.ticketInfoDao;
import ticketSystem.cmwrc.model.TicketRow;

/***************************************************************************
 * This Controller is the one that is invoked when the User
 * first interacts with the System. It gets the Ticket Prices,
 * Populates a Model Object and redirects the User to the Main Ticketing Page
 **************************************************************************/
@Controller
public class RootController {
	@Autowired
	ticketInfoDao tDao;
	List<TicketRow> ticketRows;
	@RequestMapping(value = "/ticketsale", method = RequestMethod.GET)
    public String root(ModelMap model) {
    	
		 //Test Code
		 tDao.findEventByName("test");
		 int eventId =1;
		 //The argument is not being used. It is the EventId. Get the Prices for the Event
		 ticketRows = tDao.getTicketRows(eventId);
		 model.addAttribute("ticketRows", ticketRows);
		 
		 System.out.println(ticketRows.get(0).getAdultTicketPrice());
		 //Redierct to the Welcome Page after populating Model Object
		 return "welcome";

    }
    
    public static void main(String[] args)
	 {
		 ticketInfoDao tDao = new ticketInfoDao();
		 tDao.findEventByName("test");
	 }
}
