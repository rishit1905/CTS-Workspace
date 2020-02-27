<%-- <%@page import="java.time.LoacalDate"%> --%>
<%@page import="java.time.LocalDate"%>



<html>
<head>

<title>Home Page</title>
<link rel="stylesheet" href="css/site.css" />

</head>

<body>
	<header>

		<h3 style="text-align: right">
			<%=LocalDate.now()%>


		</h3>
		
		<nav>
				<a href="home">HOME</a>
				<a href="hello">HELLO</a>
				<a href="visitor">VISITOR page</a>
		
		</nav>

		<h1>${appTitle}</h1>

	</header>