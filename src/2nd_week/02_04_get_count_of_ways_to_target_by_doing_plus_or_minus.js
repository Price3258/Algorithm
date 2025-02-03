/*
Q. 음이 아닌 정수들로 이루어진 배열이 있다. 이 수를 적절히 더하거나 빼서 특정한 숫자를 만들려고 한다. 
예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들기 위해서는 다음 다섯 방법을 쓸 수 있다.

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3

사용할 수 있는 숫자가 담긴 배열 numbers, 
타겟 넘버 target_number이 매개변수로 주어질 때 숫자를 적절히 더하고 빼서 타겟 넘버를 만드는 방법의 수를 반환하시오.
*/

function solution(numbers, target) {
  let answer = 0;

  function dfs(index, currentSum) {
    if (index === numbers.length) {
      if (currentSum === target) {
        answer += 1; // 타겟 넘버를 만든 경우 카운트 증가
      }
      return;
    }

    dfs(index + 1, currentSum + numbers[index]); // 현재 숫자 더하기
    dfs(index + 1, currentSum - numbers[index]); // 현재 숫자 빼기
  }

  dfs(0, 0); // 초기값: 인덱스 0, 합계 0부터 시작
  return answer;
}

const numbers = [1, 1, 1, 1, 1];
const target = 3;
console.log(solution(numbers, target)); // answer 5
console.log(solution([4, 1, 2, 1], 4)); // 2
