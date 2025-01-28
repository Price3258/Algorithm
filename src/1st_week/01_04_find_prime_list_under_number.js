/*
정수를 입력 했을 때, 그 정수 이하의 소수를 모두 반환하시오. 

소수는 자신보다 작은 두 개의 자연수를 곱하여 만들 수 없는 1보다 큰 자연수이다.
*/

function solution(num) {
  const answer = [];

  for (let i = 2; i <= num; i++) {
    let isPrime = true;

    for (let j = 2; j * j <= i; j++) {
      // 2부터 √i까지 확인
      if (i % j === 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) {
      answer.push(i);
    }
  }

  return answer;
}

const result = solution(20);
console.log(result);
/*
# 20이 입력된다면, 아래와 같이 반환해야 합니다!
[2, 3, 5, 7, 11, 13, 17, 19]
*/

function solution2(num) {
  const isPrime = new Array(num + 1).fill(true);
  console.log(isPrime);
  for (let i = 2; i * i <= num; i++) {
    if (isPrime[i]) {
      for (let j = i * i; j <= num; j += i) {
        isPrime[j] = false; // i의 배수는 소수가 아님
      }
    }
  }

  return isPrime.map((prime, index) => (prime ? index : null)).filter(Boolean);
}

console.log(solution(20222));
