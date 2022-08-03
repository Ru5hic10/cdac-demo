package modern.web.app;

import hrms.HrManager;
import hr.*;
import java.rmi.*;
import java.util.*;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/emps")
public class HrManagerAPI {

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response readEmployees(@PathParam("id") int deptno) {
		try{
			var stub = (HrManager)Naming.lookup("rmi://localhost:6000/hrManager");
			var employees = stub.fetchEmployees(deptno);
			if(employees.size() == 0)
				return Response.status(404).build();
			return Response.ok(employees).build();
		}catch(Exception e){
			return Response.status(500).build();
		}
	}
/*
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createOrder(OrderEntity info) {
		try{
			var stub = (OrderManager)Naming.lookup("rmi://localhost:6000/orderManager");
			int orderNo = stub.placeOrder(info.getCustomerId(), info.getProductNo(), info.getQuantity());
			info.setOrderNo(orderNo);
			return Response.ok(info).build();
		}catch(Exception e){
			return Response.status(500).build();
		}
	}*/
}

