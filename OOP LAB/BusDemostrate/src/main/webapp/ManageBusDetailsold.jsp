<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <title>Manage Bus Details</title>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">


	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
	<link rel="stylesheet" href="style.css">

	<title>AdminHub</title>
</head>
<style>


* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

a {
	text-decoration: none;
}

li {
	list-style: none;
}

:root {
	--poppins: 'Poppins', sans-serif;
	--lato: 'Lato', sans-serif;

	--light: #F9F9F9;
	--blue: #3C91E6;
	--light-blue: #CFE8FF;
	--grey: #eee;
	--dark-grey: #AAAAAA;
	--dark: #342E37;
	--red: #DB504A;
	--yellow: #FFCE26;
	--light-yellow: #FFF2C6;
	--orange: #FD7238;
	--light-orange: #FFE0D3;
}

html {
	overflow-x: hidden;
}

body.dark {
	--light: #0C0C1E;
	--grey: #060714;
	--dark: #FBFBFB;
}

body {
	background: var(--grey);
	overflow-x: hidden;
}
.container {
    max-width: 800px;
    margin: 50px auto;
    background-color: #fff; 
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    text-align: center; 
}
.heading {
    color: blue; 
    font-size: 36px; 
}


#sidebar {
	position: fixed;
	top: 0;
	left: 0;
	width: 280px;
	height: 100%;
	background: var(--light);
	z-index: 2000;
	font-family: var(--lato);
	transition: .3s ease;
	overflow-x: hidden;
	scrollbar-width: none;
}
#sidebar::--webkit-scrollbar {
	display: none;
}
#sidebar.hide {
	width: 60px;
}
#sidebar .brand {
	font-size: 40px;
	font-weight: 700;
	height: 56px;
	display: flex;
	align-items: center;
	color: var(--blue);
	position: sticky;
	top: 0;
	left: 20;
	background: var(--light);
	z-index: 500;
	padding-bottom: 20px;
	box-sizing: content-box;
}
#sidebar .brand .bx {
	min-width: 60px;
	display: flex;
	justify-content: center;
}
#sidebar .side-menu {
	width: 100%;
	margin-top: 48px;
}
#sidebar .side-menu li {
	height: 48px;
	background: transparent;
	margin-left: 6px;
	border-radius: 48px 0 0 48px;
	padding: 4px;
}
#sidebar .side-menu li.active {
	background: var(--grey);
	position: relative;
}
#sidebar .side-menu li.active::before {
	content: '';
	position: absolute;
	width: 40px;
	height: 40px;
	border-radius: 50%;
	top: -40px;
	right: 0;
	box-shadow: 20px 20px 0 var(--grey);
	z-index: -1;
}
#sidebar .side-menu li.active::after {
	content: '';
	position: absolute;
	width: 40px;
	height: 40px;
	border-radius: 50%;
	bottom: -40px;
	right: 0;
	box-shadow: 20px -20px 0 var(--grey);
	z-index: -1;
}
#sidebar .side-menu li a {
	width: 100%;
	height: 100%;
	background: var(--light);
	display: flex;
	align-items: center;
	border-radius: 48px;
	font-size: 16px;
	color: var(--dark);
	white-space: nowrap;
	overflow-x: hidden;
}
#sidebar .side-menu.top li.active a {
	color: var(--blue);
}
#sidebar.hide .side-menu li a {
	width: calc(48px - (4px * 2));
	transition: width .3s ease;
}
#sidebar .side-menu li a.logout {
	color: var(--red);
}
#sidebar .side-menu.top li a:hover {
	color: var(--blue);
}
#sidebar .side-menu li a .bx {
	min-width: calc(60px  - ((4px + 6px) * 2));
	display: flex;
	justify-content: center;
}
#content {
	position: relative;
	width: calc(100% - 280px);
	left: 280px;
	transition: .3s ease;
}


body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box;}
 
.open-button {
  background-color: #555;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  position: fixed;
  top: 40%;
  left: 40%;
  transform: translate(-50%, -50%);
  width: 280px;
}

.open-button-view {
  background-color: #555;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  opacity: 0.8;
  position: fixed;
  top: 50%;
  left: 40%;
  transform: translate(-50%, -50%);
  width: 280px;
}



.form-popup {
  display: none;
  position: fixed;
  bottom: -20;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

.form-container {
  max-width: 400px;
  padding: 20px;
  background-color: white;
}


.form-container input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}


.form-container input[type=text]:focus{
  background-color: #ddd;
  outline: none;
}


.form-container .btn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}


.form-container .cancel {
  background-color: red;
}


.form-container .btn:hover, .open-button:hover {
  opacity: 1;
}
.form-popup-view {
  display: none;
  position: fixed;
  bottom: -20;
  right: 50px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

form-container-view {
  max-width: 400px;
  padding: 50px;
  background-color: white;
}


.form-container-view input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}


.form-container-view input[type=text]:focus{
  background-color: #ddd;
  outline: none;
}


.form-container-view .btn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}


.form-container-view .cancel {
  background-color: red;
}


.form-container-view .btn:hover, .open-button:hover {
  opacity: 1;
}

