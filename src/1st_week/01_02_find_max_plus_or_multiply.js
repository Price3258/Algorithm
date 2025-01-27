/*

Q. 다음과 같이 0 혹은 양의 정수로만 이루어진 배열이 있을 때, 
왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 '✕' 혹은 '+' 연산자를 넣어 결과적으로 가장 큰 수를 구하는 프로그램을 작성하시오. 

단, '+' 보다 '✕' 를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서 순서대로 이루어진다.
[0, 3, 5, 6, 1, 2, 4]
*/

function solution(arr) {
  let answer = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] <= 1 || answer <= 1) {
      answer += arr[i];
    } else {
      answer *= arr[i];
    }
  }
  return answer;
}

console.log("anwer 728", solution([0, 3, 5, 6, 1, 2, 4]));
console.log("anwer 8820", solution([3, 2, 1, 5, 9, 7, 4]));
console.log("anwer 720", solution([1, 1, 1, 3, 3, 2, 5]));
