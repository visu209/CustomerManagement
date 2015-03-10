<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Sample Application</h2>
	<form action="save" method="post">
		<input type="hidden" name="id"> 
		<label for="name">Order Number</label> <input type="text" id="name" name="orderNumber" /> 
		<br/>
		<label for="name">First name</label> <input type="text" id="name" name="firstName" /> 
		<br/>
		<label for="name">Last name</label> <input type="text" id="name" name="lastName" /> 
		<br/>
		<label for="name">Address Line 1</label> <input type="text" id="name" name="addressLine1" /> 
		<br/>
		<label for="name">Address Line 2</label> <input type="text" id="name" name="addressLine2" /> 
		<br/>
		<label for="name">City</label> <input type="text" id="name" name="city" /> 
		<br/>
		<label for="name">State</label> <input type="text" id="name" name="state" /> 
		<br/>
		<label for="name">Country</label> <input type="text" id="name" name="country" /> 
		<br/>
		<label for="name">Phone Number</label> <input type="text" id="name" name="phoneNumber" />
		<br/> 
		<label for="name">Email ID</label> <input type="text" id="name" name="emailId" /> 
		<br/>
		<input type="submit" value="Submit" />
	</form>
</body>
</html>