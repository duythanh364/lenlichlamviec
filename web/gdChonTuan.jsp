<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chọn Tuần</title>
    </head>
    <style>
        html{
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color:#fff;

        }
        .insert{

            padding: 0;
            margin: 0;
        }
        body{
            margin: 0;
            padding : 0;
            background-repeat: no-repeat;
            background-size: 100%;
            width: 100%;
            height: 100vh;
            background-image: linear-gradient(
            70deg,rgb(233 159 159 / 9%),rgb(68 56 63 / 50%)), url(vantai.jpg);
        }
        header { 
            height: 80px;
            width: 80%;
            margin: auto;
            margin-bottom: 15px;
            display: flex;
            justify-content: center;
        }
        .container { 	
            height: 530px;
            width: 80%;
            margin: auto;
            display: flex;
            justify-content: center;
        }
        .wrapper{
            width: 90%;
        }
        .main__title{
            font-size: 30px;
        }
        .title{
            display: block;
            font-size: 30px;
            display: flex;
            justify-content: center;
        }
        input{
            display: block;
            width: 300px;
        }
        span.button{
            display: flex;
            justify-content: center;
            padding-top: 20px;
        }
        button{
            border-radius: 5px;
            width: 30%;
            height: 35px;
            background-color: #eccccc;
        }
        td{
            font-weight: 500;
        }
        form{
            display: flex;
            justify-content: center;
            height: 30px;
        }
        input[type="submit"]{
            width: 10%;
            border-radius: 3px;
        }
        span.insert{
            display: flex;
            justify-content: center;
            margin: 20px;

        }
        span.insert a{
            text-decoration: none;
            color: #086177;
            font-size: 20px;
            font-weight: 600;

        }
        span.insert:hover a{
            color: rgb(173, 24, 163);
        }
        .table__content{
            width: 100%;
            display: flex;
            justify-content: center;
            padding-left: 10px;
        }
        table{
            width: 100%;
        }
        th,td{
            border : 2px solid #999999;

        }
        tbody{
            display: inline-block;
            border : 2px solid #999999;
        }
        td a:hover{
            color:rgb(173, 24, 163);
            cursor: pointer;
        }
        input[type="submit"]{
            color: #086177;
            font-size: 15px;
            font-weight: 700;
            width: 100px;
            display: block;
        }
        input[type="submit"]:hover {
            color:rgb(173, 24, 163);
            cursor: pointer;
        }
        .search{
            display: flex;
            justify-content: center;
            padding-top: 20px;
        }
        .search span{
            font-size: 25px;
            font-weight: 400;
            padding-right: 28px;
        }
        .search select{
            width: 233px;
            margin-right: 15px;
        }
        input[type="text"]{
            width: 160px;
        }
        select option{
            color: #495a5e;
        }
    </style>
    <body>
        <div class="insert">
            <header>
                <span class="main__title">Chọn tuần</span>
            </header>
            <div class="container">
                <div class="wrapper">
                    <form class="search"  method="GET" action="AddLichLamViec"> 
                        <span>Tuần</span>
                        <select name="tuan">
                            <c:forEach var="item" items="${listTuan}">
                                <option value="${item.ID}">Từ ${item.ngayBatDau} đến ${item.ngayKetThuc} </option>
                            </c:forEach>
                        </select>
                        <input type="submit" value="Vào lên lịch" />
                    </form>
                </div>

            </div>

        </div>
    </body>
</html>
