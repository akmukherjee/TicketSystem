package ticketSystem.cmwrc.model;

import java.io.Serializable;

public class TicketDataModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String addressL1;
	private String addressL2;
	private String city;
	private String state;
	private String zip;
	
	private int adultSatFrontDropDown;
	private int childSatFrontDropDown;
	private int youthSatFrontDropDown;
	
	private int adultSunFrontDropDown;
	private int childSunFrontDropDown;
	private int youthSunFrontDropDown;
	
	private int adultBothFrontDropDown;
	private int childBothFrontDropDown;
	private int youthBothFrontDropDown;
	
	private int adultSatBackDropDown;
	private int childSatBackDropDown;
	private int youthSatBackDropDown;
	
	private int adultSunBackDropDown;
	private int childSunBackDropDown;
	private int youthSunBackDropDown;
	
	private int adultBothBackDropDown;
	private int childBothBackDropDown;
	private int youthBothBackDropDown;
	
	private int totalPayment;
	
	private int eventId;
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public void setPmtRadio(String pmtRadio) {
		this.pmtRadio = pmtRadio;
	}
	private String pmtRadio;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddressL1() {
		return addressL1;
	}
	public void setAddressL1(String addressL1) {
		this.addressL1 = addressL1;
	}
	public String getAddressL2() {
		return addressL2;
	}
	public void setAddressL2(String addressL2) {
		this.addressL2 = addressL2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public int getTotalPayment() {
		return totalPayment;
	}
	public void setTotalPayment(int totalPayment) {
		this.totalPayment = totalPayment;
	}
	public String getPmtRadio() {
		return pmtRadio;
	}
	
	
	
	
	
	public int getYouthSatFrontDropDown() {
		return youthSatFrontDropDown;
	}
	public void setYouthSatFrontDropDown(int youthSatFrontDropDown) {
		this.youthSatFrontDropDown = youthSatFrontDropDown;
	}
	public int getAdultSatFrontDropDown() {
		return adultSatFrontDropDown;
	}
	public void setAdultSatFrontDropDown(int adultSatFrontDropDown) {
		this.adultSatFrontDropDown = adultSatFrontDropDown;
	}
	public int getChildSatFrontDropDown() {
		return childSatFrontDropDown;
	}
	public void setChildSatFrontDropDown(int childSatFrontDropDown) {
		this.childSatFrontDropDown = childSatFrontDropDown;
	}
	public int getAdultSunFrontDropDown() {
		return adultSunFrontDropDown;
	}
	public void setAdultSunFrontDropDown(int adultSunFrontDropDown) {
		this.adultSunFrontDropDown = adultSunFrontDropDown;
	}
	public int getChildSunFrontDropDown() {
		return childSunFrontDropDown;
	}
	public void setChildSunFrontDropDown(int childSunFrontDropDown) {
		this.childSunFrontDropDown = childSunFrontDropDown;
	}
	public int getYouthSunFrontDropDown() {
		return youthSunFrontDropDown;
	}
	public void setYouthSunFrontDropDown(int youthSunFrontDropDown) {
		this.youthSunFrontDropDown = youthSunFrontDropDown;
	}
	public int getAdultBothFrontDropDown() {
		return adultBothFrontDropDown;
	}
	public void setAdultBothFrontDropDown(int adultBothFrontDropDown) {
		this.adultBothFrontDropDown = adultBothFrontDropDown;
	}
	public int getChildBothFrontDropDown() {
		return childBothFrontDropDown;
	}
	public void setChildBothFrontDropDown(int childBothFrontDropDown) {
		this.childBothFrontDropDown = childBothFrontDropDown;
	}
	public int getYouthBothFrontDropDown() {
		return youthBothFrontDropDown;
	}
	public void setYouthBothFrontDropDown(int youthBothFrontDropDown) {
		this.youthBothFrontDropDown = youthBothFrontDropDown;
	}
	public int getAdultSatBackDropDown() {
		return adultSatBackDropDown;
	}
	public void setAdultSatBackDropDown(int adultSatBackDropDown) {
		this.adultSatBackDropDown = adultSatBackDropDown;
	}
	public int getChildSatBackDropDown() {
		return childSatBackDropDown;
	}
	public void setChildSatBackDropDown(int childSatBackDropDown) {
		this.childSatBackDropDown = childSatBackDropDown;
	}
	public int getYouthSatBackDropDown() {
		return youthSatBackDropDown;
	}
	public void setYouthSatBackDropDown(int youthSatBackDropDown) {
		this.youthSatBackDropDown = youthSatBackDropDown;
	}
	public int getAdultSunBackDropDown() {
		return adultSunBackDropDown;
	}
	public void setAdultSunBackDropDown(int adultSunBackDropDown) {
		this.adultSunBackDropDown = adultSunBackDropDown;
	}
	public int getChildSunBackDropDown() {
		return childSunBackDropDown;
	}
	public void setChildSunBackDropDown(int childSunBackDropDown) {
		this.childSunBackDropDown = childSunBackDropDown;
	}
	public int getYouthSunBackDropDown() {
		return youthSunBackDropDown;
	}
	public void setYouthSunBackDropDown(int youthSunBackDropDown) {
		this.youthSunBackDropDown = youthSunBackDropDown;
	}
	public int getAdultBothBackDropDown() {
		return adultBothBackDropDown;
	}
	public void setAdultBothBackDropDown(int adultBothBackDropDown) {
		this.adultBothBackDropDown = adultBothBackDropDown;
	}
	public int getChildBothBackDropDown() {
		return childBothBackDropDown;
	}
	public void setChildBothBackDropDown(int childBothBackDropDown) {
		this.childBothBackDropDown = childBothBackDropDown;
	}
	public int getYouthBothBackDropDown() {
		return youthBothBackDropDown;
	}
	public void setYouthBothBackDropDown(int youthBothBackDropDown) {
		this.youthBothBackDropDown = youthBothBackDropDown;
	}

	public TicketDataModel(String firstName, String lastName, String email,
			String phone, String addressL1, String addressL2, String city,
			String state, String zip, int adultSatFrontDropDown,
			int childSatFrontDropDown, int youthSatFrontDropDown,
			int adultSunFrontDropDown, int childSunFrontDropDown,
			int youthSunFrontDropDown, int adultBothFrontDropDown,
			int childBothFrontDropDown, int youthBothFrontDropDown,
			int adultSatBackDropDown, int childSatBackDropDown,
			int youthSatBackDropDown, int adultSunBackDropDown,
			int childSunBackDropDown, int youthSunBackDropDown,
			int adultBothBackDropDown, int childBothBackDropDown,
			int youthBothBackDropDown, int totalPayment, int eventId,
			String pmtRadio) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.addressL1 = addressL1;
		this.addressL2 = addressL2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.adultSatFrontDropDown = adultSatFrontDropDown;
		this.childSatFrontDropDown = childSatFrontDropDown;
		this.youthSatFrontDropDown = youthSatFrontDropDown;
		this.adultSunFrontDropDown = adultSunFrontDropDown;
		this.childSunFrontDropDown = childSunFrontDropDown;
		this.youthSunFrontDropDown = youthSunFrontDropDown;
		this.adultBothFrontDropDown = adultBothFrontDropDown;
		this.childBothFrontDropDown = childBothFrontDropDown;
		this.youthBothFrontDropDown = youthBothFrontDropDown;
		this.adultSatBackDropDown = adultSatBackDropDown;
		this.childSatBackDropDown = childSatBackDropDown;
		this.youthSatBackDropDown = youthSatBackDropDown;
		this.adultSunBackDropDown = adultSunBackDropDown;
		this.childSunBackDropDown = childSunBackDropDown;
		this.youthSunBackDropDown = youthSunBackDropDown;
		this.adultBothBackDropDown = adultBothBackDropDown;
		this.childBothBackDropDown = childBothBackDropDown;
		this.youthBothBackDropDown = youthBothBackDropDown;
		this.totalPayment = totalPayment;
		this.eventId = eventId;
		this.pmtRadio = pmtRadio;
	}
	public TicketDataModel() {
		//super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
}