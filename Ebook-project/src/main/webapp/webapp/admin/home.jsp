<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Admin: Home</title>
            <%@ include file="allCss.jsp" %>
        </head>

        <body>
            <%@ include file="navbar.jsp" %>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="card">
                                <div class="card-body text-center">
                                    <i class="fas fa-plus-square fa-3x"></i><br>
                                    <h4>Add Books</h4>
                                    ------------------
                                </div>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <div class="card">
                                <div class="card-body text-center">
                                    <i class="fas fa-book-open fa-3x"></i><br>
                                    <h4>All Books</h4>
                                    ------------------
                                </div>
                            </div>
                        </div>


                        <div class="col-md-3">
                            <div class="card">
                                <div class="card-body text-center">
                                    <i class="fas fa-box-open fa-3x"></i><br>
                                    <h4>Orders</h4>
                                    ------------------
                                </div>
                            </div>
                        </div>


                        <div class="col-md-3">
                            <div class="card">
                                <div class="card-body text-center">
                                    <i class="fas fa-sign-out-alt fa-3x"></i><br>
                                    <h4>Logout</h4>
                                    ------------------
                                    
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
        </body>

        </html>