package in.ineuron.vo;

// VO -> Value Object
public class CustomerVO {
	private String customerName;
	private String customerAddress;
	private String principalAmount;
	private String rate;
	private String time;
	
	static {
		System.out.println("CustomerVO.class file is loading...");
	}
	
	public CustomerVO() {
		System.out.println("CustomerVO object is instantiated...");
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
	
	public String getPrincipalAmount() {
		return principalAmount;
	}
	
	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
	}
	
	public String getRate() {
		return rate;
	}
	
	public void setRate(String rate) {
		this.rate = rate;
	}
	
	public String getTime() {
		return time;
	}
	

	public void setTime(String time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", principalAmount="
				+ principalAmount + ", rate=" + rate + ", time=" + time + "]";
	}
}
