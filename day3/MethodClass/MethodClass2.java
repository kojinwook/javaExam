package day3.MethodClass;

public class MethodClass2 {
    public static void main(String[] args) {
        car c1 = new car();// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
        car c2 = new car();// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
         // 각 자동차가 자신의 최고속력으로 달리게 해주세요.
        c1.n = 220;
        c1.run(); // 출력 : 자동차가 최대속력 220km로 달립니다.
        c2.n = 250;// 출력 : 자동차가 최대속력 250km로 달립니다.
        c2.run();
    }
}
class car{int n;
    void run(){
        System.out.println("자동차가 최대속력"+n+"km로 달립니다.");
    }

}
