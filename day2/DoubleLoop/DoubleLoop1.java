package day2.DoubleLoop;
// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
public class DoubleLoop1 {
    public static void main(String[] args) {
    for(int i = 2; i<=9;i++){for(int j =2; j<=9; j+=2){
        System.out.println(i +"*"+j +"="+(i*j));}}
        // 두번째 if 절 쓴것!
//        for(int i = 2; i<10; i++){for(int m =1;m<10;m++){if(m % 2==0){
//            System.out.println(i +"*"+m+"="+(m*i));
//        }}}
    }
}
