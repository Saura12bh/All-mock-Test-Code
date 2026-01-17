//object
person = {
  name: "sai",
  age: 22,
  city: "pune",
};
let s = JSON.stringify(person);

document.getElementById("s").innerText =
  person.name + "    " + person.age + "   " + person.city;

function str() {
  document.getElementById("s1").innerText = JSON.stringify(person);
}

function obj() {
  document.getElementById("s2").innerText = JSON.parse(s);
}
