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
		
		employeeRepository.save(new Employee(null, "erttrth", "ytryr", "rtretretr@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee(null, "rtytryry", "hfgh", "gfhfgh@gmail.com", 250 , false, new Date()));
		employeeRepository.save(new Employee(null, "hfgh", "fghfgh", "fghfgh@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "reth", "rtyrty", "tretertre@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee(null, "hjhfgh", "hfghfh", "fghfgh@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "fghfgh", "tryty", "yjhgghj@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee(null, "tertgregbh", "hfghfg", "hfghfgh@gmail.com", 150 , true, new Date()));
		employeeRepository.save(new Employee(null, "Btyu", "fgfdg", "rtterte@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "ytrytry", "dfgfdg", "hfghfghy-@gmail.com", 300 , false, new Date()));
		employeeRepository.save(new Employee(null, "fghfh", "fdgdfg", "azezet@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee(null, "dsfdss", "fdgdfg", "gfdhfdh@gmail.com", 100 , false, new Date()));
		employeeRepository.save(new Employee(null, "gfdhn", "dfgdfg", "dfgdfgdfgfdg@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "retghrtge", "rtret", "gdfnfgnfhj@gmail.com", 250 , false, new Date()));
		employeeRepository.save(new Employee(null, "dfbfgb", "hjghjj", "gdfgdfgdfgdf@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "gdfbhfgb", "tytyry", "tretretre@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee(null, "drgvbdfgb", "bvcvb", "fgvdfgbfd@gmail.com", 150 , false, new Date()));
		employeeRepository.save(new Employee(null, "drgdf", "tretegb", "retretert@gmail.com", 100 , true, new Date()));
		employeeRepository.save(new Employee(null, "drgdgb", "gbdfgh", "reterter@gmail.com", 200 , false, new Date()));
		employeeRepository.save(new Employee(null, "drggdgr", "rdtgbf", "retghrrtgertf@gmail.com", 150 , false, new Date()));
		employeeRepository.save(new Employee(null, "rtujtyuj", "tyutyut", "utydjgrdt@gmail.com", 150 , true, new Date()));
		
		employeeRepository.findAll().forEach(em -> {
			System.out.println(em.toString());
		});
		
	}

}
