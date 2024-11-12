package com.github.CrisleneSantos.service;

import org.springframework.beans.factory.annotation.Autowired;
/*import com.github.CrisleneSantos.service.TaxService;
import com.github.CrisleneSantos.service.PensionService;*/
import org.springframework.stereotype.Service;
import com.github.CrisleneSantos.entities.Employee;


@Service
public class SalaryService {
	
	@Autowired
	private TaxService taxService;
	@Autowired
    private PensionService pensionService;
    
   /* public SalaryService(TaxService taxService, PensionService pensionService) {
    	this.taxService = taxService;
    	this.pensionService = pensionService;
    	
    }*/
    
	public double netSalary(Employee employee) {
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
		
	}

}