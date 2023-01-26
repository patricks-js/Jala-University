let balance = 1000;

let amountToBeWithdrawn = 45;

const password = "patrick123";
let userPassword = "patrick123";

if (password === userPassword) {
  balance -= amountToBeWithdrawn;
} else {
  console.error("Invalid password");
}

console.log(balance);
