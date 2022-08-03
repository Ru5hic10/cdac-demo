async function doGetEmps(deptIdVal){
	let response = await fetch("api/emps/" + deptIdVal);
	if(response.ok)
		return await response.json();
	if(response.status == 404)
		return "No Employees found for Dept";
	return "Internal Server Error";
}

async function doPostOrder(customerIdVal, productNoVal, quantityVal) {
	const request = {
		method: 'post',
		headers: {'Content-Type': 'application/json'},
		body: JSON.stringify({
			customerId: customerIdVal,
			productNo: new Number(productNoVal),
			quantity: new Number(quantityVal)
		})
	};
	let response = await fetch("api/orders/", request);
	if(response.ok) {
		let result = await response.json();
		return "New order number is " + result.orderNo;
	}
	return "Order Failed";

}

