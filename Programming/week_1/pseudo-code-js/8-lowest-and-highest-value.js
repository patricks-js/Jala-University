const numbers = [5, 2, 10, 4];

const lowest = numbers.reduce((acc, num) => {
  if (num < acc) {
    return num;
  } else {
    return acc;
  }
});

const highest = numbers.reduce((acc, num) => {
  if (num > acc) {
    return num;
  } else {
    return acc;
  }
});

console.log(lowest);

console.log(highest);
