/*
정수 배열 array와 2차원 배열 commands가 주어질 때,
commands의 각 원소는 [i, j, k] 형태이고,
array의 i번째부터 j번째까지 자른 뒤 정렬했을 때
k번째 숫자를 구하는 문제

*/

function solution(array, commands) {
  //5, 2, 6, 3, 7 => 2,3,5,6,7 -> 3번째 5
  // 6, = > 첫번째
  //  1, 5, 2, 6, 3, 7, 4 =>  1,2,3,4,... 3번째 는 3
  return commands.map(([i, j, k]) => {
    const sliced = array.slice(i - 1, j);
    const sorted = sliced.sort((a, b) => a - b);
    return sorted[k - 1];
  });
}

const array = [1, 5, 2, 6, 3, 7, 4];
const commands = [
  [2, 5, 3],
  [4, 4, 1],
  [1, 7, 3],
];

console.log(solution(array, commands)); // [5,6,3]
