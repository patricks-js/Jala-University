// Flowchart: https://www.figma.com/file/fuU3AbRiQ9T95folpCh482/6-criptograph?node-id=0%3A1&t=0lzLQSdLPZrVZuj8-1

const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");

const numbersOfAlphabet = [
  1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
  23, 24, 25, 26,
];

function encrypt(lettersToEncrypt) {
  const set = lettersToEncrypt.split(" ");
  const encryptParts = [];

  set.forEach((letters) => {
    const part = [];

    for (let i = 0; i < letters.length; i++) {
      if (alphabet.includes(letters[i])) {
        part.push(alphabet.indexOf(letters[i]) + 1);
      }
    }
    encryptParts.push(part.join("."));
  });

  return encryptParts.join(" ");
}

function decrypt(numberToDecrypt) {
  const set = numberToDecrypt.split(" ");
  const decryptParts = [];

  set.forEach((numbers) => {
    const number = numbers.split(".").join("");
    const part = [];

    for (let i = 0; i < number.length; i++) {
      if (numbersOfAlphabet.includes(Number(number[i]))) {
        part.push(alphabet[number[i] - 1]);
      }
    }
    decryptParts.push(part.join(""));
  });

  return decryptParts.join(" ");
}

console.log(encrypt("ZUJSABOS"));
console.log(decrypt("1.2.2.4 1.3.4.3"));
