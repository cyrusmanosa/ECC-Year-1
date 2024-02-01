package J2Kad28;

public class ECCSoft {
    public ECCSoft() {
        System.out.println("信頼と実績のECCソフト株式会社です！");
        System.out.println("どんな課題でも私たちが真摯に解決します！！");
    }

    public void work() {
        SubContractor sub;
        switch( (int)(Math.random() * 3) ) {
            default:
                case 0: sub = ECCService.getInstance();
                        break;
                case 1: sub = new ECCPartners();
                        break;
                case 2: sub = new ECCSolutions();
                        break;
        }
        System.out.println(sub + " (ID:" + sub.getMyID() + ") に丸投げします！");
        sub.work();
    }
}

// 下請け
abstract class SubContractor {
    private String name;
    private static int count = 0;
    private int myID;
    public int getMyID(){ return myID; }
    public SubContractor(String name) {
        myID = count++;
        this.name = name;
    }
    public String toString() { return name; }
    public abstract void work();
}

// ECCサービス株式会社
class ECCService extends SubContractor {
    private static ECCService instance = new ECCService();
    public static ECCService getInstance(){ return instance; }
    private ECCService() { super("ECCサービス株式会社"); }
    public void work() { System.out.println("ECCサービス株式会社「何とかがんばってみます！」"); }
}
// ECCパートナーズ株式会社
class ECCPartners extends SubContractor {
    public ECCPartners() { super("ECCパートナーズ株式会社"); }
    public void work() { System.out.println("ECCパートナーズ株式会社「下請けはつらいなー！」"); }}

// ECCソリューションズ株式会社
class ECCSolutions extends SubContractor {
    public ECCSolutions() { super("ECCソリューションズ株式会社"); }
    public void work() { System.out.println("ECCソリューションズ株式会社「よろこんでお引き受けいたします！」"); }}

