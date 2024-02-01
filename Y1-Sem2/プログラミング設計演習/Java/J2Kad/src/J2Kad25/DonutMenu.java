package J2Kad25;

import java.awt.*;

public class DonutMenu implements Menu{
    private String[] names = new String[100];
    private int[] prices = new int[100];
    public DonutMenu() {
        names[0] = "�n�j�[�f�B�b�v";
        prices[0] = 120;
        names[1] = "�n�j�[�`����";
        prices[1] = 130;
        names[2] = "�`���R�����O";
        prices[2] = 140;
        prices[3] = -1;                  // �I���R�[�h
    }
    public String[] getNames() { return names; }
    public int[] getPrices() { return prices; }

    public MenuIterator iterator() { return new DonutIterator(names,prices); }
}

class DonutIterator implements MenuIterator{
    private String[] names = null;
    private int[] prices = null;
    private int i = 0;
    public DonutIterator( String[] names, int[] prices ){
        this.names = names;
        this.prices = prices;
    }
    public boolean hasNext(){ return (prices[i] != -1); }
    public MenuItem next() { return new MenuItem(names[i],prices[i++]); }
}