package J2Kad20;

/*
	�ۑ薼�FJ2Kad20B�u�����_���v
	�쐬���F2022/12/08
	�쐬�ҁF�c�����Y
*/
public class J2Kad20B {
    public static void main(String[] args) {
        Greeting.greet(new SayHello() {
            @Override
            public void hello() {System.out.println("�����_��?�F����ɂ��́I");}
         });
        Greeting.greet( () -> System.out.println("�����_��2�F����ɂ��́I"));
    }
}

