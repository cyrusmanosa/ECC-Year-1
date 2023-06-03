package J1Kadai25;

public class JKad25B {
    public static void main(String[] args) {
        char num = 0;
        for (int i = 0; i < 16; i++){
            for (int j = 0; j < 16; j++){
                switch (num){
                    case '\n','\t','\b','\r':
                        System.out.print(".\t");
                        break;
                    default:
                        System.out.print(num + "\t");
                        break;
                }
                num += 0x01;
            }
            System.out.println();
        }
    }
}
