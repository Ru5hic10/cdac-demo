package hr;

import java.util.*;

public class EmpEntity implements java.io.Serializable {

	private int empNo;

	private String ename;

	private Date hireDate;

	private double sal;

	private int deptNo;

	public int getEmpNo() { return empNo; }
	public void setEmpNo(int value) { empNo = value; }

	public Date getHireDate() { return hireDate; }
	public void setHireDate(Date value) { hireDate = value; }

	public String getEname() { return ename; }
	public void setEname(String value) { ename = value; }

	public int getDeptNo() { return deptNo; }
	public void setDeptNo(int value) { deptNo = value; }

	public double getSal() { return sal; }
	public void setSal(double value) { sal = value; }
}

