package in.ineuron.dto;

public class CustomerDTO {
	private String customerName;
	private String customerAddress;
	private Float principalAmount;
	private Float rate;
	private Float time;
	
	static {
		System.out.println("CustomerDTO.class file is loading...");
	}
	
	public CustomerDTO() {
		System.out.println("CustomerDTO object in instantiated... ");
	}
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public Float getPrincipalAmount() {
		return principalAmount;
	}
	
	public void setPrincipalAmount(Float principalAmount) {
		this.principalAmount = principalAmount;
	}
	
	public Float getRate() {
		return rate;
	}
	
	public void setRate(Float rate) {
		this.rate = rate;
	}
	
	public Float getTime() {
		return time;
	}
	
	public void setTime(Float time) {
		this.time = time;
	}
	
}
