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
	  public boolean updatePaymentRecord(Integer shoppingCartId, String authorizationCode){
		  
		    final String updateSql = "UPDATE ticketSalesMaster SET paymentAuthCode = ? WHERE shoppingCartId = ?";

		    Boolean status;
	        Object[] params = { authorizationCode, shoppingCartId};
	        int[] types = {Types.VARCHAR, Types.INTEGER};

	        int rows = jdbcTemplate.update(updateSql, params, types);
	        status = (rows>0)?true:false;
	       
	        return status;
	  }
	  public List<TicketDetailsModel> getTicketRows(int shoppingCartId){
		  List<TicketDetailsModel> rows = new ArrayList<TicketDetailsModel>();
		  final String sql = "Select ticketCode, adultTicketCount, childTicketCount, youthTicketCount from TicketSalesDetailsCopy where shoppingCartId =";
		  try{
			  rows = jdbcTemplate.query(sql+shoppingCartId,new TicketDetailsModel());
			  System.out.println("Rows returned "+rows.size());

		  }catch(DataAccessException dae){
			  dae.printStackTrace();
			  
		  }
		  
		  return rows;
		  
	  }
}
