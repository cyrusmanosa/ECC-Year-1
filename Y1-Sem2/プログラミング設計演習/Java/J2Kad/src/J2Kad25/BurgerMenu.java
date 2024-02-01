package J2Kad25;

import java.util.ArrayList;

public class BurgerMenu{
    private ArrayList <MenuItem> menu = new ArrayList<>();
    public BurgerMenu() {
        menu.add ( new MenuItem("�n���o�[�K�[", 150) );
        menu.add ( new MenuItem("�`�[�Y�o�[�K�[", 180) );
        menu.add ( new MenuItem("�r�b�O�}�b�N", 410) );
    }
    public ArrayList<MenuItem> getMenu() { return menu; }
    public MenuIterator iterator() { return new BurgerIterator( getMenu() ); }
}

class BurgerIterator implements MenuIterator{
    private ArrayList<MenuItem> menu;
    private int i = 0;
    public BurgerIterator(ArrayList<MenuItem> menu) { this.menu = menu; }
    public boolean hasNext() { return menu.size() > i ; }
    public MenuItem next() { return menu.get(i++); }
}
