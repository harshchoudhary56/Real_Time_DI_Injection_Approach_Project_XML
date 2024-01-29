package in.ineuron.service;

import in.ineuron.bo.CustomerBO;
import in.ineuron.dao.ICustomerDAO;
import in.ineuron.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmntService {

	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
		System.out.println("CustomerMgmtServiceImpl :: 1 param constructor --> " + dao.getClass().getName());
	}

	@Override
	public String calculateSimpleInterest(CustomerDTO customerDTO) throws Exception {
		
		float interestAmount = (customerDTO.getPrincipalAmount() * customerDTO.getRate() * customerDTO.getTime()) / 100.0f;
		
		CustomerBO customerBO = new CustomerBO();
		customerBO.setCustomerName(customerDTO.getCustomerName());
		customerBO.setCustomerAddress(customerDTO.getCustomerAddress());
		customerBO.setPrincipalAmount(customerDTO.getPrincipalAmount());
		customerBO.setRate(customerDTO.getRate());
		customerBO.setTime(customerDTO.getTime());
		customerBO.setInterestAmount(interestAmount);
		int count = dao.save(customerBO);
		
		return count == 0 ? "Customer Registration Failed" : "Customer Registration Successful ---> SimpleInterestAmount:: " + interestAmount;
	}

	@Override
	public String toString() {
		return "CustomerMgmtServiceImpl [dao=" + dao + "]";
	}

}
