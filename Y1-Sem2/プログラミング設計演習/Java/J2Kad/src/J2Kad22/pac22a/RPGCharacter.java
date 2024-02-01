package J2Kad22.pac22a;

public class RPGCharacter {
    private static final String[] nameData = {
            "ピタゴラス",
            "アルキメデス",
            "エラストテネス",
            "ユークリッド",
            "フィボナッチ",
            "デカルト",
            "フェルマー",
            "パスカル",
            "オイラー",
            "ラプラス",
            "フーリエ",
            "ガウス",
            "ド・モルガン",
            "ブール",
            "リーマン",
            "ポアンカレ",
            "ラッセル",
            "ニュートン",
            "テイラー",

            "ケプラー",
            "ガリレオ",
            "ボイル",
            "フック",
            "ホイヘンス",
            "ベルヌイ",
            "ラグランジュ",
            "ファラデー",
            "ジュール",
            "フーコー",
            "ストークス",
            "マクスウェル",
            "マッハ",
            "レントゲン",
            "キュリー",
            "ラザフォード",
            "アインシュタイン",
    };
    private static int rest = nameData.length;
    private final String name;
    private Job p = null;

    public void setp(Job p){
        this.p = p;
    }


    public RPGCharacter() {
        int n = (int)(Math.random() * rest);
        name = nameData[n];
        nameData[n] = nameData[--rest];
        nameData[rest] = name;
        if (rest == 0) rest = nameData.length;
    }

    public String toString() { return name; }
    public void attack() {
        try{
            p.attack();
        }catch (NullPointerException e){
            System.out.println("攻撃方法を知らない！");
        }
    }
    public void defend() {
        try{
            p.defend();
        }catch (NullPointerException e){
            System.out.println("攻撃方法を知らない！");
        }
    }
}

interface Job{
    void attack();
    void defend();
}

// 職業クラス
class Fighter implements Job {
    public void attack() { System.out.println("武器で攻撃します！"); }
    public void defend() { System.out.println("盾で防御します！"); }
}
class Mage implements Job {
    public void attack() { System.out.println("攻撃の魔法を唱えます！"); }
    public void defend() { System.out.println("防御の魔法を唱えます！"); }
}
class Monk implements Job {
    public void attack() { System.out.println("素手で戦います！"); }
    public void defend() { System.out.println("素手で守ります！"); }
}
