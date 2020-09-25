/**
 * 가운데 글자 가져오기
 * https://programmers.co.kr/learn/courses/30/lessons/12903?language=javascript
 */
function solution(s) {
	var mid = s.length/2;
	var limit = mid + 1;
	mid = s.length % 2 === 0 ? mid - 1 : mid;
    
    return s.substring(mid, limit);
}

console.log(solution("abcde"));
console.log(solution("qwer"));