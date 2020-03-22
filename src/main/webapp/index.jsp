<%@page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<h2>Hello World!aaa</h2>

<a href="get_data">get_data</a>

<button type="button" class="btn btn-danger" onclick="str()">ajax_str</button>
<button type="button" class="btn btn-success" onclick="one()">ajax_int</button>
<button type="button" class="btn btn-light" onclick="dataInnteraction()">ajax_interaction</button>
<button type="button" class="btn btn-warning" onclick="getListDept()">ajax_List</button>
<button type="button" class="btn btn-primary" onclick="getMapDepts()">ajax_Map</button>

<script src="js/jquery-3.4.1.js" type="application/javascript"></script>
<script src="https://cdn.staticfile.org/popper.js/1.16.1/umd/popper.min.js"></script>
<script src="js/bootstrap.min.js" type="application/javascript"></script>
<script>
    function str() {
        $.ajax({
            url:"ajaxTest",
            dataType:"json",
            success:function (data) {
                alert(data);
            }
        })
    }

    function one() {
        $.ajax({
            url:"ajaxIntTest",
            dataType:"json",
            success:function (data) {
                alert(data);
            }
        })
    }

    function dataInnteraction() {
        $.ajax({
            url:"ajaxInnteraction?dNo=100",
            dataType:"json",
            success:function (data) {
                alert(data.loc);
            }
        })
    }

    function getListDept() {
        $.ajax({
            url:"ajaxTestList",
            dataType:"json",
            success:function (data) {
                alert("集合个数："+data.length);
                $.each(data,function (index,item) {
                    alert(item.dname);
                })
            }
        })
    }

    function getMapDepts() {
        $.ajax({
            url:"ajaxTestMap",
            dataType:"json",
            success:function (data) {
                $.each(data,function (index,item) {
                    alert(item.dname);
                })
            }
        })
    }
</script>
</body>
</html>
