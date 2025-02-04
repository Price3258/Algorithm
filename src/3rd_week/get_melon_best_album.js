/*
    https://school.programmers.co.kr/learn/courses/30/lessons/42579
    Q. 멜론에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 한다.

    노래는 인덱스로 구분하며, 노래를 수록하는 기준은 다음과 같다.

    1. 속한 노래가 많이 재생된 장르를 먼저 수록한다. (단, 각 장르에 속한 노래의재생 수 총합은 모두 다르다.)

    2. 장르 내에서 많이 재생된 노래를 먼저 수록한다.

    3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록한다.

    노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,

    베스트 앨범에 들어갈 노래의 인덱스를 순서대로 반환하시오.

*/

/*
    장르별로 재생수를 더해서 묶어두고, 재생수가 많은 장르부터 순서대로 2개씩 뽑기?? 뽑을 때 인덱스가 작은애부터, 넣도록, 
    {
      classic: [{index:0, count: 500, ...}],
      pop: [{index:1, count:150}]
    }
      장르 keys 로 장르별 토탈 카운트를 계산하여 sort 하는 값 하나. 
      
*/

function get_melon_best_album(genres, plays) {
  const genrePlayCount = {};
  const genreSongs = {};
  genres.forEach((genre, index) => {
    const play = plays[index];
    if (!genrePlayCount[genre]) {
      genrePlayCount[genre] = 0;
      genreSongs[genre] = [];
    }
    genrePlayCount[genre] += play;
    genreSongs[genre].push({ id: index, play });
  });

  const sortedGenres = Object.keys(genrePlayCount).sort(
    (a, b) => genrePlayCount[b] - genrePlayCount[a]
  );
  const answer = [];

  sortedGenres.forEach((genre) => {
    const songs = genreSongs[genre];
    songs.sort((a, b) => b.play - a.play || a.id - b.id);
    answer.push(...songs.slice(0, 2).map((song) => song.id));
  });

  return answer;
}

console.log(
  "정답 = [4, 1, 3, 0] / 현재 풀이 값 = ",
  get_melon_best_album(
    ["classic", "pop", "classic", "classic", "pop"],
    [500, 600, 150, 800, 2500]
  )
);
console.log(
  "정답 = [0, 6, 5, 2, 4, 1] / 현재 풀이 값 = ",
  get_melon_best_album(
    ["hiphop", "classic", "pop", "classic", "classic", "pop", "hiphop"],
    [2000, 500, 600, 150, 800, 2500, 2000]
  )
);
