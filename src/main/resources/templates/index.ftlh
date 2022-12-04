[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Seriálový blog</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
    <h1>Seriálový blog</h1>

[#list posts.content as post]
      <a href="/post/${post.slug?no_esc}"><h2>${post.title}</h2></a>
      <p>Autor: ${post.author}</p>
    ${post.perex?no_esc} <br>

[/#list]

</body>
</html>
