package J2Kad27;

public class Printer {
    public void print(MenuItem item){
        System.out.println( item.toString() + ":" + item.getPrice() + "‰~");
    }
    public void print( Menu menu){
        System.out.println("{" + menu.getList() + "}");
    }
}

class CalPrinter extends Printer{
    public void print( MenuItem item ){
        System.out.println(item.toString() + ":" + item.getPrice() + "‰~ (" + item.getCal() + "Kcal)");
    }
}

class LinePrinter extends Printer{
    public void print( MenuItem item ){
        System.out.print(item.toString() + "/");
    }
}

class BlockPrinter extends Printer{
    private int level = 0;
    private void indent() {
        for (int i = 0; i < level; i++) {
            System.out.print('\t');
        }
    }

    public void print(Menu menu){
        System.out.println();
        indent();
        System.out.println(menu + "{");
        ++level;
        for (var item : menu.getList()){
            indent();
            item.print(this);
        }
        --level;
        indent();
        System.out.println("}");
    }
}
