function Greet() {
  class User {
    constructor(name, age) {
      this.name = name;
      this.age = age;
    }
  }
  let name = document.getElementById("name").value;
  let age = document.getElementById("age").value;
  let user = new User(name, age);
  let msg = document.getElementById("s");
  msg.innerText =
    "Hello, my name is " + user.name + " and I am " + user.age + " years old";
}
