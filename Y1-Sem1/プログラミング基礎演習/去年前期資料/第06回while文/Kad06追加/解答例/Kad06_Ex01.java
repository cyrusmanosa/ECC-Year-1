import java.util.Scanner;

public class Kad06_Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�V��������܂肽���߂邩���킵�܂��I");
		System.out.print("���Ȃ��̃p���[����͂��Ă���������");
		int power = sc.nextInt();
		
		int thickness = 1;				// �V���́u���݁v
		int count = 0;					// �܂肽���񂾉�
		while (power >= thickness) {
			thickness *= 2;
			count++;
			System.out.println("�V����܂肽���񂾁I������" + thickness);
		}
		
		System.out.println(count + "��܂肽���߂��I");
	}
}
