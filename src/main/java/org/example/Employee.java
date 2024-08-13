package org.example;

public class Employee {
    private int empId;
    private String empName;
    private String eMail;

    public Employee() {
    }

    public Employee(int empId, String empName, String eMail) {
        this.empId = empId;
        this.empName = empName;
        this.eMail = eMail;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
