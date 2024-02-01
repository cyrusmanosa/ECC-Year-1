package J2Kad23.pac23a;

import java.util.ArrayList;
import java.util.List;

class MenuItem implements Component{
    private String name;
    private int price;
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print() { System.out.println(name + "�F" + price); }
}
public class MenuList implements Component{
    protected String title;
    protected List<Component> menuList = new ArrayList<>();

    public MenuList(String title) { this.title = title; }
    public void add(Component item) { menuList.add(item); }
    public void print() {
        System.out.println();
        System.out.println(title);
        for (Component item : menuList) {
            item.print();
        }
    }
}

interface Component{ void print();}

// �T�u���j���[
class DrinkMenu extends MenuList {
    public DrinkMenu() {
        super("�� �h�����N���j���[ ��");
        add(new MenuItem("�R�[�q�[", 220));
        add(new MenuItem("�g��", 220));
    }
}
class DessertMenu extends MenuList {
    public DessertMenu() {
        super("�� �f�U�[�g���j���[ ��");
        add(new MenuItem("�`�[�Y�P�[�L", 350));
        add(new MenuItem("�A�C�X�N���[��", 150));
    }
}
// ���C�����j���[
class MorningMenu extends MenuList {
    public MorningMenu() {
        super("�� ���[�j���O���j���[ ��");
        add(new MenuItem("���[�j���O�Z�b�g", 400));
        add(new MenuItem("�Ă�����H", 600));
    }
}
class LunchMenu extends MenuList {
    public LunchMenu() {
        super("�� �����`���j���[ ��");
        add(new MenuItem("���ւ�胉���`", 680));
        add(new MenuItem("�V�F�t�̂������߃����`", 890));
        // �T�u���j���[�̒ǉ�
        add(new DrinkMenu());
    }
}
class DinnerMenu extends MenuList {
    public DinnerMenu() {
        super("�� �f�B�i�[���j���[ ��");
        add(new MenuItem("�a���n���o�[�O", 680));
        add(new MenuItem("�T�[���C���X�e�[�L", 1180));
        // �T�u���j���[�̒ǉ�
        add(new DrinkMenu());
        add(new DessertMenu());

    }
}

class AllMenu extends MenuList{
    public AllMenu(){
        super("������ ���ׂẴ��j���[ ������");
        add(new MorningMenu());
        add(new LunchMenu());
        add(new DinnerMenu());
    }
}
