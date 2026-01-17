function findSecondLargest(arr) {
  if (arr.length < 2) {
    console.log("Array does not have enough elements");
    return;
  }

  let first = 0;
  let second = 0;

  for (let i = 0; i < arr.length; i++) {
    let num = arr[i]; //10  20 4 45 99

    if (num === first) continue; // skip same number as first

    if (num > first) {
      second = first;
      first = num;
    } else if (num > second && num < first) {
      //10>0
      second = num;
    }
  }

  if (second === 0) {
    console.log("Array does not have enough distinct elements");
  } else {
    console.log("Second Largest Number:", second);
  }
}

// Example
findSecondLargest([10, 20, 4, 45, 99]); // Output → Second Largest Number: 45
