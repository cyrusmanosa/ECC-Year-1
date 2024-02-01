package J2Kad20;
/*
	課題名：J2Kad20C「匿名クラス（無名クラス）」
	作成日：2022/12/08
	作成者：田中太郎
*/
public class J2Kad20C {
    public static void main(String[] args) {
        SayHello sh = new SayHello(){
            @Override
            public void hello() {
                System.out.println("匿名クラス1：こんにちは！");
            }
        };
        Greeting.greet(sh);


        Greeting.greet(new SayHello(){
                @Override
                public void hello() {System.out.println("匿名クラス2：こんにちは！");}
            }
        );
    }
}
