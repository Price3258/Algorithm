function factorial(n) {
  if (n <= 2) {
    return n;
  }
  return n * factorial(n - 1);
}

function solution(n) {
  const answer = factorial(n);

  return answer;
}

console.log(solution(3)); // 6
console.log(solution(5)); // 120
