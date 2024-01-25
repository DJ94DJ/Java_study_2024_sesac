package _05_class._06_interface;

public class Mp3Player implements Music {
    private String title;

    @Override
    public void play(String title) {
        this.title = title;
        System.out.println("Mp3 플레이어에서 '" + title + "' 음악을 재생합니다.");
    }

    public void stop() {
        System.out.println("Mp3 플레이어에서 '" + title + "' 음악을 정지합니다.");
    }
}