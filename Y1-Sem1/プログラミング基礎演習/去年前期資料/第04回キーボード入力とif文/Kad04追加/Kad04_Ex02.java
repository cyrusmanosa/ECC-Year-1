import java.util.Scanner;
import java.util.Random;

public class Kad04_Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("����ɂ��́I");
		System.out.println("�킽���͐肢�}�V�[����I");
		System.out.println("���Ȃ��̂��Ƃ����Ă������I��낵���ˁI");
		System.out.println();
		
		System.out.print("���O�͉��Ă����́H");
		String name = sc.next();
		System.out.print("�N��͂����H");
		int age = sc.nextInt();
		System.out.println();
		
		System.out.println(name + "����A����ɂ��́I");
		System.out.println("���Ȃ���" + age + "�΂Ȃ�ł��ˁI");
		System.out.println();
		
		final int MAXROLL = 101;
		int love = rand.nextInt(MAXROLL);
		int gold = rand.nextInt(MAXROLL);
		int total = rand.nextInt(MAXROLL);
		
		System.out.println(name + "����̍����̉^����");
		System.out.println("���u�^�F" + love);
		System.out.println("���@�^�F" + gold);
		System.out.println("�S�̉^�F" + total);
		System.out.println();
		
		if ((love > gold)&&(love > total)) {
			System.out.println("���u�^���ō��ˁI");
		}
		else if (gold >total) {
			System.out.println("���^�������݂����ˁI");
		}
		else {
			System.out.println("�����������Ƃ����邩���ˁI");
		}
	}
}
