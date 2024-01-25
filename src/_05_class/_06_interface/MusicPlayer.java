package _05_class._06_interface;

public class MusicPlayer {
    public static void main(String[] args) {
        Music msc;

        msc = new Mp3Player();
        msc.play("윤하 오르트구름");
        msc.stop();

        msc = new CdPlayer();
        msc.play("자우림 있지");
        msc.stop();
    }
}

