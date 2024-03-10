package day3.Return;
// 1 부터 n까지 수 중 짝수인 것만 출력
public class Return4 {
    public static void main(String[] args) {
        printEven(10); // 출력: 2 4 6 8 10
        printEven(20); // 출력: 2 4 6 8 10 12 14 16 18 20
        printEven(5); // 출력: 2 4
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }


    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {

            // isEven 메서드를 이용.
            boolean b = isEven(i);
            if (b) {
                System.out.println(i);
            }


        }
    }
}
