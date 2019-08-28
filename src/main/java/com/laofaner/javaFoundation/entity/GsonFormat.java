package com.laofaner.javaFoundation.entity;

import java.util.List;

/**
 * @BelongsProject: JavaSourceCodeLearning
 * @BelongsPackage: LombokTests.entity
 * @Author: fanyuzhuo
 * @CreateTime: 2019-03-31 00:23
 * @Description: ${Description}
 * @Version 1.0
 */
public class GsonFormat {

    private List<EmployeesBean> employees;

    public List<EmployeesBean> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeesBean> employees) {
        this.employees = employees;
    }

    public static class EmployeesBean {
        /**
         * firstName : Bill
         * lastName : Gates
         */

        private String firstName;
        private String lastName;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }
}
