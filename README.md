spring_sample
=============

<ul>Spring example project using:
<li>Spring Boot</li>
<li>Spring Data (ORM against MySQL)</li>
<liSpring MVC</li>
<li>Thymeleaf Template Engine</li>
<li>BootStrap</li>
</ul>
NO XMLs, <b>full annotation-driven.</b>

<h2>Runit</h2>

This project was made with the purpose to be ran just out of the box. This feature requires a little bit of software

<ul>
<li>MySQL5.6 server (and the right permissions to CRUD)</li>
<li>Gradle 2.0 and the proper pointing in yout PATH</li>
</ul>

Once you have this requirements accomplished just run:

```gradle bootRun```

If everything went fine, the server trace has to show no errors and the finishing message:

```Started Application in xx.xxx seconds (JVM running for zz.zzz)```

<h2>Useit</h2>
Take a look to the classes available at com.sukaro.example.web package to have an idea of the URL mappings of this application.

Resuming:

<ul>
<li>localhost:8080/customers</li>
<li>localhost:8080/newcustomer</li>
<li>localhost:8080/cars</li>
<li>localhost:8080/newcar</li>
</ul>
