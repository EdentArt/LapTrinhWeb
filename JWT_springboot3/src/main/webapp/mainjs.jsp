1 $(document).ready(function() {

//Display information of successfully logged in users

$.ajax({

type: 'GET',

url: '/users/me',

dataType: 'json',

contentType: "application/json; charset=utf-8",

beforeSend: function (xhr) {

if (localStorage.token) {

xhr.setRequestHeader('Authorization', 'Bearer + localStorage.token);

success: function(data) {

var json = JSON.stringify(data, null, 4);

2

3

4

5

6

7

8

9

10

11

}

12

},

13

14

15

16

17

18

19

//alert('Hello + data.email + '! You have successfully accessed to /api/profile.');

20

},

21

error: function() {

22

23

24

25

alert("Sorry, you are not logged in.");

26

27

}

});

// $('#profile').html(json);

$('#profile').html( data.fullName);

$('#images').html(document.getElementById("images").src=data.images);

//console.log("SUCCESS: ", data);

var json = e.responseText;

$('#feedback').html(json);

// console.log("ERROR: ", e);