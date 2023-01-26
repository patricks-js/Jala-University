// Flowchart: https://www.figma.com/file/FX5G40m5rezhFDvrkTyIdf/1-binary-to-decimal?node-id=0%3A1&t=b7U1dNzNp8R63yBU-1

const binaryNumber = 1010010;
const decimalNumber = 5;

function binaryToDecimal(value) {
  const binary = String(value);

  let decimal = 0;
  for (let i = 0; i < binary.length; i++) {
    decimal += Number(binary[i] * 2 ** (binary.length - (i + 1)));
  }

  return decimal;
}

console.log(binaryToDecimal(binaryNumber));

function decimalToBinary(value) {
  let binary = "";

  while (value > 0) {
    binary += value % 2;
    value = Math.floor(value / 2);
  }

  return binary;
}

console.log(decimalToBinary(decimalNumber));
