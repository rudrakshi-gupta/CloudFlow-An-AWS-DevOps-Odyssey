<%@page import="com.DB.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="all_component/allCSS.jsp" %>
<style type="text/css">
    .back-img {
        background: url("img/b.jpg");
        height: 50vh;
        width: 100%;
        background-size: cover;
        background-repeat: no-repeat;
    }
    .crd-ho:hover {
        background-color: #fcf7f7;
    }
</style>
<title>Ebook : Index</title>
</head>

<body style="background-color: #f7f7f7;">
    <%@ include file="all_component/navbar.jsp" %>
        <div class="container-fluid back-img">
            <h2 class="text-center text-danger">05EBook Management System</h2>
        </div>
        
    <%Connection conn = DBConnect.getConn();
      out.println(conn);
    %>
        
    <!-- Start Recent Book -->

	<div class="container ">
    <h3 class="text-center">Recent Book</h3>
    <div class="row">
    <%
    BookDAOImpl dao2 = new BookDAOImpl(DBConnect.getConn());
    List<BookDtls> list2 = dao2.getRecentBook();
    if (list1.isEmpty()) 
    for(BookDtls b:list2){%>

        <div class="col-md-3">
            <div class="card crd-ho">
                <div class="card-body text-center">
                    <img alt="" src="book/<%=b.getPhotoName()%>" style="width: 150px; height: 200px"
                        class="img-thumblin">
                    <p><%=b.getBookName()%></p>
                    <p><%=b.getAuthor()%></p>
                    <p>
                    <%
                    if(b.getBookCategory().equals("Old"))
                    {%>
                        Categories:<%=b.getBookCategory()%></p>
                        <div class="row">
                            <a href="" class="btn btn-danger btn-sm ml-5" name="cart">Add Cart</a>
                            <a href="" class="btn btn-success btn-sm mL-1 dtl">View Details</a>
                            <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                        </div>
    
                    <%}else{
                        Categories:<%=b.getBookcategory()%></p>
                        <div class="row">
                            <a href="" class="btn btn-danger btn-sm ml-2" name="cart">Add Cart</a>
                            <a href="" class="btn btn-success btn-sm mL-1 dtl">View Details</a>
                            <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                        </div>    
                    }
                     %>


                </div>
            </div>
        </div>


    <%}
    %>



    </div>
    <div class="text-center mt-1">
        <a herf="" class="btn btn-danger btn-sm text-white">View All</a>
        </div>
</div>
<!-- End Recent Book -->
        
    <div class="container ">
    <h3 class="text-center">New Book</h3>
    <div class="row">
        <div class="col-md-3">
            <div class="card crd-ho">
                <div class="card-body text-center">
                    <img alt="" src="book/java.jpg" style="width: 150px; height: 200px"
                        class="img-thumblin">
                    <p>Java Programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories:New</p>
                    <div class="row">
                        <a href="" class="btn btn-danger btn-sm ml-2">Add Cart</a>
                        <a href="" class="btn btn-success btn-sm mL-1">View Details</a>
                        <a href="" class="btn btn-danger btn-sm ml-1">299</a>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-3">
            <div class="card crd-ho">
                <div class="card-body text-center">
                    <img alt="" src="book/java.jpg" style="width: 150px; height: 200px"
                        class="img-thumblin">
                    <p>Java Programming</p>
                    <p>Balguruswamy</p>
                    <p>Categories:New</p>
                    <div class="row">
                        <a href="" class="btn btn-danger btn-sm ml-2"> <i class="fas fa-cart-plus"></i>Add Cart</a>
                        <a href="" class="btn btn-success btn-sm mL-1">View Details</a>
                        <a href="" class="btn btn-danger btn-sm ml-1">299</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
    <div class="text-center mt-1">
        <a herf="" class="btn btn-danger btn-sm text-white">View All</a>
        </div>
</div>
<!-- End New Book -->

<!-- Start Old Book -->

<div class="container">
    <h1 class="text-center mt-2"><i class="fa-solid fa-book"></i> Old Book</h1>
    <div class="row">
        <%
            BookDao dao2 = new BookDaoImpl(DBConnection.getConnection());
            List<BookDtls> list3 = dao2.getOldBooks();
            for (BookDtls b : list3) {
        %>
        <div class="col-md-3">
            <div class="card crd-ho">
                <div class="card-body text-center">
                    <img src="book/<%= books.getPhotoName()%>" alt="" style="width: 150px; height: 200px;" class="img-thumblin" />
                    <p></b><%= b.getBookName()%></p>
                    <p></b><%= b.getAuthor()%></p>
                    <p></b><%= b.getBookCategory()%></p>
                    <div class="row">
                        <a href="" class="btn btn-danger btn-sm ml-2" name="cart">Add Cart</a>
                        <a href="" class="btn btn-success btn-sm mL-1 dtl">View Details</a>
                        <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%></a>
                    </div>    
                </div>
            </div>
        </div>
        <%
            }
        %>
    </div>
    <div class="text-center mt-1">
        <a href="all_old_books.jsp" class="btn btn-danger btn-block text-white"> View All</a>
    </div>
</div>
<!-- End Old Book -->
<%@include file="all_component/footer.jsp" %>

</body>
</html>