package com.openduty.spring.springboot.entities;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestEmployee {

    String first_name = "Linh";
    String last_name = "Tran";

    Employee employee = new Employee();

    @Test
    public void testGetName() {
        System.out.println("Inside the testGetName()");
        employee.setFirstName("Linh");
        employee.setLastName("Tran");
        assertEquals(employee.getFirstName(), first_name);
        assertEquals(employee.getLastName(), last_name);
    }
}
