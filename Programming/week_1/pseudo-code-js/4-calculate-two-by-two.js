const hundred = 100;

function sumNumbers(value) {
  const res = [];

  for (let i = 2; i < value + 1; i += 2) {
    res.push(i);
  }

  return res.reduce((acc, value) => acc + value);
}

console.log(sumNumbers(hundred));
