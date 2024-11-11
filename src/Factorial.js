'use strict';

const factorial = function(num) {
  if(num < 0) return -1;

  let result = 1;
  for(let i = 1; i <= num; i++) {
      result *= i;
  }
  return result;
}

console.log(factorial(5))
