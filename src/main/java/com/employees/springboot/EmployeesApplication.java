package com.employees.springboot;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employees.springboot.model.Employee;
import com.employees.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeesApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		employeeRepository.save(new Employee("erttrth", "ytryr", "rtretretr@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee("rtytryry", "hfgh", "gfhfgh@gmail.com", 250 , false, new Date()));
		employeeRepository.save(new Employee("hfgh", "fghfgh", "fghfgh@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("reth", "rtyrty", "tretertre@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee("hjhfgh", "hfghfh", "fghfgh@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("fghfgh", "tryty", "yjhgghj@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee("tertgregbh", "hfghfg", "hfghfgh@gmail.com", 150 , true, new Date()));
		employeeRepository.save(new Employee("Btyu", "fgfdg", "rtterte@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("ytrytry", "dfgfdg", "hfghfghy-@gmail.com", 300 , false, new Date()));
		employeeRepository.save(new Employee("fghfh", "fdgdfg", "azezet@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee("dsfdss", "fdgdfg", "gfdhfdh@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee("gfdhn", "dfgdfg", "dfgdfgdfgfdg@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("retghrtge", "rtret", "gdfnfgnfhj@gmail.com", 250 , false, new Date()));
		employeeRepository.save(new Employee("dfbfgb", "hjghjj", "beterterytrhhzadnekouei@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("gdfbhfgb", "tytyry", "tretretre@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee("drgvbdfgb", "bvcvb", "fgvdfgbfd@gmail.com", 150 , false, new Date()));
		employeeRepository.save(new Employee("drgdf", "tretegb", "retretert@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee("drgdgb", "gbdfgh", "reterter@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee("drggdgr", "rdtgbf", "retghrrtgertf@gmail.com", 150 , false, new Date()));
		employeeRepository.save(new Employee("rtujtyuj", "tyutyut", "utydjgrdt@gmail.com", 150 , true, new Date()));
		
		
	}

}
