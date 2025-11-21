package com.projects.dxs.TransactionManagement.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emp_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
