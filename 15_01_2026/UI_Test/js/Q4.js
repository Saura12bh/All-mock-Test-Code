function Total() {
  let a = document.getElementById("qt").value;
  let b = document.getElementById("rate").value;
  let q = parseInt(a);
  let r = parseFloat(b);
  let total = q * r;
  document.getElementById("t").innerText = "Total Amount =" + total;
}
