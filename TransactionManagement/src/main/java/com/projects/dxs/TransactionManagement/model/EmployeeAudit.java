package com.projects.dxs.TransactionManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import javax.annotation.processing.Generated;

@Entity
@Data
public class EmployeeAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
