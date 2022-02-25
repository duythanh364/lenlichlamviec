
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>KTX</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

    <style>
        :root{
            --white-color: #fff;
            --black-color: #000;
            --text-color: #333;
            --primary-color: #fe6132;
            --header-height: 120px;
            --navbar-height: 31px;
            --header-with-search-height: calc(var(--header-height) - var(--navbar-height));
        }
        *{
            box-sizing: inherit;
        }
        html{
            font-size:62.5%;
            line-height: 1.6rem;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        body{
            background-color: #88807e;
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100vh;
            background-image: linear-gradient(
            70deg,rgb(233 159 159 / 9%),rgb(68 56 63 / 50%)), url(vantai.jpg);
            background-repeat: no-repeat;
            background-size: 100%;

        }
        p.content__slogan{
            font-size: 4.2rem;
            color: rgb(252 253 255);
            font-weight: 600;
            text-align: center;
        }
        p.content__slogan--detail{
            position: absolute;
            top: 240px;
            left : 210px;
            font-size: 2rem;
            color: rgb(139, 122, 26);
            font-weight: 600;
            display: none;
        }
        .content{
            /* border: 2px solid #dd9595; */
            position: relative;
            top: 0;
            left: 0;
            /* top: 0px;
            left: 0px; */
            /* background-color: #f5ab94; */
        }
        .content__navbar{
            position: absolute;
            top: 70px;
            left: 222px;
        }
        ul.content__navbar-list{
            font-size: 2rem;
            list-style: none;
            border: 2px solid #dd9595;
            display: flex;
            justify-content: space-between;
            padding-left: 0;
            background-color: #ebe3e385;
        }

        li.content__navbar-item{
            padding: 20px;

        }
        li.content__navbar-item a{
            text-decoration: none;
            font-weight: 600;
            color: rgb(252 253 255);
            line-height: 100%;
        }
        li.content__navbar-item:hover {
            background-color:rgb(191 193 235);
        }
        li.content__navbar-item:hover a.link{
            color:rgb(63, 56, 56);
        }
        li.content__navbar-item-stat{
            position: relative;
        }
        div.content__navbar-stat{
            position: absolute;
            top: 63px;
            left: 21px;
            width: 125px;   
            background-color: #c4dbd9;
            display: none;
        }

        li.content__navbar-item-stat:hover .content__navbar-stat{
            display: block;  
            background-color: rgb(245, 222, 222);   
        }
        .stat::before{
            content:"";
            width: 125px;
            height: 10px;
            display:block;
            position: absolute;
            top: -5px;
            right: 0;
            /* background-color: black; */
        }
        .stat{
            padding: 10px 10px 10px 5px;

        }
        .stat a{
            font-size: 17px;
        }
        .stat:hover {
            background-color: rgb(177, 161, 161);
            transition: 0.3s;
        }
        .stat:hover a{
            transition: 0.3s;

            color:rgb(192, 18, 12);
        }
        #selected{
            background-color: red;
        }

    </style>
    <body>
        <div class="content">
            <div class="content__navbar">
                <ul class="content__navbar-list">
                    <li class="content__navbar-item">
                        <a class="link" href="ChonTuan">Lên lịch làm việc</a>
                    </li>
                    <li class="content__navbar-item">
                        <a class="link" href="">Quản lý vào,ra</a>
                    </li>
                    <li class="content__navbar-item">
                        <a class="link" href="">Đăng ký dịch vụ</a>
                    </li>
                    <li class="content__navbar-item">
                        <a class="link" href="">Quản lý vật tư</a>
                    </li>
                    <li class="content__navbar-item">
                        <a class="link" href="">Thanh toán hóa đơn</a>
                    </li>
                </ul>
            </div>

            <p class="content__slogan">Hệ thống quản lý ký túc xá</p>    
            <p class="content__slogan--detail">
            </p>

            <div class="content__table">

            </div>  
        </div>
    </body>
</html>
