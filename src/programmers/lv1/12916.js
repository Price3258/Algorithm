// https://school.programmers.co.kr/learn/courses/30/lessons/12916

function solution(s) {
  var answer = true;

  s = s.toLowerCase();

  let pCount = 0;
  let yCount = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] === "p") {
      pCount++;
    }
    if (s[i] === "y") {
      yCount++;
    }
  }

  if (yCount === pCount) {
    answer = true;
  } else {
    answer = false;
  }

  return answer;
}
