[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
  <meta charset="UTF-8">
  <title>Můj blog</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>

<h1>${post.title}</h1>
<h3> Autor: ${post.author}</h3>
<div ${post.perex?no_esc}</div>
<div ${post.body?no_esc}</div>


</body>
</html>
