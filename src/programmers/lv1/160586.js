function solution(keymap, targets) {
  const answer = [];
  const keyPressCount = {};

  keymap.forEach((keys) => {
    keys.split("").forEach((char, index) => {
      if (!keyPressCount[char]) {
        keyPressCount[char] = index + 1;
      } else {
        keyPressCount[char] = Math.min(keyPressCount[char], index + 1);
      }
    });
  });

  // 각 타겟 문자열에 대해 최소 키 횟수 계산
  targets.forEach((target) => {
    let totalPresses = 0;
    for (const char of target) {
      if (keyPressCount[char]) {
        totalPresses += keyPressCount[char];
      } else {
        totalPresses = -1;
        break;
      }
    }
    answer.push(totalPresses);
  });

  return answer;
}
