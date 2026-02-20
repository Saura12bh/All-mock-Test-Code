/*
Q3. Write a JavaScript program to find a continuous subarray whose sum equals a given target
value. If such a subarray exists, print the elements of that subarray. Otherwise, print "No
Subarray Found".
Input:
Array → [1, 4, 20, 3, 10, 5]
Target → 33
Output:
Subarray → [20, 3, 10]
*/
let a = [1, 4, 20, 3, 10, 5];
let t = 33;
//if sum of array is not eual to target sum
let found = false;
for (let i = 0; i < a.length; i++) {
  {
    let sum = 0;
    //to traverse array from i value to end and count sum and compare with target
    for (let j = i; j < a.length; j++) {
      {
        sum = sum + a[j];
        //jr sum he target brobr zali tr apn jithe part alo te sagle element res madhe store kele ani print kel an break kela loop
        if (sum == t) {
          let res = [];
          //to store element from 1 to  j in res
          for (let k = i; k <= j; k++) {
            res[res.length] = a[k];
          }
          console.log("Subarray => " + res);
          found = true;
          break;
        }
      }
    }
  }
}
if (found == false) {
  console.log("No Subarray Found");
}
