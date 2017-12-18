<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Universidad de Villamayor</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/main.css" type="text/css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/style.css" type="text/css"/>
        <script src="${pageContext.request.contextPath}/res/js/jquery.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/res/js/skel.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/res/js/util.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/res/js/main.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/res/js/index.js" type="text/javascript"></script>
    </head>
    <body>
        <!-- Header -->
    <header id="header">
        <div class="inner">
            <a href="index.html" class="logo">UV-Portal</a>
            <nav id="nav">
                <a href="${pageContext.request.contextPath}/generic.html">Generic</a>
                <a href="${pageContext.request.contextPath}/swagger-ui.html">Swagger UI</a>
                <a href="${pageContext.request.contextPath}/elements.html">Elements</a>
            </nav>
            <a href="#navPanel" class="navPanelToggle"><span class="fa fa-bars"></span></a>
        </div>
    </header>
    <!-- Banner -->
    <section id="banner">
        <h1>Universidad de Villamayor</h1>
        <p>Proyecto ISA 2017 UAH (Universidad Villamallor).</p>
    </section>
    <!-- Main -->
    <!--section id="main" class="wrapper"-->
    <div class="inner" style="">
        <div class="row">
            <div class="6u 12u(small)"><br />
                <h3>Sem turpis amet semper</h3>
                <p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat commodo eu sed ante lacinia. Sapien a lorem in integer ornare praesent commodo adipiscing arcu in massa commodo lorem accumsan at odio massa ac ac. Semper adipiscing varius montes viverra nibh in adipiscing blandit tempus accumsan.</p>
            </div>
            <div class="6u 12u(small)">
                <div class="wrapper fadeInDown">
                    <div id="formContent">
                        <!-- Tabs Titles -->
                        <h2 class="active">Inicar Sesion</h2>
                        <h2 class="inactive underlineHover">Registrase</h2>
                        <div class="fadeIn first">
                            <img src="${pageContext.request.contextPath}/res/images/icon.svg" id="icon" alt="User Icon" />
                        </div>
                        <form action="./index.html" method="POST" >
                            <input type="text" id="login" class="fadeIn second" name="username" placeholder="Introduca el NIF">
                            <input type="password" id="password" class="fadeIn third" name="password" placeholder="Introduca la contraseña">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <input type="submit" class="btn btn-success" value="Iniciar Sesion" requiered>
                            <input type="checkbox" id="human" name="human"><label for="human">recordarme</label>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--/section>
    <!-- Footer -->
    <footer id="footer">
        <div class="inner">
            <div class="flex">
                <div class="copyright">
                    &copy; Untitled. Design: <a href="https://templated.co">TEMPLATED</a>. Images: <a href="https://unsplash.com">Unsplash</a>.
                </div>
                <ul class="icons">
                    <li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                    <li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
                    <li><a href="#" class="icon fa-linkedin"><span class="label">linkedIn</span></a></li>
                    <li><a href="#" class="icon fa-pinterest-p"><span class="label">Pinterest</span></a></li>
                    <li><a href="#" class="icon fa-vimeo"><span class="label">Vimeo</span></a></li>
                </ul>
            </div>
        </div>
    </footer>
</body>
</html>