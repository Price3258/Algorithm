//https://school.programmers.co.kr/learn/courses/30/lessons/42842

function solution(brown, yellow) {
  const area = brown + yellow;

  for (let height = 3; height <= area; height++) {
    if (area % height === 0) {
      const width = area / height;

      if (2 * (width + height - 2) === brown) {
        return [width, height];
      }
    }
  }
}

/*
8 1 

카펫의 형태가 정사각형이거나 가로가 긴 직사각형. 가운데에 무조건 노란색.
정사각형도 직사각형이니까 직사각형만 만족하면 됨. 
bbb
byb
bbb

10 2

bbbb
byyb
bbbb

bbbbb
bbybb
bbbbb

대각 끝 4개 나머지로 채웠을 때 사각형이 되어야함. 필요 개수
2x+2y -4 = 2(x+y-2)
ex) 8+ 6 - 4 = 10
6+6 - 4 = 8 



*/