.form-popup-update {
  display: none;
  position: fixed;
  bottom: -20;
  right: 15px;
  border: 3px solid #f1f1f1;
  z-index: 9;
}

.form-container-update {
  max-width: 400px;
  padding: 20px;
  background-color: white;
}


.form-container-update input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  border: none;
  background: #f1f1f1;
}


.form-container-update input[type=text]:focus{
  background-color: #ddd;
  outline: none;
}


.form-container-update .btn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  border: none;
  cursor: pointer;
  width: 100%;
  margin-bottom:10px;
  opacity: 0.8;
}


.form-container-update .cancel {
  background-color: red;
}


.form-container-update .btn:hover, .open-button:hover {
  opacity: 1;
}



</style>
<body>


	<section id="sidebar">
		<a href="#" class="brand">
			
			<span class="text">Admin</span>
		</a>
		<ul class="side-menu top">
			<li class="active">
				<a href="http://localhost:8090/BusDemostrate/dashBoard.jsp">
					<i class='bx bxs-dashboard' ></i>
		 			<span class="text">Dashboard</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-shopping-bag-alt' ></i>
					<span class="text">My Store</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-doughnut-chart' ></i>
					<span class="text">Analytics</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-message-dots' ></i>
					<span class="text">Messages</span>
				</a>
			</li>
			<li>
				<a href="#">
					<i class='bx bxs-group' ></i>
					<span class="text">Our Team</span>
				</a>
			</li>
		</ul>
		<ul class="side-menu">
			<li>
				<a href="#">
					<i class='bx bxs-cog' ></i>
					<span class="text">Settings</span>
				</a>
			</li>
			<li>
				<a href="#" class="logout">
					<i class='bx bxs-log-out-circle' ></i>
					<span class="text">Logout</span>
				</a>
			</li>
		</ul>
	</section>
 <div class="container">
    <h2 class="heading">Manage Bus Details</h2>
</div>
<div class="table-data">
				<div class="order">
					<div class="head">
						<h3>Users</h3>
						<i class='bx bx-search' ></i>
						<i class='bx bx-filter' ></i>
					</div>
					<table>
						<thead>
							<tr>
								<th>User</th>
								<th>Date booking</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									
									<p>Nimal Perera</p>
								</td>
								<td>01-10-2021</td>
								<td><span class="status completed">Completed</span></td>
							</tr>
							<tr>
								<td>
									
									<p>Sunil Shantha</p>
								</td>
								<td>01-10-2021</td>
								<td><span class="status pending">Pending</span></td>
							</tr>
							<tr>
								<td>
									
									<p>Kamal Rathnayake</p>
								</td>
								<td>01-10-2021</td>
								<td><span class="status process">Process</span></td>
							</tr>
						
						</tbody>
					</table>
				</div>


<button class="open-button" onclick="openForm()">Add Bus</button>

<div class="form-popup" id="myForm">
  <form action="insert" class="form-container" method="post">
  <h2 style="color: #333; font-size: 24px;">Add Bus</h2>
    <label for="text"><b>BusId:</b></label>
    <input type="text" placeholder="Enter busid" name="busid" required>

    <label for="text"><b>Seat Number</b></label>
    <input type="text" placeholder="Enter seatNo" name="seatno"  required>
    
    <label for="text"><b>Owner Name</b></label>
    <input type="text" placeholder="Enter owner" name="owner" required>
    
    <label for="text"><b>Driver ID</b></label>
    <input type="text" placeholder="Enter deiverid" name="driverid"  required>

    <button type="submit" class="btn">ADD</button>
    <button type="button" class="btn cancel" onclick="closeForm()">Close</button>
  </form>
</div>

<button class="open-button-view" onclick="openFormView()">View Bus</button>
<div class="form-popup-view" id="myFormview">
  <form action="bus" class="form-container-view" method="post">
  	<h2 style="color: #333; font-size: 24px;">View Bus</h2>
  	
    <label for="text"><b>BusId:</b></label>
    <input type="text" placeholder="Enter busid" name="busid" required>
    
    <button type="submit" class="btn">View </button>
    <button type="button" class="btn cancel" onclick="closeFormView()">Cancel</button>
  </form>
</div>



<button class="open-button-update" onclick="openFormUpdate()">Update Bus</button>

<div class="form-popup-update" id="myFormupdate">
  <form action="bus" class="form-container-update" method="post">
  
  	<h2 style="color: #333; font-size: 24px;">Update Bus Details</h2>
  	
    <label for="text"><b>BusId:</b></label>
    <input type="text" placeholder="Enter busid" name="busid" value="" required>
    
    <button type="submit" class="btn">Update </button>
    <button type="button" class="btn cancel" onclick="closeFormUpdate()">Cancel</button>
  </form>
</div>

<script>

function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}

function openFormView() {
	  document.getElementById("myFormview").style.display = "block";
	}

function closeFormView() {
	  document.getElementById("myFormview").style.display = "none";
	}
function openFormUpdate() {
		  document.getElementById("myFormupdate").style.display = "block";
		}

function closeFormUpdate() {
		  document.getElementById("myFormupdate").style.display = "none";
		}	
</script>

</body>
</html>
    
