package hr;

import java.util.*;

public class DeptEntity implements java.io.Serializable {

	private int deptNo;

	private String dname;

	private String loc;

	private List<EmpEntity> emps;

	public int getDeptNo() { return deptNo; }
	public void setDeptNo(int value) { deptNo = value; }

	public String getDname() { return dname; }
	public void setDname(String value) { dname = value; }

	public String getLoc() { return loc; }
	public void setLoc(String value) { loc = value; }

	public List<EmpEntity> getEmps() { return emps; }

}

