package J2Kad12Challenge;
public class DonutMenu {
    private String[] names;
    private int[] price;

    public DonutMenu() {
        names = new String[100];
        price = new int[100];

        names[0] = "ハニーディップ";
        price[0] = 120;

        names[1] = "ハニーチュロ";
        price[1] = 130;

        names[2] = "チョコリング";
        price[2] = 140;

        price[3] = -1;                  // 終了コード
    }
    public String toString() { return "ECCドーナツ"; }
    public String[] getNames() { return names; }
    public int[] getPrice() { return price; }
}
