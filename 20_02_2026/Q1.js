/*
Q1. Write a JavaScript program to merge two integer arrays into a single array without
duplicates.
Input: arr1 = [1, 2, 3]
arr2 = [2, 3, 4, 5]
Output: [1, 2, 3, 4, 5]
Description:
First copy elements of arr1 into a new array. Then add elements from arr2 only if they do not
already exist (check manually using loops).
*/
let a = [1, 2, 3];
let b = [2, 3, 4, 5];
//create empty array for store final result
let res = [];
//copy all elements of a into res
for (let i = 0; i < a.length; i++) {
  res[res.length] = a[i];
}

//traverse b array and check if present in res or not if not then add in res
for (let i = 0; i < b.length; i++) {
  //if element already present then it beacome false
  let present = true;
  //traver and check if element is present in res or not if then present become false and break
  for (let j = 0; j < res.length; j++) {
    if (b[i] === res[j]) {
      present = false;
      break;
    }
  }
  //if element is not prsent then add into res
  if (present == true) {
    res[res.length] = b[i];
  }
}
//print final result
console.log(res); //1 ,2 ,3 4,5
