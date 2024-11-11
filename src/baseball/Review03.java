package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam teamYakuruto = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam teamBaystars = new BaseBallTeam("横浜ベイスターズ", 73, 68, 2);
        BaseBallTeam teamTigers = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam teamGiants = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam teamCarp = new BaseBallTeam("広島カープ", 66, 74, 3);
        BaseBallTeam teamDragons = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        double yakurutoRate = teamYakuruto.getRate();
        double baystarsRate = teamBaystars.getRate();
        double tigersRate = teamTigers.getRate();
        double giantsRate = teamGiants.getRate();
        double carpRate = teamCarp.getRate();
        double dragonsRate = teamDragons.getRate();

        BaseBallTeam [] teamList = {teamYakuruto, teamBaystars, teamTigers, teamGiants, teamCarp, teamDragons};
        double [] rateList = {yakurutoRate, baystarsRate, tigersRate, giantsRate, carpRate, dragonsRate};

        for(int i = 0; i <= teamList.length - 1; i++) {
            teamList[i].report(rateList[i]);
        }

    }

}
