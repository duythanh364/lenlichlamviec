<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm nhân viên vào ca làm</title>
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
            height: 450px;
            width: 80%;
            margin: auto;
            display: flex;
            justify-content: center;

        }
        .wrapper{
            width: 100%;
            text-align: center;

        }
        .main__title{
            font-size: 30px;
            line-height: 74px;
        }
        .title{
            display: block;
            font-size: 30px;
            display: flex;
            justify-content: center;
        }
        input{

            width: 100px;
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
            width: 95%;
            display: flex;
            justify-content: center;
            padding-left: 10px;
            /*padding-left: 50px;*/
        }
        table{
            width: 100%;
        }
        th, td {
            /* border: 2px solid #999999; */
            padding: 5px;
            background-color: rgb(243 219 219 / 78%);
            color: rgb(94 15 15);
            font-weight: 450;
        }
        th{
            background-color: rgb(205 132 132);

            font-weight: normal;
            text-align: center;
            color: white;
        }
        /* ------ */
        tbody {
            /* display: inline-block; */
            border: 2px solid #999999;
        }
        td a{
            text-decoration: none;
            color: rgb(94 15 15);
        }
        td a:hover{

            cursor: pointer;
        }
        input[type="submit"]{
            color: #086177;
            font-size: 15px;
            font-weight: 700;
            width: 89px;
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
            font-size: 20px;
            font-weight: 400;
            padding-right: 28px;
        }
        .search select{
            width: 81px;
            margin-right: 15px;
        }
        input[type="text"]{
            width: 160px;
        }
        select option{
            color: #495a5e;
        }
        button.button__back{
            position: fixed;
            width: 100px;
            left: 160px;
            bottom: 30px;
        }
        .button{
            display: flex;
            position: absolute;
            bottom: -10px;
            left: 504px;
            padding-bottom: 20px;
        }
        .form__button{
            margin-right: 150px;
        }
        .button input[type="submit"]{
            /* position: absolute; */
        }
    </style>
    <body>
        <div class="insert">
            <header>
                <span class="main__title">Thêm nhân viên vào ca làm</span>
            </header>
            <div class="container">
                <div class="wrapper">
                    <span class="title">Chi tiết ca làm</span>

                    <form method ="POST" action="listLichDangKy">
                        <div class="table__content">
                            <table>
                                <tbody>
                                    <tr>
                                        <th>Họ và tên</th>
                                        <th>Số điện thoại</th>
                                        <th>Tổng giờ vừa lên lịch</th>
                                        <th>Chọn</th>						
                                    </tr>
                                    <c:forEach var="item" items="${listDK}">
                                        <tr>
                                            <td>${item.nhanVien.ten}</td>
                                            <td>${item.nhanVien.SDT}</td>
                                            <td>${mapTongGio.get(item.nhanVien.ID)}</td>
                                            <td>
                                                <input type="checkbox" id="checkbox1" name="options" value="${item.nhanVien.ID}">
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                        <div class="button">
                            <div class="form__button button__back" method="get" action="bac-si/tim-kiem"> 
                                <input type="submit" formaction="/QuanLyKTX/AddLichLamViec" value="Quay lại" />
                            </div>
                            <div class="form__button"> 
                                <input type="submit" value="Lưu" />
                            </div>
                            <c:if test="${listDK.size()==0}" >
                                <div class="form__button" > 
                                    <input type="submit" formmethod="get" formaction="/QuanLyKTX/SearchNhanVien" value="Thêm nhân viên vào ca làm" style="width: 220px;" />
                                </div>                                               
                            </c:if>
                        </div>
                    </form>

                </div>

            </div>

        </div>

    </body>

</html>
