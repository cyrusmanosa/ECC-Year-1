package J2Kad20;

/*
	�ۑ薼�FJ2Kad20D�u�����N���X�v
	�쐬���F2022/12/08
	�쐬�ҁF�c�����Y
*/
// SayHello�C���^�[�t�F�C�X
interface SayHello{ void hello(); }
// Greeting�N���X
class Greeting{ public static void greet(SayHello s){
        s.hello();
    } }
// OuterPerson�N���X
class OuterPerson implements SayHello{
    @Override
    public void hello(){
        System.out.println("�O���N���X�F����ɂ��́I");
    }
}
public class J2Kad20D {
    public static void main(String[] args) {
     OuterPerson s = new OuterPerson();
     Greeting.greet(s);
        class innerPerson implements SayHello{
            @Override
            public void hello(){
                System.out.println("�����N���X�F����ɂ��́I");
            }
        }
        innerPerson i = new innerPerson();
        Greeting.greet(i);
    }
}
