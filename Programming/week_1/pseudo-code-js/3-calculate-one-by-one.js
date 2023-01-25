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
