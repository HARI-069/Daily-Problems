'use strict';

const factorial = function(num) {
  if(num < 0) return -1;

  let result = 1;
  // for(let i = 1; i <= num; i++) {
  //     result *= i;
  // }
  for(let i = 1; i <= num; result *= i, i++);
  return result;
}

const factorialRecursion = (num) => (num === 0 || num === 1) ? 1 : num * factorialRecursion(num - 1);

console.log(factorial(5))
console.log(factorialRecursion(5))
