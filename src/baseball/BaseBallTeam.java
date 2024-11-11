package baseball;

public class BaseBallTeam {
    // メンバ変数
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    public BaseBallTeam() {}
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // メソッド
    public double getRate() {
        return (double) win / (win + lose);
    }

    public void report(double rate) {
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + rate + "です。");
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWin() {
        return win;
    }
    public void setWin(int win) {
        this.win = win;
    }
    public int getLose() {
        return lose;
    }
    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getDraw() {
        return draw;
    }
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
