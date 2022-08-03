package hrms;

import hr.*;
import java.rmi.*;
import java.util.*;

public interface HrManager extends Remote {

	List<hr.DeptEntity> fetchDepts() throws RemoteException;
	List<hr.EmpEntity> fetchEmployees(int dno) throws RemoteException;
}

