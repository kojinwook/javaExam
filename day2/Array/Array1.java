package day2.Array;

public class Array1 {
    public static void main(String[] args) {
// arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요
        int[]arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for(int i = 0; i < 10; i++){System.out.println(arr[i]);}
        // 정답
        int[] arr2 = new int[10]; // 자료형 개수구하기
        // 10개짜리 자료형을 구한다.
//        for(int i = 0; i < 10 ; i++) {arr2[i] = (i + 1) * 10;}
//        for(int i = 0; i < 10; i++) {System.out.println(arr2[i]);}
    }
}
