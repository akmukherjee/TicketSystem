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
	
	private int adultSatFront;
	private int childSatFront;
	private int youthSatFront;
	
	private int adultSunFront;
	private int childSunFront;
	private int youthSunFront;
	
	private int adultBothFront;
	private int childBothFront;
	private int youthBothFront;
	
	private int adultSatBack;
	private int childSatBack;
	private int youthSatBack;
	
	private int adultSunBack;
	private int childSunBack;
	private int youthSunBack;
	
	private int adultBothBack;
	private int childBothBack;
	private int youthBothBack;
	
	private int totalPayment;
	
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
	public int getAdultSatFront() {
		return adultSatFront;
	}
	public void setAdultSatFront(int adultSatFront) {
		this.adultSatFront = adultSatFront;
	}
	public int getChildSatFront() {
		return childSatFront;
	}
	public void setChildSatFront(int childSatFront) {
		this.childSatFront = childSatFront;
	}
	public int getYouthSatFront() {
		return youthSatFront;
	}
	public void setYouthSatFront(int youthSatFront) {
		this.youthSatFront = youthSatFront;
	}
	public int getAdultSunFront() {
		return adultSunFront;
	}
	public void setAdultSunFront(int adultSunFront) {
		this.adultSunFront = adultSunFront;
	}
	public int getChildSunFront() {
		return childSunFront;
	}
	public void setChildSunFront(int childSunFront) {
		this.childSunFront = childSunFront;
	}
	public int getYouthSunFront() {
		return youthSunFront;
	}
	public void setYouthSunFront(int youthSunFront) {
		this.youthSunFront = youthSunFront;
	}
	public int getAdultBothFront() {
		return adultBothFront;
	}
	public void setAdultBothFront(int adultBothFront) {
		this.adultBothFront = adultBothFront;
	}
	public int getChildBothFront() {
		return childBothFront;
	}
	public void setChildBothFront(int childBothFront) {
		this.childBothFront = childBothFront;
	}
	public int getYouthBothFront() {
		return youthBothFront;
	}
	public void setYouthBothFront(int youthBothFront) {
		this.youthBothFront = youthBothFront;
	}
	public int getAdultSatBack() {
		return adultSatBack;
	}
	public void setAdultSatBack(int adultSatBack) {
		this.adultSatBack = adultSatBack;
	}
	public int getChildSatBack() {
		return childSatBack;
	}
	public void setChildSatBack(int childSatBack) {
		this.childSatBack = childSatBack;
	}
	public int getYouthSatBack() {
		return youthSatBack;
	}
	public void setYouthSatBack(int youthSatBack) {
		this.youthSatBack = youthSatBack;
	}
	public int getAdultSunBack() {
		return adultSunBack;
	}
	public void setAdultSunBack(int adultSunBack) {
		this.adultSunBack = adultSunBack;
	}
	public int getChildSunBack() {
		return childSunBack;
	}
	public void setChildSunBack(int childSunBack) {
		this.childSunBack = childSunBack;
	}
	public int getYouthSunBack() {
		return youthSunBack;
	}
	public void setYouthSunBack(int youthSunBack) {
		this.youthSunBack = youthSunBack;
	}
	public int getAdultBothBack() {
		return adultBothBack;
	}
	public void setAdultBothBack(int adultBothBack) {
		this.adultBothBack = adultBothBack;
	}
	public int getChildBothBack() {
		return childBothBack;
	}
	public void setChildBothBack(int childBothBack) {
		this.childBothBack = childBothBack;
	}
	public int getYouthBothBack() {
		return youthBothBack;
	}
	public void setYouthBothBack(int youthBothBack) {
		this.youthBothBack = youthBothBack;
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
	public void setPmtRadioCC(String pmtRadio) {
		this.pmtRadio = pmtRadio;
	}
	
	public TicketDataModel(String firstName, String lastName, String email,
			String phone, String addressL1, String addressL2, String city,
			String state, String zip, int adultSatFront, int childSatFront,
			int youthSatFront, int adultSunFront, int childSunFront,
			int youthSunFront, int adultBothFront, int childBothFront,
			int youthBothFront, int adultSatBack, int childSatBack,
			int youthSatBack, int adultSunBack, int childSunBack,
			int youthSunBack, int adultBothBack, int childBothBack,
			int youthBothBack, int totalPayment, String pmtRadioCC,
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
		this.adultSatFront = adultSatFront;
		this.childSatFront = childSatFront;
		this.youthSatFront = youthSatFront;
		this.adultSunFront = adultSunFront;
		this.childSunFront = childSunFront;
		this.youthSunFront = youthSunFront;
		this.adultBothFront = adultBothFront;
		this.childBothFront = childBothFront;
		this.youthBothFront = youthBothFront;
		this.adultSatBack = adultSatBack;
		this.childSatBack = childSatBack;
		this.youthSatBack = youthSatBack;
		this.adultSunBack = adultSunBack;
		this.childSunBack = childSunBack;
		this.youthSunBack = youthSunBack;
		this.adultBothBack = adultBothBack;
		this.childBothBack = childBothBack;
		this.youthBothBack = youthBothBack;
		this.totalPayment = totalPayment;
		this.pmtRadio = pmtRadio;
		
	}
	public TicketDataModel() {
		//super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
}