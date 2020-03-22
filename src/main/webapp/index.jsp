<html>
<body>
<h2>Hello World!aaa</h2>

<a href="get_data">get_data</a>

<button type="button" class="btn btn-danger" onclick="ajax_1_test()">ajax_1</button>


<script src="js/jquery-3.4.1.js" type="application/javascript"></script>
<script src="js/bootstrap.min.js" type="application/javascript"></script>
<script src="css/bootstrap.min.css" type="text/css"></script>
<script type="application/javascript">
    function ajax_1_test() {
        $.ajax({url:"ajax_1_handler",
            success:function (data) {
                alert(data);
            }
        })
    }
</script>
</body>
</html>
