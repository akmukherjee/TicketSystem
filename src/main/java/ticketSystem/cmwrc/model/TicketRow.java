package ticketSystem.cmwrc.model;

public class TicketRow {
	
	String ticketCode;
	String eventName;
	String ticketDescription;
	int adultTicketPrice;
	int childTicketPrice;
	int youthTicketPrice;
	public String getTicketCode() {
		return ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	public int getAdultTicketPrice() {
		return adultTicketPrice;
	}
	public void setAdultTicketPrice(int adultTicketPrice) {
		this.adultTicketPrice = adultTicketPrice;
	}
	public int getChildTicketPrice() {
		return childTicketPrice;
	}
	public void setChildTicketPrice(int childTicketPrice) {
		this.childTicketPrice = childTicketPrice;
	}
	public int getYouthTicketPrice() {
		return youthTicketPrice;
	}
	public void setYouthTicketPrice(int youthTicketPrice) {
		this.youthTicketPrice = youthTicketPrice;
	}
	public TicketRow() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
