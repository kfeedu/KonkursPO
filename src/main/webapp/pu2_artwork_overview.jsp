<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container-fluid">
    <div class="jumbotron">
        <h1>Przegląd prac</h1>
    </div>
    <form>
        <div class="form-group">
            <label class="control-label col-md-2">Filtruj</label>
            <div class="col-md10">
                <select id="entriesFilter" class="form-control">
                    <option>wszystkie</option>
                    <option>bez oceny</option>
                    <option>z oceną</option>
                </select>
            </div>
        </div>
        <div class="btn">
            <a href="/rate_artwork" class="btn">Rate</a>
            <button class="btn btn-success">Ustaw</button>
        </div>
    </form>

</div>


</body>
</html>

