function chkname() {
  var name = document.getElementById("name").value;
  if (name === "") {
    alert("Name must not be empty and should contain only alphabets");
  }
}

function chkemail() {
  var email = document.getElementById("email").value;
  if (email === "") {
    alert("Email must not be empty and should be in a valid email format");
  }
}

function chkcnt() {
  var contact = document.getElementById("contact").value;
  if (contact === "" && contact.length <= 10) {
    alert("Contact Must not be empty and must contain exactly 10 digits");
  }
}

function chkusername() {
  var username = document.getElementById("username").value;
  if (username === "" && username.length >= 4) {
    alert(
      "Username must not be empty and should be at least 4 characters long"
    );
  }
}

function chkpassword() {
  var password = document.getElementById("password").value;
  if (password === "" && password.length >= 6) {
    alert(
      "Password must not be empty and should be at least 6 characters long"
    );
  }
}
