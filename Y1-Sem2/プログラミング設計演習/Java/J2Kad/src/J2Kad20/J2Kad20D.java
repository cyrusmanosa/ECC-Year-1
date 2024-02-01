package J2Kad20;

/*
	課題名：J2Kad20D「内部クラス」
	作成日：2022/12/08
	作成者：田中太郎
*/
// SayHelloインターフェイス
interface SayHello{ void hello(); }
// Greetingクラス
class Greeting{ public static void greet(SayHello s){
        s.hello();
    } }
// OuterPersonクラス
class OuterPerson implements SayHello{
    @Override
    public void hello(){
        System.out.println("外部クラス：こんにちは！");
    }
}
public class J2Kad20D {
    public static void main(String[] args) {
     OuterPerson s = new OuterPerson();
     Greeting.greet(s);
        class innerPerson implements SayHello{
            @Override
            public void hello(){
                System.out.println("内部クラス：こんにちは！");
            }
        }
        innerPerson i = new innerPerson();
        Greeting.greet(i);
    }
}
