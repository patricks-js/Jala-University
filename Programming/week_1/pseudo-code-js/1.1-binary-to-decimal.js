const binaryNumber = 0.01;

function binaryToDecimal(value) {
  const binary = String(value).split(".").reverse();

  const res = [];
  for (let i = 0; i < binary.length; i++) {
    res.push((binary[i] * 2) ** i);
  }

  return res.reduce((acc, val) => acc + val);
}

console.log(binaryNumberToDecimalNumber(binaryNumber));
