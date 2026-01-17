function checkPali() {
  //fetch string form input box and store in s1 and result div in res
  let s1 = document.getElementById("str").value;
  let res = document.getElementById("result");
  //make s1 to lower case for better comparison
  let s = s1.toLowerCase();
  //create rev string to store revserse of s
  let rev = "";
  //make string rev using loop
  for (let i = s.length - 1; i >= 0; i--) {
    rev = rev + s[i];
  }
  //compare s and rev and dispaly result on html page
  if (s === rev) {
    res.innerText = s1 + " is a Palindrome";
  } else {
    res.innerText = s1 + " is not a Palindrome";
  }
}
