<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Customer List</title>

<style type="text/css">

#wrapper {
        width:450px;
        font-family:Verdana, sans-serif;
    }
    
table a:link {
	color: #666;
	font-weight: bold;
	text-decoration: none;
}

table a:visited {
	color: #999999;
	font-weight: bold;
	text-decoration: none;
}

table a:active,table a:hover {
	color: #bd5a35;
	text-decoration: underline;
}

table {
	font-family: Arial, Helvetica, sans-serif;
	color: #666;
	font-size: 12px;
	text-shadow: 1px 1px 0px #fff;
	background: #eaebec;
	margin: 20px;
	border: #ccc 1px solid;
	-moz-border-radius: 3px;
	-webkit-border-radius: 3px;
	border-radius: 3px;
	-moz-box-shadow: 0 1px 2px #d1d1d1;
	-webkit-box-shadow: 0 1px 2px #d1d1d1;
	box-shadow: 0 1px 2px #d1d1d1;
}

table th {
	padding: 21px 25px 22px 25px;
	border-top: 1px solid #fafafa;
	border-bottom: 1px solid #e0e0e0;
	background: #ededed;
	background: -webkit-gradient(linear, left top, left bottom, from(#ededed),
		to(#ebebeb) );
	background: -moz-linear-gradient(top, #ededed, #ebebeb);
}

table th:first-child {
	text-align: left;
	padding-left: 20px;
}

table tr:first-child th:first-child {
	-moz-border-radius-topleft: 3px;
	-webkit-border-top-left-radius: 3px;
	border-top-left-radius: 3px;
}

table tr:first-child th:last-child {
	-moz-border-radius-topright: 3px;
	-webkit-border-top-right-radius: 3px;
	border-top-right-radius: 3px;
}

table tr {
	text-align: center;
	padding-left: 20px;
}

table tr td:first-child {
	text-align: left;
	padding-left: 20px;
	border-left: 0;
}

table tr td {
	padding: 18px;
	border-top: 1px solid #ffffff;
	border-bottom: 1px solid #e0e0e0;
	border-left: 1px solid #e0e0e0;
	background: #fafafa;
	background: -webkit-gradient(linear, left top, left bottom, from(#fbfbfb),
		to(#fafafa) );
	background: -moz-linear-gradient(top, #fbfbfb, #fafafa);
}

.customerList tr:nth-child(even) {
	background: #f6f6f6;
	background: -webkit-gradient(linear, left top, left bottom, from(#f8f8f8),
		to(#f6f6f6) );
	background: -moz-linear-gradient(top, #f8f8f8, #f6f6f6);
}

table tr:last-child td {
	border-bottom: 0;
}

table tr:last-child td:first-child {
	-moz-border-radius-bottomleft: 3px;
	-webkit-border-bottom-left-radius: 3px;
	border-bottom-left-radius: 3px;
}

table tr:last-child td:last-child {
	-moz-border-radius-bottomright: 3px;
	-webkit-border-bottom-right-radius: 3px;
	border-bottom-right-radius: 3px;
}

table tr:hover td {
	background: #f2f2f2;
	background: -webkit-gradient(linear, left top, left bottom, from(#f2f2f2),
		to(#f0f0f0) );
	background: -moz-linear-gradient(top, #f2f2f2, #f0f0f0);
}

input[type="submit"]{
        background: #222;
        border: none;
        text-shadow: 0 -1px 0 rgba(0,0,0,0.3);
        text-transform:uppercase;
        color: #eee;
        cursor: pointer;
        font-size: 15px;
        margin: 5px 0;
        padding: 5px 22px;
        -moz-border-radius: 4px;
        border-radius: 4px;
        -webkit-border-radius:4px;
        -webkit-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
        -moz-box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
        box-shadow: 0px 1px 2px rgba(0,0,0,0.3);
    }
    
    .navigateButton {
  		display: inline-block;
  		margin: 1em;
	}
</style>

</head>
<body>
	<div id="wrapper">

		<table class = "customerList" cellspacing='0'>

			<tr>
				<th>Order Number</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address Line 1</th>
				<th>Address Line 2</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Phone Number</th>
				<th>Email</th>
			</tr>
			<tbody style="td: empty{display:none">
				<c:forEach var="customer" items="${customerList}">
					<tr>
						<td data-th="Order Number">${customer.orderNumber}</td>
						<td data-th="First Name">${customer.firstName}</td>
						<td data-th="Last Name">${customer.lastName}</td>
						<td data-th="Address Line 1">${customer.address.addressLine1}</td>
						<td data-th="Address Line 2">${customer.address.addressLine2}</td>
						<td data-th="City">${customer.address.city}</td>
						<td data-th="State">${customer.address.state}</td>
						<td data-th="Country">${customer.address.country}</td>
						<td data-th="Phone Number">${customer.address.phoneNumber}</td>
						<td data-th="Email">${customer.address.emailId}</td>
						<td><input type="button" value="Delete"
							onclick="window.location='delete?id=${customer.id}'" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<form class="navigateButton" action="redirectToHome" method="get">
			<input type="submit" value="Home" />
		</form>

	</div>
</body>
</html>