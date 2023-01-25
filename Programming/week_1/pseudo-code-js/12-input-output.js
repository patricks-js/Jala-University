const alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
// Aqui é uma referencia do alfabeto A-Z

const numbersOfAlphabet = [
  1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
  23, 24, 25, 26,
];
// Aqui a quantidade de números do alfabeto 1-26

function encrypt(lettersToEncrypt) {
  // O user faz a entrada de dado com letras para criptografar
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

  return encryptParts.join(" "); // A aqui o resultado das letras criptografadas
}

console.log(encrypt("ZUJS LQOS"));

function decrypt(numberToDecrypt) {
  // O user faz a entrada de dado com as letras criptografadas em números
  const set = numberToDecrypt.split(" ");
  const encryptParts = [];

  set.forEach((numbers) => {
    const number = numbers.split(".").join("");
    const part = [];

    for (let i = 0; i < number.length; i++) {
      if (numbersOfAlphabet.includes(Number(number[i]))) {
        part.push(alphabet[number[i] - 1]);
      }
    }
    encryptParts.push(part.join(""));
  });

  return encryptParts.join(" "); // A aqui o resultado das letras descriptografadas
}

console.log(decrypt("1.2.2.4 1.3.4.3"));
