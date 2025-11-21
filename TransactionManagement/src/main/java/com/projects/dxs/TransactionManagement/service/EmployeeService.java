package com.projects.dxs.TransactionManagement.service;

import com.projects.dxs.TransactionManagement.model.Address;
import com.projects.dxs.TransactionManagement.model.Employee;
import com.projects.dxs.TransactionManagement.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressService addressService;

    @Transactional(rollbackOn = Exception.class)
    public Employee addEmployee(Employee employee) throws Exception{
        Employee employeeSaved = this.employeeRepository.save(employee);

        // Working state
//        Address address = new Address();
//        address.setAddress("Waterloo");
//        address.setEmployee(employee);

        // Address object initialized as null
        // This below will throw an exception but if you check the database the emp_info table has the entry recorded
        Address address = null;
        address.setId(101L); // This will throw NullPointerException
        address.setAddress("Kitchener");
        address.setEmployee(employee);

//        if(employee.getName().equalsIgnoreCase("error")){
//            throw new RuntimeException("Simulated Exception: Forcing rollback!");
//        }

        this.addressService.addAddress(address);
        return employeeSaved;


    }
}
