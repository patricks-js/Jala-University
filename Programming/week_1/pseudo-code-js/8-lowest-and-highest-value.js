// Flowchart: https://www.figma.com/file/vaCNYlYhQXMpjSDXvSRKw2/8-lowest-and-highest-value?node-id=0%3A1&t=Uua7gHJG8rZ8XJo6-1

const numbers = [5, 2, 10, 4];

const lowest = numbers.reduce((acc, num) => {
  console.log(acc);
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
