// https://school.programmers.co.kr/learn/courses/30/lessons/12985

// 내 풀이
function getGameCount(n) {
  let count = 0;
  let value = n;
  while (true) {
    value = value / 2;
    if (value === 1) {
      count++;
      break;
    }
    count++;
  }
  return count;
}

function solution(n, a, b) {
  var answer = 0;

  const playGame = getGameCount(n);

  for (let i = 0; i < playGame; i++) {
    if (Math.ceil(a / 2) === Math.ceil(b / 2)) {
      answer++;
      break;
    }
    a = Math.round(a / 2);
    b = Math.round(b / 2);
    answer++;
  }

  return answer;
}

/*

12 34 56 78 910 1112 1314 1516   2*2*2*2 = 2^4
12 34 56 78
12 34
12
1

*/

/*
12 34 56 78 A :4 , B 7 
12 34 A:2 B:4
12 A:1 B:2
1 A or B

*/

// 다른 사람의 간단 풀이
function solution(n, a, b) {
  let answer = 0;
  while (a !== b) {
    a = Math.ceil(a / 2);
    b = Math.ceil(b / 2);
    answer++;
  }
  return answer;
}
