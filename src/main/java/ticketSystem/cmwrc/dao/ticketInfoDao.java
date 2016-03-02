package ticketSystem.cmwrc.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.sql.*;
import java.util.Calendar;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;



import com.mysql.jdbc.log.Log;

import ticketSystem.cmwrc.model.TicketRow;

public class ticketInfoDao {
	@Autowired
	private DataSource dataSource;
	  @Autowired 
	 private JdbcTemplate jdbcTemplate;
	  //private static final Logger logger = LoggerFactory.getLogger(ticketInfoDao.class);
	 
	//NEEDS MODIFICATIONS FOR PRODUCTION.
	
	 public void setDataSource(DataSource dataSource) {
		 
		         this.dataSource = dataSource;
		 
		     }
	
	 
	 public void findEventByName(String eventName){
		 //HardCoding for Testing
		 eventName = "'GeetRamayana2016'";
		 //JdbcTemplate jdbcTemplate =new JdbcTemplate(dataSource);
			String sqlGetEventByName = "SELECT eventIDNum from eventmaster where eventIDName = ";

		 sqlGetEventByName = sqlGetEventByName+eventName;
		 System.out.println("Query is "+sqlGetEventByName);
		 int id = jdbcTemplate.queryForInt(sqlGetEventByName);
		 System.out.println("Id is "+id);
		 }
	 /**
	  * This returns a list of TicketRow Model Object 
	  * for the input eventId supplied. 
	  *
	  * @param  url  an absolute URL giving the base location of the image
	  * @return      a list of TicketRow Model Objects
	  */
	 public List<TicketRow> getTicketRows(int eventId){
		 List<TicketRow> ticketRows = new ArrayList<TicketRow>();;
		//HardCoding for Testing
		 eventId=1;
		 String eventName ="GeetRamayana2016";
		 int extraDaysInMsPerDay = 1000*60*60*24;
		 int numExtraDays =10;
		 String sqlGetTicketRows ="SELECT ticketCode, ticketDescription, adultTicketPrice, childTicketPrice,youthTicketPrice FROM ticketoptions WHERE ? BETWEEN effectiveStart AND effectiveEnd";
		 //CHANGE THIS IN DEPLOYED CODE
		 long extraDaysMs = Calendar.getInstance().getTime().getTime()+numExtraDays*extraDaysInMsPerDay;

		 java.sql.Date date = new java.sql.Date(extraDaysMs);
		 System.out.println(date);


	      List<Map<String, Object>> rows = jdbcTemplate.queryForList(sqlGetTicketRows,date);
	      System.out.println("Rows Size "+rows.size());
	      for (Map row:rows){
	    	  TicketRow ticketRow = new TicketRow();
	    	  ticketRow.setEventName(eventName);
	    	  ticketRow.setTicketCode((String)row.get("ticketCode"));
	    	  ticketRow.setTicketDescription((String)row.get("ticketDescription"));
	    	  ticketRow.setAdultTicketPrice(Integer.parseInt(String.valueOf(row.get("adultTicketPrice"))));
	    	  ticketRow.setChildTicketPrice(Integer.parseInt(String.valueOf(row.get("childTicketPrice"))));
	    	  ticketRow.setYouthTicketPrice(Integer.parseInt(String.valueOf(row.get("youthTicketPrice"))));
	    	  if(ticketRow!=null){	    	  ticketRows.add(ticketRow);
}
	    	  //System.out.println("TicketRow: "+ ticketRow);
	      }
	        

		 
		 
		 return ticketRows;
		 
	 }

}
