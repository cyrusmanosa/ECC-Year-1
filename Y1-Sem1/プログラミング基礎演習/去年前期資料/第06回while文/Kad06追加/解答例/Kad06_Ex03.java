import java.util.Scanner;

public class Kad06_Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����ɂ��́I");
		System.out.println("�킽���̓��W�ł��}�V�[����I��낵���ˁI�I");
		System.out.println();
		
		int sum = 0;
		while(true) {
			int num;
			do {
				System.out.print("�����A���𔃂��́H�i1�F�ٓ�500�~�A2�F���ɂ���150�~�A3�F����120�~�A0�F��������Ȃ��j��");
				num = sc.nextInt();
			} while((num < 0)||(3 < num));
			if (num == 0) break;
			
			switch(num) {
			case 1:
				System.out.println("���ٓ���500�~�ł��I");
				sum += 500;
				break;
			case 2:
				System.out.println("���ɂ����150�~��I");
				sum += 150;
				break;
			case 3:
				System.out.println("������120�~�ˁI");
				sum += 120;
				break;
			}
			
			System.out.println("���݂̍��v���z�F" + sum + "�~");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("����ō��݂�" + (int)(sum * 1.08) + "�~�ɂȂ�܂��I");
		System.out.println("���肪�Ƃ��������܂����I�I");
	}
}
