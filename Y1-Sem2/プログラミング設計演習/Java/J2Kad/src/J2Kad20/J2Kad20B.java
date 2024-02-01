package J2Kad20;

/*
	課題名：J2Kad20B「ラムダ式」
	作成日：2022/12/08
	作成者：田中太郎
*/
public class J2Kad20B {
    public static void main(String[] args) {
        Greeting.greet(new SayHello() {
            @Override
            public void hello() {System.out.println("ラムダ式?：こんにちは！");}
         });
        Greeting.greet( () -> System.out.println("ラムダ式2：こんにちは！"));
    }
}

