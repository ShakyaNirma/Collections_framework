<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Account page</title>
    <style>
        
        body {
            margin: 0;
            padding: 0;
            font-family: Poppins, sans-serif;
        }
        .container {
            display: flex;
            flex-direction: rows;
            height: 100vh; 
        }
        .left-side {
            flex: 0.5; 
            background-image: url('image/bg14.jpg');
            background-size:cover;
            background-position: Right;
            color: #ffffff;
            padding: 20px;
			display: flex;
            flex-direction: column;
            justify-content: center; 
        }
		.label {
		   color: black;
            padding: 7px;
            border: 2px solid #fff;
			background-color: rgba(255, 255, 255, 0.95);
            cursor: pointer;
            transition: background-color 0.3s ease;
			border-radius: 40px;
			display: flex;
            justify-content: center; 
            align-items: center; 
            width: 270px; 
            height: 60px; 
        }
		 .label img {
            width: 48px; 
            height:48px; 
            margin-right: 10px; 
        }
        .label:hover {
            background-color: rgba(255, 255, 255, 0.5); 
        }
        .right-side {
            flex: 2; 
            flex-direction: column;
        }
        .navigation-bar {
		    display: flex;
            background-color:#5b7aba;
			/*border: 2pxsolid #fff;*/
            /*color: #fff;*/
            padding: 10px 20px;
			justify-content: center-right;
        }
		 .navbar-icons {
            display: flex;
			
        }
		 .navbar-icons {
            display: flex;
            align-items: center;
        }
        .navbar-icons > img {
            width: 27px; /* Adjust icon size */
            margin-left: 20px; /* Add space between icons */
            cursor: pointer;
			transition: transform 0.3s ease;
        }
         .navbar-icons > img:hover {
            transform: scale(1.1); /* Scale the icon on hover */
        }
        .icon-name {
            position: absolute;
            top: +20px; /* Position below the icon */
            left: 50%;
            transform: translateX(-50%);
            padding: 5px;
            background-color: #000000;
            color: #ffffff;
            font-size: 12px;
            border-radius: 5px;
            opacity: 0; /* Initially hidden */
            transition: opacity 0.3s ease; /* Smooth transition for opacity */
        }		
        .main-content {
            flex: 1; 
            padding: 40px;
			background-color: #D0D3D4;
			background-image:url('image/bg5.jpg');
			background-size:cover;
        }
		 .welcome-label {
		    font-family: Comic sans ms;
		    height:68px;
            padding: 15px;
            background-color: #ffffff;
            border: 4.4px groove #333333;
            border-radius: 35px;
            display: flex;
        }
		.user-icon {
		    align: center;
            width: 80px;
            height: 80px;
            margin-right: 20px;
            animation: bounce 1.5s infinite alternate;
        }
        @keyframes bounce {
            0% { transform: translateY(0); }
            100% { transform: translateY(-7px); }
        }
        h2 {
            font-size: 23px;
        }
		.form-container {
            background-color: #f9f9f9;
            padding: 16px;
            border-radius: 20px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.7);
		}
		 table {
            width: 90%;
            border-collapse: collapse;
            margin-bottom: 20px;
			margin-left: 50px;
        }
		th, td {
            padding: 10px;
            border-bottom: 1px solid #ddd;
            text-align: left;
			background-color: #f2f2f2;
        }
		.button-container {
		    width: 100%;
            display: flex;
            justify-content: flex-end; 
        }
       .button{
		    margin-left: 20px;
            padding: 10px 20px;
            background-color:#4487c9;
            color: #fff;
            border: 3px solid #737c85;
            border-radius: 25px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .button:hover {
            background-color: #737c85;
        }
		 p {
            display: flex;
            justify-content: flex-end; 
        }
    
    </style>

</head>
<body>

<div class="container">
   <div class="left-side">
       <div class="label">
	        <img src="image/profile.png" alt="Profile Icon">
            <h2>Profile</h2>
        </div>
        <br><br>
        <div class="label">
		    <img src="image/checklist.png" alt="Profile Icon">
            <h2>Bookings</h2>
        </div> 
    </div>
    <div class="right-side">
       
        <div class="navigation-bar">
		    <div class="navbar-icons">
               <img src="image/home.png" alt="Home"><span class="icon-name">Home</span>
               <img src="image/review.png" alt="Feedback"><span class="icon-name">Feedback</span>
               <img src="image/customer-service.png" alt="Contact"><span class="icon-name">Contact</span>
               <img src="image/user.png" alt="My Account"><span class="icon-name">My Account</span>
            </div>
        </div>
  
        <div class="main-content">
           <div class="welcome-label">
           <img class="user-icon" src="image/profile.gif" alt="User Icon">
               <div>
                <h2 align="center" font-size="22px" font-weight="400">Welcome! Thank you for visiting our web site.</h2>
                
               </div>
           </div><br>
           <div class="form-container">
               <h2>User Details</h2>
    
	    <table>
	    <!-- assigning the user details to new variables to transfer those data to update.jsp -->
	    <c:forEach var="ps" items="${passeDetails}">
	    
	       <c:set var="id" value="${ps.id}"/>
	       <c:set var="Fname" value="${ps.Fname}"/>
	       <c:set var="Lname" value="${ps.Lname}"/>
	       <c:set var="email" value="${ps.email}"/>
	       <c:set var="address" value="${ps.address}"/>
	       <c:set var="phone" value="${ps.phone}"/>
	       <c:set var="username" value="${ps.userName}"/>
	       <c:set var="password" value="${ps.password}"/>
	       
	       
	     <!-- showing the user details using a table -->
	       <tr>
		    <td>Customer Name</td>
		    <td>${ps.Fname} ${ps.Lname}</td>
	       </tr>
           <tr>
		    <td>Customer Email</td>
	    	<td>${ps.email}</td>
	       </tr>
	       <tr>
		    <td>Customer Phone</td>
	 	    <td>${cus.phone}</td>
	       </tr>
	       <tr>
	   	    <td>Customer Address</td>
		    <td>${ps.address}</td>
	       </tr>
	       <tr>
		    <td>Customer Contact</td>
		    <td>${ps.phone}</td>
	      </tr>

	    </c:forEach>
	    </table>
	    
	    <!-- passing the current user profile values to the Userupdate.jsp -->
	    <c:url value="Userupdate.jsp" var="userUpdate">
	    <!--  define the moving details to new variables -->
	        <c:param name="id" value="${id }"/>
	        <c:param name="fname" value="${Fname}"/>
	        <c:param name="lname" value="${Lname}"/>
            <c:param name="email" value="${email}"/>
            <c:param name="address" value="${address}"/>
            <c:param name="phone" value="${phone}"/>
            <c:param name="username" value="${username}"/>
            <c:param name="password" value="${password}"/>
	     </c:url>
	      <p>Do you want to update the details?</p>
          <div class="button-container">
          <a href="${userUpdate}">
          <input type="submit" class= "button" name="Userupdate" value="Update Details"></a>
          </div>
  
          <p>Do you want to delete the details?</p>
          <div class="button-container">
          <a href="${userUpdate}">
          <input type="submit" class= "button" name="Userdelete" value="Delete Details"></a>
          </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>