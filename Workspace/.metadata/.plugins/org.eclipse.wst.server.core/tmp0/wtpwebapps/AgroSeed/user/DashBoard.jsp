<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AgroSeed</title>
<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE-Edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    
    <link rel="stylesheet" href="../CSS/00_Index.css" />
    <style>
      * {
        margin: 0;
        padding: 0;
      }
      article:hover {
        box-shadow: 0 0px 50px rgb(95, 93, 93);
      }
      /* Header */
      .header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 15px 50px;
        background: white;
        box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
      }

      /* Logo */
      .logo {
        font-size: 26px;
        font-weight: bold;
        color: orange;
        text-transform: uppercase;
      }

      .logo span {
        color: black;
        font-weight: normal;
      }

      /* Navigation Menu */
      .nav-menu {
        list-style: none;
        display: flex;
        gap: 25px;
      }

      .nav-menu a {
        text-decoration: none;
        color: black;
        font-size: 16px;
        padding: 8px 12px;
        transition: color 0.3s ease;
      }

      .nav-menu a:hover {
        color: orange;
      }

      img {
        display: block;
        width: 100%;
        height: auto;
      }
      html {
        scroll-behavior: smooth;
      }
      /* UTILITY CLASSES */
      .nowrap {
        white-space: nowrap;
      }
      /* GENERAL STYLE */
      body {
        min-height: 100vh;
        background-color: rebeccapurple;
        background-image: radial-gradient(whitesmoke, rebeccapurple);
        display: flex;
        flex-direction: column;
      }
      header,
      footer {
        position: sticky;
        background-color: #1e293b;
        color: white;
        text-align: center;
      }
      header {
        top: 1;
      }
      main {
        flex-grow: 1;
        display: flex;
        flex-direction: row;
        place-content: center;
        gap: 5rem;
        padding: 5rem;
      }
      

      /* || PROFILE CARD */
      .card {
        /* scroll-margin-top: 8rem; */
        width: min(100%, 350px);
        background-color: #cbd5e1;
        border: 2px solid black;
        border-radius: 15px;
        padding: 1rem;
        display: flex;
        flex-direction: column;
        align-items: center;
        cursor: pointer;
      }
      .card figure {
        display: flex;
        flex-flow: column nowrap;
      }
      .card img {
        margin-top: 10px;
        border: 5px double #333;
        border-radius: 5%;
        width: 350px;
        height: auto;
      }
      .card figcaption {
        font-weight: bolder;
        font-size: 2rem;
        margin: 1rem;
        text-align: center;
      }
      article p {
        padding: 50px 10px;
        text-align: center;
      }
      /* Footer Styles */
      .footer {
        background: #111;
        color: white;
        padding: 40px 80px;
        display: flex;
        justify-content: space-between;
        flex-wrap: wrap;
      }

      .footer-column {
        width: 22%;
        min-width: 200px;
      }

      .footer h3 {
        color: #ffffff;
        font-size: 16px;
        margin-bottom: 15px;
        text-transform: uppercase;
        font-weight: bold;
      }

      .footer p,
      .footer a {
        color: #aaa;
        font-size: 14px;
        text-decoration: none;
        display: block;
        margin-bottom: 8px;
      }

      .footer a:hover {
        color: orange;
      }

      .logo {
        font-size: 24px;
        font-weight: bold;
        color: orange;
      }

      footer .logo span {
        color: white;
        font-weight: normal;
      }
    
    </style>
</head>
<body>
<header class="header">
      <div class="logo">AGRO <span>SEED</span></div>
      <ul class="nav-menu">
        <li><a href="#">Home</a></li>
        <li><a href="#">Farmer Login</a></li>
        <li><a href="#">Services</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
    </header>

    <main>
      <article id="profile1" class="card">
        <figure>
          <figcaption>Land Details</figcaption>
          <img
            src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6f3_uF0OpYHcIrEXTA0hJT4T1ltpXE5kpLw&s"
            alt="Joe Coder"
          />
        </figure>
        <p>
          <q
            >Get details like land size, location, soil type, fertility and so
            on.</q
          >
        </p>
      </article>

      <article id="profile2" class="card">
        <figure>
          <figcaption>Crop Details</figcaption>
          <img
            src="https://www.shutterstock.com/image-photo/lush-rice-paddy-field-neat-600nw-2499404003.jpg"
            alt="Matt Designer"
          />
        </figure>
        <p><q>Growth duration, best-suited season, and ideal soil type.</q></p>
      </article>

      <article id="profile3" class="card">
        <figure>
          <figcaption>Monsoon Detail</figcaption>
          <img
            src="https://www.indiaincredible.co.in/public/cache/monsoon-travel-tips-for-every-traveler_1140_x_335.webp"
            alt="Jane Dev Rel"
          />
        </figure>
        <p><q>Displays upcoming monsoon predictions using weather APIs.</q></p>
      </article>
    </main>

    <!-- Footer -->
    <footer class="footer">
        <div class="footer-column">
            <div class="logo">AGRO <span>SEED</span></div>
            <p>Farmer Portal which ensures them to make the best utilization and productivity of their land.</p>
        </div>

        <div class="footer-column">
            <h3>Navigation</h3>
            <a href="#">Home</a>
            <a href="#">About</a>
            <a href="#">Gallery</a>
            <a href="#">Farmer Login</a>
            <a href="#">Services</a>
            <a href="#">Contact</a>
        </div>

        <div class="footer-column">
            <h3>Address</h3>
            <p>Eiursmod Tempor Inc</p>
            <p>St Dolore Place,</p>
            <p>San Francisco 56777</p>
        </div>

        <div class="footer-column">
            <h3>Phone Number</h3>
            <p>+2 123 456 789</p>
            <p>+2 123 456 789</p>
            <h3>Email ID</h3>
            <a href="mailto:mail@example.com">mail@example.com</a>
        </div>
    </footer>

</body>
</html>