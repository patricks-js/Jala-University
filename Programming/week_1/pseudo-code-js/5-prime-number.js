// const number = 7;

const res = [];
for (let i = 1; i < 100 + 1; i++) {
  if (i % i > 0) {
    res.push(i);
  }
}

console.log(res);
