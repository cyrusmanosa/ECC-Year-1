package J2Kad10;

public class Janken {

    enum Hand {
        GU("グー", "チョキに勝って、パーに負けます！"),
        CHOKI("チョキ", "パー勝って、グーに負けます！"),
        PA("パー", "グーに勝って、チョキに負けます！");
        public String name;
        public String feature;

        Hand(String name, String feature) {
            this.name = name;
            this.feature = feature;
        }
    }

    // 勝ち負け、ドローをenumで定義
    enum Result {
        WIN("あなたの勝ちです！"),
        LOSE("あなたの負けです！"),
        DRAW("引き分けです！");
        public String msg;
        Result(String msg){this.msg = msg;}
    }
    public static Result[][] resultTbl = {
            {Result.DRAW,Result.WIN,Result.LOSE},
            {Result.LOSE,Result.DRAW,Result.WIN},
            {Result.WIN,Result.LOSE,Result.DRAW}
    };
}
