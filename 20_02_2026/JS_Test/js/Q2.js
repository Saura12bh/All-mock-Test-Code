/*
Q2. Write a JavaScript program to count the frequency of each element in an integer array.
Input:
[2, 3, 2, 5, 3, 2]
Output:
2 → 3 times
3 → 2 times
5 → 1 time
Description:
Use nested loops to count occurrences. Mark visited elements manually
*/
let a = [2, 3, 2, 5, 3, 2];

//traverse all elements  for counting frequency
for (let i = 0; i < a.length; i++) {
  //check if element is not visited  then only count frequency
  if (a[i] !== -1) {
    let count = 1; //strt from 1

    //count freqeuncy and after count mark as visted by using -1
    for (let j = i + 1; j < a.length; j++) {
      if (a[i] === a[j]) {
        count++;
        a[j] = -1; // mark visited
      }
    }
    //print elemernt with its frequency
    console.log(a[i] + " => " + count + " times");
  }
}
