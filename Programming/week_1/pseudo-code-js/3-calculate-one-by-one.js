// Flowchart: https://www.figma.com/file/LlURz3lqWaw4GH70rQzEQT/3-calculate-one-by-one?node-id=0%3A1&t=l6KlyV8u8eqITeHg-1

const hundred = 100;

function sumNumbers(value) {
  const res = [];

  for (let i = 1; i < value + 1; i++) {
    res.push(i);
  }

  return res.reduce((acc, value) => acc + value);
}

const res = sumNumbers(hundred);

console.log(res);
