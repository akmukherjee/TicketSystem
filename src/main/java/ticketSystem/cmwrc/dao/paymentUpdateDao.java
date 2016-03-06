package ticketSystem.cmwrc.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import ticketSystem.cmwrc.model.TicketDetailsModel;
import ticketSystem.cmwrc.model.TicketRow;

public class paymentUpdateDao {
	@Autowired
	private DataSource dataSource;
	  @Autowired 
	  private JdbcTemplate jdbcTemplate;
	  
		 public void setDataSource(DataSource dataSource) { 
	         this.dataSource = dataSource;
	 	     }
		 /**************************************************************************************************
		  * This method updates the TicketSalesMaster table with the authorizationCode for shoppingCartId provided. 
		  *
		  * @param  authorizationCode          The Authorization Code received from the Payment Site. 
		  * @return status  				   The Status of the Insert Query.
		  *************************************************************************************************/		 
	  public boolean updatePaymentRecord(Integer shoppingCartId, String authorizationCode){
		  
		    final String updateSql = "UPDATE ticketSalesMaster SET paymentAuthCode = ? WHERE shoppingCartId = ?";

		    Boolean status;
	        Object[] params = { authorizationCode, shoppingCartId};
	        int[] types = {Types.VARCHAR, Types.INTEGER};

	        int rows = jdbcTemplate.update(updateSql, params, types);
	        status = (rows>0)?true:false;
	       
	        return status;
	  }
		 /**************************************************************************************************
		  * This method requests the Details of the purchase for shoppingCartId provided. 
		  *
		  * @param  shoppingCartId           The shopping Cart entry made into the TicketSalesMaster Table. 
		  * @return List<TicketDetailsModel> A List object containing the Tickets purchased for this event.	  
		  *************************************************************************************************/	  
	  public List<TicketDetailsModel> getTicketRows(int shoppingCartId){
		  List<TicketDetailsModel> rows = new ArrayList<TicketDetailsModel>();
		  final String sql = "Select ticketCode, adultTicketCount, childTicketCount, youthTicketCount from TicketSalesDetails where shoppingCartId =";
		  try{
			  rows = jdbcTemplate.query(sql+shoppingCartId,new TicketDetailsModel());
			  System.out.println("Rows returned "+rows.size());

		  }catch(DataAccessException dae){
			  dae.printStackTrace();
			  
		  }
		  
		  return rows;
		  
	  }
}
