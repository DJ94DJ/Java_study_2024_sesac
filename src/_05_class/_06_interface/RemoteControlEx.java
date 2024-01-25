package _05_class._06_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        //interface도 하나의 타입, 따라서 변수의 타입으로 사용가능
        // - interface는 참조타입 -> null 대입가능
        RemoteControl rc;

        // rc 변수에 Televison 객체를 대입
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // rc 변수에 Audio 갤체를 대입 (교체)
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

    }
}
