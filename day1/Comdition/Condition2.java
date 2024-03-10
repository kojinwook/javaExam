package day1.Comdition;

public class Condition2 {
    public static void main(String[] args) {
        // 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
        int num1 = 10;
        int num2 = 15;
        if (num1 > num2) {
            System.out.println(num1 - num2);
        } else {
            System.out.println(num2 - num1);
        }
    }
}
//int result1 = 0;
//int result2 = 0;
// result 를 쓰는 이유는 System.out.println()을 간략히 쓰려고 하는것!
// if문만
// if(num1 >= num2) {result1 = num1 - num2;}
// if(num1 < num2) {result1 = num2 - num1;}
// System.out.println(result1);
// if문과 else 문
// if(num1 > num2) {result2 = num1 - num2;}
// else {result2 = num2 - num1;}
//  System.out.println(result2);