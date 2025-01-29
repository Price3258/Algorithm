/*
https://www.acmicpc.net/problem/1158

요세푸스 문제는 다음과 같다.

1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다. 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다. 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
*/

function solution(n, k) {
  let answer = [];
  let people = Array.from({ length: n }, (_, i) => i + 1);

  while (people.length > 0) {
    for (i = 0; i < k - 1; i++) {
      console.log(people);
      people.push(people.shift());
    }

    answer.push(people.shift());
  }

  return answer;
}

console.log(solution(7, 3)); // 3, 6, 2, 7, 5, 1, 4

/*
1 2 3 4 5 6 7
3 4 5 6 7 1 2 
cut 
4 5 6 7 1 2 
6 7 1 2 4 5
cut
7 1 2 4 5
2 4 5 7 1
cut
4 5 7 1
7 1 4 5
cut
1 4 5
5 1 4
cut
1 4
4 1
1 4
cut 
4
4
cut
end



k-1 까지 자르고 뒤로 붙이면 k번째 인덱스가 제일 앞으로 옮. 
이걸 다시 잘라서 배열에 넣도록

*/
