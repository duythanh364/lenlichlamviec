<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lên lịch nhân viên</title>
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
            overflow: scroll;
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
            margin-bottom: 10px;
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
            width: 354px;
            height: 22px;
            margin: 37px 0px 2px -130px;
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
            bottom: 5px;
            left: 504px;

        }
        .form__button{
            margin-right: 150px;
            font-size: 20px;
            font-weight: 500;
        }
        .button input[type="submit"]{
            /* position: absolute; */
        }
    </style>
    <body>
        <div class="insert">
            <header>
                <span class="main__title">Lên lịch cho nhân viên</span>
            </header>
            <div class="container">
                <div class="wrapper">
                    <form method="POST" action="LuuLichLamViec">
                        <div class="table__content">
                            <table>
                                <tbody>
                                    <tr>
                                        <th>Thứ</th>
                                        <th>Ca sáng</th>
                                        <th>Ca chiều</th>
                                        <th>Ca tối</th>
                                    </tr>

                                    <c:forEach var="thu" items="${listThu}">

                                        <tr>
                                            <td>${thu}</td>
                                            <td>
                                                <a style=" width: 273px" href="listLichDangKy?ca=${thu}-08:00:00">
                                                    <c:forEach var="lichDK" items="${listDK}">
                                                        <c:if test="${lichDK.caLamViec.ngay.equals(thu)}" >
                                                            <c:if test="${lichDK.caLamViec.gioBatDau.equals('08:00:00')}" >
                                                                <c:choose>
                                                                    <c:when test="${listDKVuaChon.contains(lichDK)}" >
                                                                        <span style="display:block; background-color: #44f73869;">${lichDK.nhanVien.ten} </span>
                                                                    </c:when>    
                                                                    <c:otherwise>
                                                                        <span style="display:block;">${lichDK.nhanVien.ten} </span> 
                                                                    </c:otherwise>
                                                                </c:choose>                                                           
                                                            </c:if>
                                                        </c:if>
                                                    </c:forEach>
                                                    <span style="display: block; width: 100%; height: 9px;"></span>
                                                </a>

                                            </td>

                                            <td>
                                                <a style=" width: 273px" href="listLichDangKy?ca=${thu}-12:00:00">
                                                    <c:forEach var="lichDK" items="${listDK}">
                                                        <c:if test="${lichDK.caLamViec.ngay.equals(thu)}" >
                                                            <c:if test="${lichDK.caLamViec.gioBatDau.equals('12:00:00')}" >
                                                                <c:choose>
                                                                    <c:when test="${listDKVuaChon.contains(lichDK)}" >
                                                                        <span style="display:block; background-color: #44f73869;">${lichDK.nhanVien.ten} </span>
                                                                    </c:when>    
                                                                    <c:otherwise>
                                                                        <span style="display:block;">${lichDK.nhanVien.ten} </span> 
                                                                    </c:otherwise>
                                                                </c:choose>                                                           
                                                            </c:if>
                                                        </c:if>
                                                    </c:forEach>
                                                    <span style="display: block; width: 100%; height: 9px;"></span>
                                                </a>
                                            </td>

                                            <td>
                                                <a style="width: 273px" href="listLichDangKy?ca=${thu}-19:00:00">
                                                    <c:forEach var="lichDK" items="${listDK}">
                                                        <c:if test="${lichDK.caLamViec.ngay.equals(thu)}" >
                                                            <c:if test="${lichDK.caLamViec.gioBatDau.equals('19:00:00')}" >
                                                                <c:choose>
                                                                    <c:when test="${listDKVuaChon.contains(lichDK)}" >
                                                                        <span style="display:block; background-color: #44f73869;">${lichDK.nhanVien.ten} </span>
                                                                    </c:when>    
                                                                    <c:otherwise>
                                                                        <span style="display:block;">${lichDK.nhanVien.ten} </span> 
                                                                    </c:otherwise>
                                                                </c:choose>                                                           
                                                            </c:if>
                                                        </c:if>
                                                    </c:forEach>
                                                    <span style="display: block; width: 100%; height: 9px;"></span>
                                                </a>
                                            </td>

                                        </tr>
                                    </c:forEach>

                                </tbody>
                            </table>
                        </div>
                        <div class="button">
                            <div class="form__button button__back"> 
                                <input type="submit" formaction="/QuanLyKTX" value="Quay lại" />
                            </div>
                            <div class="form__button" > 
                                <input type="submit" value="Lưu" />
                                * Ghi chú:
                            </div>
                            <input type="text" name="ghiChu" value="${lichLV.ghiChu}" />
                        </div>
                    </form>

                </div>

            </div>

        </div>

    </body>
</html>
