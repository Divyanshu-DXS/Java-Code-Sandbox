package com.projects.dxs.TransactionManagement.Controller;

import com.projects.dxs.TransactionManagement.model.Employee;
import com.projects.dxs.TransactionManagement.service.EmployeeService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    // Basic Rollback demo -- >
    @GetMapping("/basicDemo")
    public String save2EmployeesAndFail(){
        try{employeeService.save2EmployeesAndForceFail();}
        catch (Exception e){ return "Runtime Exception occured";}
        return "done";
    }

    // Propagation demo using REQUIRES_NEW | Transaction fails but audit log is saved
    @GetMapping("/propagationDemo")
    public String employeeAuditOperation(){
        try{
            employeeService.employeeAuditOperation();
        }catch (Exception e){
            return "Runtime exception occured !";
        }
        return "done";
    }

    // Checked exception demo: By default, checked exceptions do NOT trigger rollback
    @GetMapping("/checkedExceptionDemo")
    public String checkedExceptionRollbackDemo(){
        try{
            employeeService.checkedExceptionDemo();
        }catch (Exception e){return "Exception Occured ... ";}

        return "done";
    }

    // Checked Exception Demo: same but configured to rollback for Exception
    @GetMapping("/checkedExceptionWithRollbackDemo")
    public String checkedExceptionWithRollbackDemo(){
        try{
        employeeService.checkedExceptionWithRollbackDemo();}
        catch (Exception e){ return "Exception occurred ... ";}
        return "done";
    }
//    @GetMapping("/demo")
//    public String getemployees(){
//        employeeService.addEmployees();
//        return "done";
//    }
//
//
//    @GetMapping("/propDemo")
//    public String propDemo(){
//        try{employeeService.employeeAuditOperation();}
//        catch (Exception e){
//            return "Exception Occured ! RollBack initiated .. check DB! ";
//        }
//        return "done";
//    }

//    @PostMapping("/add")
//    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee) {
//        try {
//            Employee employeeSaved = employeeService.addEmployee(employee);
//            return ResponseEntity.ok(employeeSaved);
//        } catch (Exception e) {
//            return ResponseEntity.badRequest().body("Transaction failed: " + e.getMessage());
//        }
//    }


}
