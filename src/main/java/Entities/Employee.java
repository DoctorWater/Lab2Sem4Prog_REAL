package Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(catalog = "employees_and_tasks", name = "employee")
public class Employee {
    @Id
    @Column(name="employee_id")
    private Long id = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    private String name;
    @Column(name="date_of_birth")
    private Integer dateOfBirth;
    /*
        create table employees_and_tasks.employee
        (
            employee_id   bigint       not null,
            name          varchar(100) not null,
            date_of_birth int          null,
            constraint employee_pk
                primary key (employee_id)
        );
    */
}
