<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
       body{
            height: 100%;
            margin: 0;
            font-family: Poppins, sans-serif;
			font-size:24px;
        }
        .container {
            display: flex;
            height: 100vh; /* Full height of viewport */
        }
		.left-side {
            flex: 2;
           /* background-color: #F2F4F4 ;*/
            padding: 20px;
			display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
			background-image: url('image/bg3.jpg');
            background-size: cover;
            z-index: 0; /* Send background image to the back */
        }
		.signup-form {
			zoom: 0.8;
            width: 460px;
			height: 620px;
            padding: 20px;
            border-radius: 10px;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.5);
			position: relative; /* Ensure form stays on top of background */
            z-index: 1; /* Ensure form is above the background image */
        }
		 h2 {
            font-size: 30px;
            margin-bottom: 20px;
        }
		
        .signin-link {
            color: #076785;
            text-decoration: underline;
            cursor: pointer;
        }
		.sign-in{
		font-size: 15px;
		}
        .input-container {
            margin-bottom: 20px;
        }
        input[type="text"], input[type="password"] {
            width: 80%;
            padding: 10px;
			margin: 10px;
            border: 2px solid #ccc;
            border-radius: 9px;
            box-sizing: border-box;
        }
        button {
            width: 65%;
            padding: 10px;
			margin:20px;
            background-color:#4195d1;
            color: #fff;
            border:none ;
            border-radius: 20px;
            cursor: pointer;
			font size:20px;
        }
        button:hover{
            background-color:#fcb131;
			}
        .right-side {
			z-index: 9;
            flex: 1; /* Take 1/3 of the container's width */
            background-image: url('image/bg_n_s-removebg.png');
			background-size: 85% auto;
			background-repeat: no-repeat;
			background-position: 70% 35%;
			background-color: #DDF2F8;
            position: relative;
            display: flex;
            justify-content: center;
            align-items: center;
        }
		 .gradient-overlay {
			z-index : 1;
			zoom: 0.9;
            position: absolute;
            left: 0;
            top: 0;
            height: 100%;
            width:100%; /* Cover 1/3 of the container for left side */
			/*
            background: linear-gradient(to right, rgba(255,255,250,0.5) 0%, rgba(255,255,250,0.6) 100%);
			*/
        }
        .logo {
            width: 320px; /* Adjust size as needed */
            height: 80px; /* Adjust size as needed */
            position: absolute;
            top: 66%;
            left: 38%;
            transform: translate(-50%, -50%);
            padding: 6px; /* Padding to give space around the logo */
			 z-index: 2; 
        }
    </style>
</head>
<body>
<div class="container">
 <div class="left-side">
	<div class="signup-form" align ="center">
        <h2>Sign up</h2>
        <form action="insert" method="post">
		    <input type="text" name="Fname"placeholder="First name" required>
            <input type="text" name="Lname" placeholder="Last name" required>
			<input type="text" name="email" placeholder="Email" required>
			<input type="text" name="address" placeholder="Address" required>
			<input type="text" name="phone" placeholder="Contact" required>
			<input type="text" name="username" placeholder="Username" required>
            <input type="password" name="password" placeholder="Password" required>
			<input type="password" name="repass" placeholder="Confirm Password" required>
            <button type="submit">Create account</button>
			<div class="sign-in">
			<p>Already have an account? <a href="Login.jsp" class="signin-link">Sign in</a></p>
			</div>
        </form>
    </div>
	</div>
    <div class="right-side">
	<div class="gradient-overlay"></div>
        <img class="logo" src="image/logo.jpg" alt="Logo">
    </div>
</div>
 </body>
 </html>