// Flowchart: https://www.figma.com/file/YkyJiRxqH7Q6prjE3ZYcpl/4-calculate-two-by-two?node-id=0%3A1&t=wQnFuZt8GnXm34jL-1

const hundred = 100;

function sumNumbers(value) {
  const res = [];

  for (let i = 2; i < value + 1; i += 2) {
    res.push(i);
  }

  return res.reduce((acc, value) => acc + value);
}

console.log(sumNumbers(hundred));
