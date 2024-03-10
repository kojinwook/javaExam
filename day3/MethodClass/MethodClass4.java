package day3.MethodClass;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요
public class MethodClass4 {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
    static void printValue(int n ){
        System.out.println(n);
    }
    static void printValue(String m){
        System.out.println(m);
    }
}

