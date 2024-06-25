<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Dashboard</title>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>
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


body {
	background: var(--grey);
	overflow-x: hidden;
}
/*---------------------- sidebar ------------------------*/
#sidebar {
	position: fixed;
	top: 60px;
	left: 0;
	width: 280px;
	height: 100%;
	background: var(--light);
	background-color: #EBF4FB;
	z-index: 2000;
	font-family: var(--lato);
	transition: .3s ease;
	overflow-x: hidden;
	scrollbar-width: none;
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
    color: #007bff; 
    position: sticky;
    top: 0;
    left: 0;
    background: #f8f9fa; 
    z-index: 500;
    padding: 10px 20px; 
    box-sizing: border-box; 
    border-bottom: 2px solid #007bff; 
}

#sidebar .brand .bx {
    min-width: 100px;
    display: flex;
    justify-content: center;
    margin-right: 10px; 
}

#sidebar .brand i {
    color: #007bff; 
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
	color: var(--red);
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
#sidebar.hide ~ #content {
	width: calc(100% - 60px);
	left: 60px;
}

/*---------------------- content ------------------------*/
#content main {
    width: 100%;
    padding: 60px 24px 36px 24px; /* Adjust the padding-top value to move the content down */
    font-family: var(--poppins);
    max-height: calc(100vh - 0px);
    overflow-y: auto;
}

#content main .head-title {
	display: flex;
	align-items: center;
	justify-content: space-between;
	grid-gap: 16px;
	flex-wrap: wrap;

}

#content main .head-title .btn-download {
	height: 36px;
	padding: 0 16px;
	border-radius: 36px;
	background: var(--blue);
	color: var(--light);
	display: flex;
	justify-content: center;
	align-items: center;
	grid-gap: 10px;
	font-weight: 500;
}

#content main .box-info {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(240px, 1fr));
	grid-gap: 24px;
	margin-top: 36px;
}

#content main .box-info li .bx {
	width: 80px;
	height: 80px;
	border-radius: 10px;
	font-size: 36px;
	display: flex;
	justify-content: center;
	align-items: center;
}
#content main .box-info li:nth-child(1) .bx {
	background: var(--light-blue);
	color: var(--blue);
}
#content main .box-info li:nth-child(2) .bx {
	background: var(--light-yellow);
	color: var(--yellow);
}
#content main .box-info li:nth-child(3) .bx {
	background: var(--light-orange);
	color: var(--orange);
}

#content main .table-data {
	display: flex;
	flex-wrap: wrap;
	grid-gap: 24px;
	margin-top: 24px;
	width: 100%;
	color: var(--dark);
}
#content main .table-data > div {
	border-radius: 20px;
	background: var(--light);
	padding: 24px;
	overflow-x: auto;
}
#content main .table-data .head {
	display: flex;
	align-items: center;
	grid-gap: 16px;
	margin-bottom: 24px;
}
#content main .table-data .head h3 {
	margin-right: auto;
	font-size: 24px;
	font-weight: 600;
}
#content main .table-data .head .bx {
	cursor: pointer;
}

#content main .table-data .order {
	flex-grow: 1;
	flex-basis: 500px;
}
#content main .table-data .order table {
	width: 100%;
	border-collapse: collapse;
}
#content main .table-data .order table th {
	padding-bottom: 12px;
	font-size: 13px;
	text-align: left;
	border-bottom: 1px solid var(--grey);
}
#content main .table-data .order table td {
	padding: 10px 0;
}
#content main .table-data .order table tr td:first-child {
	display: flex;
	align-items: center;
	grid-gap: 12px;
	padding-left: 6px;
}

#content main .table-data .order table tbody tr:hover {
	background: var(--grey);
}
#content main .table-data .order table tr td .status {
	font-size: 10px;
	padding: 6px 16px;
	color: var(--light);
	border-radius: 20px;
	font-weight: 700;
}
#content main .table-data .order table tr td .status.completed {
	background: var(--blue);
}
#content main .table-data .todo {
	flex-grow: 1;
	flex-basis: 300px;
}
#content main .table-data .todo .todo-list {
	width: 100%;
}
#content main .table-data .todo .todo-list li {
	width: 100%;
	margin-bottom: 16px;
	background: var(--grey);
	border-radius: 10px;
	padding: 14px 20px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}
#content main .table-data .todo .todo-list li .bx {
	cursor: pointer;
}
#content main .table-data .todo .todo-list li.completed {
	border-left: 10px solid var(--blue);
}
#content main .table-data .todo .todo-list li.not-completed {
	border-left: 10px solid var(--red);
}
#logo
{
	height: 50px;
	width: auto;
}

