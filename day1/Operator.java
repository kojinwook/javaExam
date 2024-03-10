package day1;

public class Operator {
    public static void main(String[] args) {
        // 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.
        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println(false);
        }

        if (c == false) {
            System.out.println(true);
        }

        // `!` => 반전
        if (!c) {
            System.out.println(true);
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println(false);
        }

        boolean d = true;

        if (c != d) {
            System.out.println(true);
        }
    }
}
