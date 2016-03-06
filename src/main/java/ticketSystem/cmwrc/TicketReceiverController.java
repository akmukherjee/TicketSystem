package ticketSystem.cmwrc;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticketSystem.cmwrc.dao.ticketInfoDao;
import ticketSystem.cmwrc.model.TicketDataModel;

/**************************************************************************************
 * This Controller receives the ajax Post from the Ticket Purchase and is
 * responsible for converting to a Model Object and storing it to the TicketSalesMaster
 * and TicketSalesDetails Tables and sends the shoppingCartId to the requesting Page which then redirects
 * the User to the Payment Site.
 ***********************************************************************************/

@Controller

public class TicketReceiverController {

	@Autowired
	ticketInfoDao tDao;
	@RequestMapping(value = "/ticketdata", method = RequestMethod.POST, consumes="application/json")
	public @ResponseBody String handleTicketData(@RequestBody String ticketDataModel,HttpServletRequest request,HttpServletResponse response){
    	//Convert the Data to a Model Object
    	TicketDataModel tmodel = new TicketDataModel();
        ObjectMapper mapper = new ObjectMapper();
        try {
			tmodel = mapper.readValue(ticketDataModel, TicketDataModel.class);
			System.out.println(mapper.writeValueAsString(tmodel)); 
		} catch (JsonParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //HARDCODING FOR RIGHT NOW
		 int eventId =1;
		 tmodel.setEventId(eventId);
		 
		 //Update the TicketSalesMaster Table
		 Integer cartId =tDao.addTicketData(tmodel);
		 //Update the TicketSalesDetails Table
		 tDao.addTicketDetailsData(tmodel, cartId);
		//String output = request.toString();
/*********TEST CODE TO VIEW HTTP Request Body ****************	    
 * try {
			System.out.println(extractPostRequestBody(request));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/	    //THIS IS WHERE WE PERSIST THE DATA OR SEND ERROR IF ERROR OCCURRED
		 //return "welcome";
        //response.setStatus(HttpServletResponse.SC_OK);
		 //return response.getWriter().write("cartId:"+cartId);
		 return Integer.toString(cartId);
		
	}
	// This is test code to read the Content sent from the Ticketing Page
	static String extractPostRequestBody(HttpServletRequest request) throws IOException {
	    if ("POST".equalsIgnoreCase(request.getMethod())) {
	        Scanner s = new Scanner(request.getInputStream(), "UTF-8").useDelimiter("\\A");
	        return s.hasNext() ? s.next() : "";
	    }
	    return "";
	}
	
	

}