#top_nav_container_main
{
	top: 0;
	display: flex;
	justify-content: space-between;
	align-items: center;
	padding: 15px;
	background-color: #ebfbfa;
	background-image: linear-gradient(to right, #EBFBFA , #EBF4FB);
	z-index: 99;
    width: 100%;
    height: 54px;
    position: fixed;
}

#nav_links_container a
{
	text-decoration: none;
    padding: 8px;
    margin: 2px;
    color: black;
}

#nav_links_container
{
	padding-right: 21px;
}

#nav_links_container a:hover
{
    /*color: #0e86d4;*/
    /*font-weight: bold;*/
    transition: transform 0.3s;
    background-color: hsl(176, 67%, 95%, 0.66);
    border-radius: 7px;
}

.hov_border
{
    position: relative; 
    /*width: 100px;
    height: 30px;
    padding: 0;*/
    border: none;
}

.hov_border::before {
    content: "";
    position: absolute;
    background-color: #F2EBFB;
    width: 0;
    height: 2.6px;
    top: 31px;
    left: 0;
    /*z-index: -1;*/
    transition: width 1s;
}

.hov_border:hover::before {
    width: 100%;
}

/*---------------------- footer ------------------------*/
#footer_container_main {
    position: fixed;
    bottom: 0;
    left: 280px; 
    width: calc(100% - 280px); 
    display: flex;
    background-color: #EBF4FB;
    background-image: linear-gradient(to right, #EBF4FB , #F2EBFB);
    flex-direction: column;
    align-items: center;
    z-index: 999; 
}
.footer_sections
{
	/*background-color: #EBF4FB;*/
}

#footer_top
{
	width: 100%;
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    flex-wrap: nowrap;
    align-items: center;
    padding-top: 14px;
}
.footer_sections a 
{
	text-decoration: none;
	color: black;
	margin: 5px;
    display: inline-block;
}

#footer_section1
{
	padding-left: 30px;
}

#footer_section3 
{
	padding-right: 30px;
}

#social_container a 
{
	text-decoration: none;
}

#social_container img
{
	width: 30px;
	height: auto;
}

#footer_bottom
{
	text-align: center;
	padding-bottom: 8px;
}
</style>
<body>
<div id="top_nav_container_main">
		<div id="logo_container">
			<a href="index.html">
				<img src="img/logo.jpg" alt="logo" id="logo">
			</a>
		</div>
		
		<div id="nav_links_container">
			<a href="#help" class="hov_border ">Help</a>
			<a href="#" class="hov_border ">Sign up</a>
			<a href="#" class="hov_border ">Sign in</a>
		</div>
	</div>
	<section id="sidebar">
		<a href="#" class="brand">
			
			<span class="text">Admin</span>
		</a>
		<ul class="side-menu top">
			<li class="active">
				<a href="#">
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
	<section id="content">
	
		<main>
			<div class="head-title">
				<div class="left">
					
					<h1>Dashboard</h1>
				</div>
				<a href="#" class="btn-download">
					<i class='bx bxs-cloud-download' ></i>
					<span class="text">Get Reports</span>
				</a>
			</div>

			<ul class="box-info">
				<li>
					<i class='bx bxs-calendar-check' ></i>
					<span class="text">
						<a href="http://localhost:8090/Buss/ManageBus.jsp"> Manage Buses</a>
					</span>
				</li>
				<li>
					<i class='bx bxs-group' ></i>
					<span class="text">
						<a href="http://localhost:8090/Buss/ManageUserDetails.jsp">Manage Users</a>
					</span>
				</li>
				<li>
					<i class='bx bxs-dollar-circle' ></i>
					<span class="text">
						<a href="http://localhost:8090/Buss/ManageBookingDetails.jsp">Manage Bookings</a>
					</span>
				</li>
			</ul>
<div class="table-data">
				<div class="order">
					<div class="head">
						<h3>Recent Bookings</h3>
						<i class='bx bx-search' ></i>
						<i class='bx bx-filter' ></i>
					</div>
					<table>
						<thead>
							<tr>
								<th>Passengers</th>
								<th>Date booking</th>
								<th>Status</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									
									<p>Sunil Fernando</p>
								</td>
								<td>26-05-2024</td>
								<td><span class="status completed">Completed</span></td>
							</tr>
							<tr>
								<td>
									
									<p>Nimal Aberathna</p>
								</td>
								<td>23-05-2024</td>
								<td><span class="status completed">Completed</span></td>
							</tr>
							<tr>
								<td>
									
									<p>Kamal Rathnayake</p>
								</td>
								<td>20-05-2024</td>
								<td><span class="status completed">Completed</span></td>
							</tr>
					
						
						
						</tbody>
					</table>
				</div>
				<div class="todo">
					<div class="head">
						<h3>To do</h3>
						<i class='bx bx-plus' ></i>
						<i class='bx bx-filter' ></i>
					</div>
					<ul class="todo-list">
						<li class="completed">
							<p>Generate Reports</p>
							<i class='bx bx-dots-vertical-rounded' ></i>
						</li>
						
						<li class="not-completed">
							<p>Manage accounts</p>
							<i class='bx bx-dots-vertical-rounded' ></i>
						</li>
						<li class="completed">
							<p>Feedback</p>
							<i class='bx bx-dots-vertical-rounded' ></i>
						</li>
						
					</ul>
				</div>
			</div>
			<div id="footer_container_main">
		
		<div id="footer_top">

			<div id="footer_section1" class="footer_sections">

				<a href="#about">About</a>
				<br>
				<a href="#help">Support</a>
				<br>
				<a href="#terms">Terms and conditions</a>
				<br>
				<a href="#privacy">Privacy Policy</a>
			</div>

			<div id="footer_section2" class="footer_sections">
				<a href="index.html">
					<img src="img/logo.jpg" alt="logo" id="logo">
				</a>
			</div>

			<div id="footer_section3" class="footer_sections">
				<a href="mailto:busswap@info.com">Busswap@info.com</a>
				<br>
				<a href="tel:+94024021258">+94 024 021 258</a>
				<br><br>

				<div id="social_container">
					
					<a href="">
						<img src="img/facebook.png" alt="facebook">
					</a>
					<a href="">
						<img src="img/instagram.png" alt="instagram">
					</a>
					<a href="">
						<img src="img/twitter.png" alt="twitter">
					</a>
					<a href="">
						<img src="img/whatsapp.png" alt="whatsapp">
					</a>
				</div>
			</div>
				
		</div>

		<div id="footer_bottom">
			<p>
				Copyright ©  BusSwap.com
			</p>
		</div>

	</div>
		</main>
	</section>
</body>
</html>
