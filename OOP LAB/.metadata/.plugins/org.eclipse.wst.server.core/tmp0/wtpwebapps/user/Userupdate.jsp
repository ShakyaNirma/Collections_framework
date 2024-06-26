<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Details</title>
	<!--<style>
	body{
	         display:flex;
	         justify-content:center;
	         min-height:100vh;
	         background-color:#1F9583;
			 background-image: url('image/bg1.jpg');
	}
	.wrapper{
	        font-family: Poppins,sans-serif;
	        margin-top:100px;
		    width:420px;
			height:500px;
		    background:rgba(255, 255, 255, 0.39);
		    color:black;
			border: 5px ridge #843579; 
            border-radius: 15px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.9);
            text-align: center;
	} 
	.form-container {
	       padding: 20px;
    }
	
    input[type="text"], input[type="password"], button {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            box-sizing: border-box;
            border: 2px solid black;
			font-size: 17px;
            border-radius: 25px;
            outline: none;
			background: transparent;
        }
	input::placeholder{
	       color:black;
	}
    button {
	       font-weight:1;
	       margin-top: 20px;
           background-color: rgba(255, 255, 255, 0.7);
            color: black;
            border: 2.3px solid black;
            border-radius: 25px;
            padding: 12px 20px;
            cursor: pointer;
            transition: background-color 0.3s ease, border-color 0.3s ease;
        }
    button:hover {
            background-color:#d968e3;
        }
	</style>   --> 
</head>
<body>

    <%
       String id = request.getParameter("id");
       String fname = request.getParameter("fname");  
       String lname = request.getParameter("lname");  
       String email = request.getParameter("email");  
       String address = request.getParameter("address");  
       String phone = request.getParameter("phone");  
       String username = request.getParameter("username");
       String password = request.getParameter("password");
    %>
    
<div class="wrapper">
 <div class="form-container">
        <form action="update" method="post">
        <table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cusid" value="<%= id %>" readonly></td>
		</tr>
		 <tr>
			<td>Fist Name</td>
			<td><input type="text" name="fname" value="<%= fname %>"></td>
		</tr>
		 <tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%= lname %>"></td>
		</tr>
		<tr>
		    <td>Email</td>
		    <td><input type="text" name="email" value="<%= email %>"></td>
	    </tr>
	    <tr>
		    <td>User name</td>
		    <td><input type="text" name="address" value="<%= address %>"></td>
	    </tr>
	    <tr>
		    <td>Phone number</td>
		    <td><input type="text" name="phone" value="<%= phone %>"></td>
	    </tr>
	    <tr>
		    <td>User name</td>
		    <td><input type="text" name="uname" value="<%= username %>"></td>
	   </tr>
	   <tr>
		   <td>Password</td>
		   <td><input type="password" name="pass" value="<%= password %>"></td>
	  </tr>		
	  </table>
	 <br>
	 <input type="submit" name="submit" value="Update My Data"> 
     </form>
        <h2>Update Details</h2>
        <form action="update" method="post">
           <input type="text" name="Fname"placeholder="Fist name" required><br>
            <input type="text" name="Lname" placeholder="Last name" required><br>
			<input type="text" name="email" placeholder="Email" required><br>
			<input type="text" name="address" placeholder="Address" required><br>
			<input type="text" name="phone" placeholder="Contact" required><br>
            <button type="submit">Confirm</button>
        </form>
    </div>
</div>
</body>
</html>