
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>E-Learning</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <div class="row">
        <div class="col-md-8 col-xs-12 col-md-offset-2">

            <h3>Add / Edit Course <br /> <small>Course Management</small></h3>

            <br />

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Add / Edit Course</h3>
                </div>
                <div class="panel-body">

                    <form method="POST" action="AddCourseServlet">

                        <div class="form-group">
                            <label for="name">Course Name: </label>
                            <input class="form-control" type="text" name="name" required="required">
                        </div>

                        <div class="form-group">
                            <label for="category">Category: </label>
                            <input class="form-control" type="text" name="category" required="required">
                        </div>

                        <div class="form-group">
                            <label for="lecturer">Lecturer: </label>
                            <input class="form-control" type="text" name="lecturer" required="required">
                        </div>
                        
                        <div class="form-group">
                            <label for="description">Description: </label>
                            <input class="form-control" type="text" name="description">
                        </div>

                        <button class="btn btn-block btn-primary">Add Course</button>

                    </form>

                </div>
            </div>

        </div>
    </div>

</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</body>
</html>
