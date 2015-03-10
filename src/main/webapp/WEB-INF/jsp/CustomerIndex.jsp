<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

	<title>Customer Details</title>
	
	<style type="text/css">
    #wrapper {
        width:450px;
        margin:0 auto;
        font-family:Verdana, sans-serif;
    }
    legend {
        color:#0481b1;
        font-size:16px;
        padding:0 10px;
        background:#fff;
        -moz-border-radius:4px;
        box-shadow: 0 1px 5px rgba(4, 129, 177, 0.5);
        padding:5px 10px;
        text-transform:uppercase;
        font-family:Helvetica, sans-serif;
        font-weight:bold;
    }
    fieldset {
        border-radius:4px;
        background: #fff; 
        background: -moz-linear-gradient(#fff, #f9fdff);
        background: -o-linear-gradient(#fff, #f9fdff);
        background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#fff), to(#f9fdff)); /
        background: -webkit-linear-gradient(#fff, #f9fdff);
        padding:20px;
        border-color:rgba(4, 129, 177, 0.4);
    }
    input,
    textarea {
        color: #373737;
        background: #fff;
        border: 1px solid #CCCCCC;
        color: #aaa;
        font-size: 14px;
        line-height: 1.2em;
        margin-bottom:15px;

        -moz-border-radius:4px;
        -webkit-border-radius:4px;
        border-radius:4px;
        box-shadow: 0 1px 2px rgba(0, 0, 0, 0.1) inset, 0 1px 0 rgba(255, 255, 255, 0.2);
    }
    input[type="text"],
    input[type="password"]{
        padding: 8px 6px;
        height: 30px;
        width:280px;
    }
    input[type="text"]:focus,
    input[type="password"]:focus {
        background:#f5fcfe;
        text-indent: 0;
        z-index: 1;
        color: #373737;
        -webkit-transition-duration: 400ms;
        -webkit-transition-property: width, background;
        -webkit-transition-timing-function: ease;
        -moz-transition-duration: 400ms;
        -moz-transition-property: width, background;
        -moz-transition-timing-function: ease;
        -o-transition-duration: 400ms;
        -o-transition-property: width, background;
        -o-transition-timing-function: ease;
        width: 380px;
        
        border-color:#ccc;
        box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
        opacity:0.6;
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
    textarea {
        padding:3px;
        width:96%;
        height:100px;
    }
    textarea:focus {
        background:#ebf8fd;
        text-indent: 0;
        z-index: 1;
        color: #373737;
        opacity:0.6;
        box-shadow:0 0 5px rgba(4, 129, 177, 0.5);
        border-color:#ccc;
    }
    .small {
        line-height:14px;
        font-size:12px;
        color:#999898;
        margin-bottom:3px;
    }
    .navigateButton {
  		display: inline-block;
  		margin: 1em;
	}
</style>
	
</head>
<body>
	<div id="wrapper">
	<form action="customer/save" method="post">
	<fieldset>
	<legend>Customer Details</legend>
		<input type="hidden" name="id"> 
		<div>
		<input type="text" id="orderNumber" name="orderNumber" placeholder="Order Number"/>
		</div> 
		<div>
		<input type="text" id="firstName" name="firstName" placeholder="First Name"/> 
		</div>
		<div>
		<input type="text" id="lastName" name="lastName" placeholder="Last Name"/> 
		</div>
		<div>
		<input type="text" id="addressLine1" name="addressLine1" placeholder="Address Line1"/> 
		</div>
		<div>
		<input type="text" id="addressLine2" name="addressLine2" placeholder="Address Line2"/> 
		</div>
		<div>
		<input type="text" id="city" name="city" placeholder="City"/> 
		</div>
		<div>
		<input type="text" id="state" name="state" placeholder="State"/> 
		</div>
		<div>
		<input type="text" id="country" name="country" placeholder="Country"/> 
		</div>
		<div>
		<input type="text" id="phoneNumber" name="phoneNumber" placeholder="Phone Number"/>
		</div>
		<div>
		<input type="text" id="emailId" name="emailId" placeholder="Email ID"/> 
		</div>
		<input type="submit" value="Submit" />
		</fieldset>
	</form>
	
	<form class = "navigateButton" action="customer/list" method = "get">
		<input type = "submit" value ="List Customers"/>
	</form>
	
	<form class = "navigateButton" action="customer/search" method = "get">
		<input type = "submit" value ="Search Customer"/>
	</form>
	</div>
	
</body>

</html>