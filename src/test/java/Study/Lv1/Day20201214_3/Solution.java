package Study.Lv1.Day20201214_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    //문자열 내 마음대로 정렬하기

    //문제 설명
    //문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

    //제한사항
    //strings는 길이 1 이상, 50이하인 배열입니다.
    //strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
    //strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
    //모든 strings의 원소의 길이는 n보다 큽니다.
    //인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.

    //결과 ["car", "bed", "sun"]
    private String[] strings = {"sun", "bed", "car","aar"};
    private int n = 1;

    //결과 ["abcd", "abce", "cdx"]
    //private String[] strings = {"abce", "abcd", "cdx"};
    //private int n = 2;

    //public String[] solution(String[] strings, int n)
    public String[] solution() {
        String[] newStrings = strings.clone();

        return Arrays.stream(newStrings)
                .sorted((o1, o2) -> o1.charAt(n) == o2.charAt(n) ? o1.compareTo(o2) : o1.substring(n).compareTo(o2.substring(n)))
                .toArray(String[]::new);
    }

    public void GetSolution() {
        System.out.println(Arrays.toString(solution()));
    }
}