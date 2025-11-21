package com.projects.dxs.TransactionManagement.service;

import com.projects.dxs.TransactionManagement.model.Address;
import com.projects.dxs.TransactionManagement.model.Employee;
import com.projects.dxs.TransactionManagement.repository.EmployeeAuditRepository;
import com.projects.dxs.TransactionManagement.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.Nested;
import org.springframework.data.mapping.AccessOptions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressService addressService;

    @Autowired
    EmployeeAuditService employeeAuditService;

    // Basic Rollback demo -- >
    @Transactional
    public void save2EmployeesAndForceFail(){
        employeeRepository.save(new Employee("Dev"));
        System.out.println("Employee 1 - Saved");

        employeeRepository.save(new Employee("DXS"));
        System.out.println("Employee 2 - Saved");

        if(true){
            throw new RuntimeException("Runtime Exception Occurred ! Forced to analyze behavior ");
        }
    }

    // Propagation demo using REQUIRES_NEW | Transaction fails but audit log is saved
    @Transactional
    public void employeeAuditOperation(){
        Employee employee = new Employee();
        employee.setName("Gary");
        employeeRepository.save(employee);
        System.out.println("Employee saved ... inside employeeAuditOperation()");

        // introducing another function here that has @Transactional
        employeeAuditService.auditLogEvent("Employee log saved");
        System.out.println("Employee audit Log saved .. ");

        // forcing an error
        throw new RuntimeException("Forced a runtime exception to check propagation behaviour");
    }

    // Checked exception demo: By default, checked exceptions do NOT trigger rollback
    @Transactional
    public void checkedExceptionDemo() throws Exception {
        employeeRepository.save(new Employee("Checked_EX .. default "));
        System.out.println("Employee Saved! .... inside checkedExceptionDemo()");

        // throw a checked exception
        throw new Exception("Checked exception - default behavior is NO rollback");
    }

    // Checked Exception Demo: same but configured to rollback for Exception
    @Transactional(rollbackOn = Exception.class)
    public void checkedExceptionWithRollbackDemo() throws Exception {
        employeeRepository.save(new Employee("Checked_EX /w RollBack"));
        System.out.println("Employee Saved! .... inside checkedExceptionWithRollbackDemo()");
        throw new Exception("Checked exception but rollbackFor=Exception => rolls back");
    }

    //    @Transactional(rollbackOn = Exception.class)
//    public Employee addEmployee(Employee employee) throws Exception{
//        Employee employeeSaved = this.employeeRepository.save(employee);
//
//        // Working state
////        Address address = new Address();
////        address.setAddress("Waterloo");
////        address.setEmployee(employee);
//
//        // Address object initialized as null
//        // This below will throw an exception but if you check the database the emp_info table has the entry recorded
//        Address address = null;
//        address.setId(101L); // This will throw NullPointerException
//        address.setAddress("Kitchener");
//        address.setEmployee(employee);
//
////        if(employee.getName().equalsIgnoreCase("error")){
////            throw new RuntimeException("Simulated Exception: Forcing rollback!");
////        }
//
//        this.addressService.addAddress(address);
//        return employeeSaved;
//
//    }
}
