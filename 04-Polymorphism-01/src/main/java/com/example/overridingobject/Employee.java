package com.example.overridingobject;

import java.util.Objects;

public class Employee {

	public int empId;
	public String name;
	public String ssn;
	public double salary;

	public Employee(int empId, String name, String ssn, double salary) {
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 47 * hash + this.empId;
//        return hash;
//    }

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee other = (Employee) obj;
		if (this.empId != other.empId) {
			return false;
		}
		if (!Objects.equals(this.name, other.name)) {
			return false;
		}
		if (!Objects.equals(this.ssn, other.ssn)) {
			return false;
		}
		if (Double.doubleToLongBits(this.salary) != Double.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String toString() {
		return "Employee id:  " + empId + ", Employee name: " + name;
	}

}