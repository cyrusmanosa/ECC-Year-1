package J2Kad20;
/*
	�ۑ薼�FJ2Kad20C�u�����N���X�i�����N���X�j�v
	�쐬���F2022/12/08
	�쐬�ҁF�c�����Y
*/
public class J2Kad20C {
    public static void main(String[] args) {
        SayHello sh = new SayHello(){
            @Override
            public void hello() {
                System.out.println("�����N���X1�F����ɂ��́I");
            }
        };
        Greeting.greet(sh);


        Greeting.greet(new SayHello(){
                @Override
                public void hello() {System.out.println("�����N���X2�F����ɂ��́I");}
            }
        );
    }
}
