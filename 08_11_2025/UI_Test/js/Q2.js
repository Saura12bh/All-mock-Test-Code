const textArea = document.getElementById("textArea");
const countDisplay = document.getElementById("count");

textArea.addEventListener("input", function () {
  let charCount = textArea.value.length; // get length
  countDisplay.textContent = "Character Count: " + charCount; // show count
});
