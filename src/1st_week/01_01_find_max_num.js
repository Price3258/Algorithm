/*
Q. 다음과 같은 숫자로 이루어진 배열이 있을 때, 이 배열 내에 특정 숫자가 존재한다면 True, 존재하지 않다면 False 를 반환하시오.

[3, 5, 6, 1, 2, 4]

*/

function findMax(arr) {
  //   return Math.max(...arr);
  let max = 0;
  for (i = 0; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return max;
}

const arr = [3, 5, 6, 1, 2, 4];

console.log(findMax(arr));
