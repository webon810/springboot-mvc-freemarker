<DOCTYPE html>
    <html>
    <head>
        <title>Web Form Submission</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
    </head>
    <body>

    <h2>Web Form Submission</h2>

   <#if contactus?? >
        Your submitted data<br>
        First Name: ${contactus.firstName}<br>
        Last Name: ${contactus.lastName}<br>
        Email: ${contactus.email}<br>
        Message: ${contactus.message}<br>

   <#--redirect url -->
        <script>setTimeout(function(){window.location.href='http://localhost:8182/form'},3000);</script>
   <#else>
        <form action="/form" method="post">
            First Name:<br>
            <input type="text" name="firstName" placeholder="First Name" required="required" data-error="First Name is required.">
            <br><br>
            Last Name:<br>
            <input type="text" name="lastName" placeholder="Last Name" required="required" data-error="Last Name is required.">
            <br><br>
            Email:<br>
            <input type="email" name="email" placeholder="email" required="required" data-error="Email is required.">
            <br><br>
            Message:<br>
            <input type="text" name="message" placeholder="message" required="required" data-error="message is required.">
            <br><br>
            <input type="submit" value="Submit">
        </form>
   </#if>


    </body>
    </html>