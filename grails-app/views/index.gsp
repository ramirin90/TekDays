<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main"/>
    <title>TekDays - The Community is the Conference!</title>
    <style type="text/css" media="screen">
    
/*Dashboard*/
.dashItem {
	margin: 10px;
}

#eventBlurb {
	width: 100%;
	height: 60px;
}

#dashHeader {
	text-align: center;
}
/*Index*/
#homeSearch {
	margin-left: 30%;
	margin-top: 25px;
	width: 40%;
}

#homeSearch label {
	font-weight: bold;
}

#welcome {
	margin-left: 25px;
	width: 85%;
}

.homeCell {
	margin-left: 25px;
	margin-top: 65px;
	width: 85%;
}

.homeCell .buttons {
	width: 180px;
	text-align: center;
	float: right;
	margin-right: 30px;
	margin-bottom: 30px;
}

h3, li {
	margin-bottom: 15px;
}
/*Message Create*/
.messageField {
	width: 550px
}
/*Ajaxlist*/
#messageList {
	margin: 20px 30px;
	overflow: auto
}

#messageList p {
	margin: 10px 0;
}

#show-message {
	margin: 20px 30px;
}

#detailHeading {
	margin-left: 30px;
	margin-bottom: 15px;
}
/*Volunteer Dialog*/
#volunteerDialog .ui-widget-header {
	color: #ABBF78;
	background-image: none;
	color: #000;
}
    
    
    </style>
  </head>
  <body>
    <div id="welcome">
      <br />
      <h3>Welcome to TekDays.com</h3>
      <p>TekDays.com is a site dedicated to assisting individuals and
         communities to organize technology conferences.  To bring great
         minds with common interests and passions together for the good
         of greater geekdom!</p>
    </div>
    <div id="homeSearch">
      <g:form controller="tekEvent" action="search">
        <label>Search:</label>
        <input id="query" type="text" name="query" />
        <input type=submit value="Go" />
      </g:form>
    </div>
    <g:organizerEvents />
    <g:volunteerEvents />
    <div class="homeCell">
      <h3>Find a Tek Event</h3>
      <p> See if there's a technical event in the works that strikes your
         fancy. If there is, you can volunteer to help or just let the
         organizers know that you'd be interested in attending.
         Everybody has a role to play.</p>
      <span class="buttons" >
        <g:link controller="tekEvent" action="index">Find a Tek Event</g:link>
      </span>
    </div>
    <div class="homeCell">
      <h3>Organize a Tek Event</h3>
      <p>If you don't see anything that suits your interest and location,
         then why not get the ball rolling.  It's easy to get started and
         there may be others out there ready to get behind you to make it
         happen.</p>
      <span class="buttons" >
        <g:link controller="tekEvent" action="create"> Organize a Tek Event</g:link>
      </span>
    </div>
    <div class="homeCell">
      <h3>Sponsor a Tek Event</h3> 
      <p>If you are part of a business or organization that is involved in
         technology then sponsoring a tek event would be a great way to
         let the community know that you're there and you're involved.</p>
      <span class="buttons" >
        <g:link controller="sponsor" action="create">Sponsor a Tek Event</g:link>
      </span>
    </div>
  </body>
</html>
