package J2Kad20;

class Outer{ // 外部クラス
    void sampleMethod(){
        class Inner{ // 内部クラス(クラスの中でクラスの宣言)
            void intro(){
                System.out.println("内部クラスのメソッドが実行されています。");
            }
        }
        System.out.println("外部クラスのメソッドが実行されています。");

        Inner inner = new Inner(); // 内部クラスのインスタンスを生成
        inner.intro();
    }
}

public class Sample{
    public static void main(String[] args) {
        Outer outer = new Outer(); // 外部クラスのインスタンスを生成
        outer.sampleMethod();
    }
}
