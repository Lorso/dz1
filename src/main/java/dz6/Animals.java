package dz6;

public abstract class Animals {
    private String nickname;

    private final int runBarrier;

    private final int swimBarrier;

    private int count = 0;


    public Animals(String nickname, int runBarrier, int swimBarrier) {
        this.nickname = nickname;
        this.runBarrier = runBarrier;
        this.swimBarrier = swimBarrier;
        this.count++;
    }

    public int getCount() {
        return count;
    }

    public void actionRun(int runDistant) {
        if (runDistant <= runBarrier) {
            System.out.println(nickname + " Пробежал " + runDistant);
        } else {
            System.out.println(nickname + " Не смог пробежать " + runDistant);
        }
    }

    public void actionSwim(int swimDistant) {
        if (swimDistant <= swimBarrier) {
            System.out.println(nickname + " Проплыл " + swimDistant);
        } else {
            System.out.println(nickname + " Не смог проплыть " + swimDistant);
        }


    }
}
