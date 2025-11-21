package com.projects.dxs.TransactionManagement.service;

import com.projects.dxs.TransactionManagement.model.EmployeeAudit;
import com.projects.dxs.TransactionManagement.repository.EmployeeAuditRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeAuditService {
    @Autowired
    EmployeeAuditRepository employeeAuditRepository;

    @Transactional(value = Transactional.TxType.REQUIRES_NEW)
    public void auditLogEvent(String msg){
        EmployeeAudit employeeAudit = new EmployeeAudit();
        employeeAudit.setMsg(msg);
        employeeAuditRepository.save(employeeAudit);
    }

}
