package day5.Constructor;

public class Constructor5 {
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;
        System.out.println(엄지손가락_길이 + "cm");

        // 출력 : 5cm
    }
}
class 사람{
    public 사람(){
        this.a왼팔 = new 팔();
        this.a왼팔.a손 = new 손();
        this.a왼팔.a손.a엄지손가락 = new 엄지손가락();
        this.a왼팔.a손.a엄지손가락.길이 = 5;
    }

    팔 a왼팔;


}
class 팔{


    손 a손;
}
class 손{

   엄지손가락 a엄지손가락;
}
class 엄지손가락{
    int 길이 = 5;

}
