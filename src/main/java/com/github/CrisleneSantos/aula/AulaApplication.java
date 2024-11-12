package com.github.CrisleneSantos.aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.CrisleneSantos.entities.Employee;
import com.github.CrisleneSantos.service.SalaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication(scanBasePackages = "com.github.CrisleneSantos")
public class AulaApplication implements CommandLineRunner {
	
	@Autowired
	private SalaryService salaryService;
	

	/*public AulaApplication(SalaryService salaryService) {
		super();
		this.salaryService = salaryService;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Maria", 4000.00);
		System.out.println(salaryService.netSalary(employee));
		System.out.println("oi");
		
	}

}
