package J2Kad27;

import java.util.ArrayList;

// ���j���[�\���C���^�[�t�F�C�X
interface Component { void print(Printer printer); }
// ���j���[�i���i���j
class MenuItem implements Component {
    private String name;
    private int price;
    private int cal;
    public MenuItem(String name, int price, int cal) {
        this.name = name;
        this.price = price;
        this.cal = cal;
    }
    public String toString() { return name; }
    public int getPrice() { return price; }
    public int getCal() { return cal; }
    public void print( Printer printer ){ printer.print(this); }
}
// ���j���[�i�ꗗ�j
public class Menu implements Component {
    private String name;
    private ArrayList<Component> menuList = new ArrayList<>();
    public Menu(String name) { this.name = name; }
    public String toString() { return name; }
    public ArrayList <Component> getList() { return menuList; }
    public void add (Component item) { menuList.add( item ); }
    public void print (Printer printer) {printer.print(this);}
}
