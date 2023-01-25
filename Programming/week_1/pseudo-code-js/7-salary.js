const workingHours = 8;
const feePerHours = 24;
let taxes = 0;

const brutSalary = workingHours * feePerHours * 5 * 4;

let netSalary = 0;

if (brutSalary <= 1751.81) {
  taxes = brutSalary * (8 / 100);
  netSalary = brutSalary - taxes;
} else if (brutSalary > 1751.81 && brutSalary < 2919.72) {
  taxes = brutSalary * (9 / 100);
  netSalary = brutSalary - taxes;
} else {
  taxes = brutSalary * (11 / 100);
  netSalary = brutSalary - taxes;
}

console.log(brutSalary);
console.log(netSalary);
