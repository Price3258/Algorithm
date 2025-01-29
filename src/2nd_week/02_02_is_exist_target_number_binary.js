/*

Q. 다음과 같이 숫자로 이루어진 배열이 있을 때, 2이 존재한다면 True 존재하지 않는다면 False 를 반환하시오.
[1, 2, 3, 4, 5, 6, 7]

*/

function solution(target, numbers = []) {
  let left = 0;
  let right = numbers.length - 1;
  let count = 0;

  while (left <= right) {
    const mid = Math.floor((left + right) / 2);

    if (numbers[mid] === target) {
      console.log(count);
      return numbers[mid];
    } else if (numbers[mid] < target) {
      count++;
      left = mid + 1;
    } else {
      count++;
      right = mid - 1;
    }
  }
  return -1;
}

console.log(solution(2, [1, 2, 3, 4, 5, 6, 7])); // 2 return
console.log(solution(3, [1, 2, 4, 5, 6, 7])); // -1 return
console.log(solution(7, [1, 2, 3, 4, 5, 6, 7])); // 7 return
