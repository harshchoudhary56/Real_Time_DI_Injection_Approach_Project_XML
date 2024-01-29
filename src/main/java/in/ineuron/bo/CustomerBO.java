package in.ineuron.bo;

// BO -> Business Object
public class CustomerBO {
	private String customerName;
	private String customerAddress;
	private Float principalAmount;
	private Float rate;
	private Float time;
	
	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	private Float interestAmount;
	
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
	
	public Float getInterestAmount() {
		return interestAmount;
	}
	
	public void setInterestAmount(Float interestAmount) {
		this.interestAmount = interestAmount;
	}
	
}
