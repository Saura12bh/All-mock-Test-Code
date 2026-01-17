let a = [1, 2, 3, 4, 5, 1, 2, 4];
for (let i = 0; i < a.length; i++) {
  let count = 0;
  for (let j = 0; j < a.length; j++) {
    if (a[i] === a[j]) {
      count++;
    }
  }
  console.log(a[i] + " occurs " + count + " times");
}
