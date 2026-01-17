let e = document.getElementById("no").value;
document.getElementById("btn").addEventListener("click", fibonacci(e));
let p = document.getElementById("dis");
function fibonacci(n) {
  let a = 0,
    b = 1;
  let next;
  let result = "";
  for (let i = 1; i <= n; i++) {
    result += a + " ";
    next = a + b;
    a = b;
    b = next;
  }
  p.innerText = result;
}
