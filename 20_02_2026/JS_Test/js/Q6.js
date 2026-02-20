/*
Q6. Write a JavaScript program to remove duplicate characters from a string without using
inbuilt methods.
Input : "programming"
Output : "progamin"
Description:
Traverse each character and check manually whether it already exists in a new string before
adding it.
*/

let str = "programming";
let res = "";
//traverse each character of string
for (let i = 0; i < str.length; i++) {
  let present = true;
  for (let j = 0; j < res.length; j++) {
    //if character is already present in res then present become false and break
    if (str[i] === res[j]) {
      present = false;
      break;
    }
  }
  //if character is not present in res then add into res

  if (present == true) {
    res = res + str[i]; //progamin
  }
}
//print final result
console.log(res);
