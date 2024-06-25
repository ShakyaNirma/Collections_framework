<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
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
            flex: 1; /* Take 1/3 of the container's width */
            background-image: url('image/bg_n.jpg');
            background-size: 100% auto;
			background-repeat: no-repeat;
			background-position: 50% 50%;
            position: relative;
            display: flex;
            justify-content: center;
            align-items: center;
        }
		 .gradient-overlay {
            position: absolute;
            left: 0;
            top: 0;
            height: 100%;
            width:100%; /* Cover 1/3 of the container for left side */
            background: linear-gradient(to right, rgba(255,255,250,0.2) 0%, rgba(255,255,250,0.4) 100%);
        }
          .logo {
            width: 350px; /* Adjust size as needed */
            height: 110px; /* Adjust size as needed */
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            /*
			border: 2px solid #ccc; 
            border-radius: 9px; 
            box-shadow: 4px 4px 8px rgba(0, 0, 0, 0.9); /* Box shadow for 3D effect */
			*/
            padding: 6px; /* Padding to give space around the logo */
			 z-index: 2; 
        }
        .right-side {
            flex: 2;
            /*background-color: #F2F4F4 ;*/
            padding: 20px;
			display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
			background-image: url('image/bg3.jpg'); /* Background image for right side */
            background-size: cover;
            z-index: 0; /* Send background image to the back */
        }
        .login-form {
            width: 400px;
			height: 500px;
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
		
        .signup-link {
            color: #076785;
            text-decoration: underline;
            cursor: pointer;
        }
		.social{
		font-size: 15px;
		}
        .social-icons {
            display: flex;
            justify-content: center;
        }
        .social-icons img {
            width: 30px; 
            height: 30px;
            margin: 0 5px;
			cursor: pointer;
        }
		.social-icons img:hover {
           filter: brightness(0.8); 
            transform: scale(1.1);
			
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
			margin:5px;
            background-color: #599DB2;
            color: #fff;
            border:none ;
            border-radius: 20px;
            cursor: pointer;
			font size:20px;
        }
        button:hover {
            background-color:#50819e;
			}
    </style>
</head>
<body>

<div class="container">
    <div class="left-side">
	<div class="gradient-overlay"></div>
        <img class="logo" src="image/logo.jpg" alt="Logo">
    </div>
    <div class="right-side">
	<div class="login-form" align ="center">
        <h2>Sign in</h2>
        <form action="login" method="post">
		    <input type="text" name="usertype"placeholder="User Type" required><br>
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="password" name="password" placeholder="Password" required><br><br>
            <button type="submit">Login</button>
			<div class="social">
			<p>Don't have an account? <a href="Register.jsp" class="signup-link">Sign up</a></p>
            <p>Sign up with:</p>
			</div>
            <div class="social-icons">
                <img src="image/facebook.png" alt="Facebook">
                <img src="image/social.png" alt="Google">
                <img src="image/whatsapp.png" alt="WhatsApp">
            </div>
        </form>
    </div>
</div>
</div>
 </body>
 </html>