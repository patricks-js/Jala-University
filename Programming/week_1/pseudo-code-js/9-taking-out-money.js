// Flowchart: https://www.figma.com/file/2mzWeogyCAwLresPKp66Jj/9-taking-out-money?node-id=0%3A1&t=j7T8pr6uy0yoHWJz-1

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
