package ticketSystem.cmwrc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ticketSystem.cmwrc.dao.paymentUpdateDao;
import ticketSystem.cmwrc.model.TicketDetailsModel;

@Controller
public class PaymentResponseController {
	@Autowired
	private paymentUpdateDao paymentUpdateDao;
	
	@RequestMapping(value = "/pmtresponse", method = RequestMethod.POST)
	public String processPmtGatewayResponse(@RequestParam(value="pg_consumerorderid")String shoppingCartId,@RequestParam(value="pg_authorization_code")String authorizationCode,
											@RequestParam(value="pg_billto_postal_name_first")String firstName,@RequestParam(value="pg_billto_postal_name_last")String lastName,ModelMap model){
		/*System.out.println("pg_consumerorderid "+Integer.parseInt(shoppingCartId));
		System.out.println("pg_authorization_code "+authorizationCode);
		System.out.println("pg_billto_postal_name_first "+firstName);
		System.out.println("pg_billto_postal_name_last "+lastName);*/
		
		Integer shoppingCartIdInt= new Integer(Integer.parseInt(shoppingCartId));
		Boolean status =paymentUpdateDao.updatePaymentRecord(shoppingCartIdInt, authorizationCode);
		System.out.println("Status: "+status);
		List<TicketDetailsModel> ticketDetailsmodel= paymentUpdateDao.getTicketRows(shoppingCartIdInt);
		String name = firstName +" "+lastName;
		model.addAttribute("ticketDetails", ticketDetailsmodel);
		model.addAttribute("authorizationCode", authorizationCode);
		model.addAttribute("name", name);
		return "confirmation";
		
	}

}
