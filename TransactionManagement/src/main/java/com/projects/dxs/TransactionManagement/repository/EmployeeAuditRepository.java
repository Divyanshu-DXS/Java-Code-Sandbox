package com.projects.dxs.TransactionManagement.repository;

import com.projects.dxs.TransactionManagement.model.EmployeeAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAuditRepository extends JpaRepository<EmployeeAudit, Integer> {
}
