// Flowchart: https://www.figma.com/file/jwoopScUNieMYOHLe8Qi9H/5-prime-number?node-id=0%3A1&t=aXyYhBOu2cHuMNhS-1

function isPrime(value) {
  let dividers = 0;

  if (value === 0) {
    return "Null number";
  }

  for (let i = 1; i <= value; i++) {
    if (value % i === 0) {
      dividers += 1;
    }
  }

  if (dividers > 2 || value <= 1) {
    return `${value} not is prime`;
  }
  return `${value} is prime`;
}

console.log(isPrime(10));
