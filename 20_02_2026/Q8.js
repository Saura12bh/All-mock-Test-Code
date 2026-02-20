/*
Q8. Write a JavaScript program to perform basic string compression using character counts. If
the compressed string length is not smaller than the original string, return the original string.
Input : "aaabbccccd"
Output : "a3b2c4d1"
Description :
Traverse the string character by character. Count consecutive repeated characters manually.
Append character + count to a new string. Compare final length with original length without
using inbuilt length-reducing functions.
*/
let str = "aaabbccccd";
let res = "";
let cnt = 1;

for (let i = 0; i < str.length; i++) {
  if (str[i] == str[i + 1]) {
    cnt++;
  } else {
    res = res + str[i] + cnt; //res=a3b2c4d1
    cnt = 1;
  }
}
console.log(res);
