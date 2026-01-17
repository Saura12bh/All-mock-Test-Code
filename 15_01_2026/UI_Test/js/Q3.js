let a = [2, 5, 2, 6, 3, 7, 9];
function display() {
  document.getElementById("dis").innerText = a;
}

function remove() {
  a.pop();
  display();
  document.getElementById("rm").innerText = "element removed using pop()";
}

function sortArray() {
  ele = document.getElementById("so");
  display();
  ele.innerText = "array sorted using sort()";
}
function searchEle() {
  let ele = document.getElementById("val").value;
  let n = parseInt(ele);
  let index = a.indexOf(n);
  if (index !== -1) {
    document.getElementById("sr").innerText = "Element found ";
  } else {
    document.getElementById("sr").innerText = "Element not found ";
  }
}
