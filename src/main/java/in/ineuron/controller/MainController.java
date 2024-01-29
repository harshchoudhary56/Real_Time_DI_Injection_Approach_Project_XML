package in.ineuron.controller;

import in.ineuron.dto.CustomerDTO;
import in.ineuron.service.ICustomerMgmntService;
import in.ineuron.vo.CustomerVO;

public class MainController {
	
	private ICustomerMgmntService service;
	
	public MainController(ICustomerMgmntService service) {
		this.service = service;
		System.out.println("MainController :: one param constructor --> " + service.getClass().getName());
	}


	public String processCustomer(CustomerVO vo) {
		
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setCustomerName(vo.getCustomerName());
		customerDTO.setCustomerAddress(vo.getCustomerAddress());
		customerDTO.setPrincipalAmount(Float.parseFloat(vo.getPrincipalAmount()));
		customerDTO.setRate(Float.parseFloat(vo.getRate()));
		customerDTO.setTime(Float.parseFloat(vo.getTime()));
		
		String result = "";
		try {
			result = service.calculateSimpleInterest(customerDTO);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "MainController [service=" + service + "]";
	}
}
