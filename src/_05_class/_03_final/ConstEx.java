package _05_class._03_final;
//상수
// - 변하지 않는 값
// - 상수는 객체마다 저장할 필요가 없고, 단 한 번만 값이 선언되면 되기 때문에
// Static 이면서 final인 특성을 갖는다.
// - 대문자로 작성하는 것이 관례
public class ConstEx {
    public static void main(String[] args) {
        System.out.println(Const.MAX_VALUE);
        System.out.println(Const.GREETING);

        // 값변경 안됨
        //Const.GREETING = "하이 " //<< 오류
    }

}
