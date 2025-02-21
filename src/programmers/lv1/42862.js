// https://school.programmers.co.kr/learn/courses/30/lessons/42862

function solution(n, lost, reserve) {
  // 여벌 체육복을 가진 학생과 도난당한 학생의 중복 제거
  let realLost = lost.filter((l) => !reserve.includes(l)).sort((a, b) => a - b);
  let realReserve = reserve
    .filter((r) => !lost.includes(r))
    .sort((a, b) => a - b);

  let count = n - realLost.length; // 기본적으로 체육복이 있는 학생 수

  realLost.forEach((l) => {
    // 앞번호 학생이 여벌이 있으면 빌림
    let index = realReserve.indexOf(l - 1);
    if (index !== -1) {
      realReserve.splice(index, 1);
      count++;
      return;
    }

    // 뒷번호 학생이 여벌이 있으면 빌림
    index = realReserve.indexOf(l + 1);
    if (index !== -1) {
      realReserve.splice(index, 1);
      count++;
    }
  });

  return count;
}
