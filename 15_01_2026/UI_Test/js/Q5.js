let a = document.getElementById("num1");
let b = document.getElementById("num2");
function clr() {
  a.value = "";
  b.value = "";
  document.getElementById("result").innerText = "";
}

function add() {
  let n1 = parseInt(a.value);
  let n2 = parseInt(b.value);
  document.getElementById("result").innerText = "The sum is: " + (n1 + n2);
}
function sub() {
  let n1 = parseInt(a.value);
  let n2 = parseInt(b.value);
  document.getElementById("result").innerText = "The sub is: " + (n1 - n2);
}
function mul() {
  let n1 = parseInt(a.value);
  let n2 = parseInt(b.value);
  document.getElementById("result").innerText =
    "The multiplication is: " + n1 * n2;
}
