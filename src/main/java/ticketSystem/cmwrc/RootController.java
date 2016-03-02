package ticketSystem.cmwrc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ticketSystem.cmwrc.dao.ticketInfoDao;
import ticketSystem.cmwrc.model.TicketRow;

@Controller
public class RootController {
	@Autowired
	ticketInfoDao tDao;
	List<TicketRow> ticketRows;
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String root(ModelMap model) {
    	
		 
		 tDao.findEventByName("test");
		 //The argument is not being used. It is the EventId
		 ticketRows = tDao.getTicketRows(1);
		 model.addAttribute("ticketRows", ticketRows);
		 System.out.println(ticketRows.get(0).getAdultTicketPrice());
		 return "welcome";

    }
    
    public static void main(String[] args)
	 {
		 ticketInfoDao tDao = new ticketInfoDao();
		 tDao.findEventByName("test");
	 }
}
