package ticketSystem.cmwrc.model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TicketDetailsModel implements RowMapper<TicketDetailsModel>,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String TicketCode;
	private int adultTicketCount;
	private int childTicketCount;
	private int youthTicketCount;
	
	
	
	public String getTicketCode() {
		return TicketCode;
	}



	public void setTicketCode(String ticketCode) {
		TicketCode = ticketCode;
	}



	public int getAdultTicketCount() {
		return adultTicketCount;
	}



	public void setAdultTicketCount(int adultTicketCount) {
		this.adultTicketCount = adultTicketCount;
	}



	public int getChildTicketCount() {
		return childTicketCount;
	}



	public void setChildTicketCount(int childTicketCount) {
		this.childTicketCount = childTicketCount;
	}



	public int getYouthTicketCount() {
		return youthTicketCount;
	}



	public void setYouthTicketCount(int youthTicketCount) {
		this.youthTicketCount = youthTicketCount;
	}



	public TicketDetailsModel mapRow(ResultSet rs, int rowNumber)
			throws SQLException {
		TicketDetailsModel tModel= new TicketDetailsModel();
		
		tModel.setTicketCode(rs.getString("ticketCode"));
		tModel.setAdultTicketCount(rs.getInt("adultTicketCount"));
		tModel.setChildTicketCount(rs.getInt("childTicketCount"));
		tModel.setYouthTicketCount(rs.getInt("youthTicketCount"));


		return tModel;
	}



	public TicketDetailsModel(String ticketCode, int adultTicketCount,
			int childTicketCount, int youthTicketCount) {
		super();
		TicketCode = ticketCode;
		this.adultTicketCount = adultTicketCount;
		this.childTicketCount = childTicketCount;
		this.youthTicketCount = youthTicketCount;
	}



	public TicketDetailsModel() {
	}
	
}
