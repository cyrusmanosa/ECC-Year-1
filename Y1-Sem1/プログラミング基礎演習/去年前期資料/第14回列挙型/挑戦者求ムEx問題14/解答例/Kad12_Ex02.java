public class Kad12_Ex02 {
	enum BloodType {
		A("�{����"), B("���I"), O("��炩"), AB("�V�˔�");
		
		public String features;
		
		private BloodType(String features) {
			this.features = features;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("*** ���t�^�̓����I ***");
		for (BloodType bt : BloodType.values()) {
			System.out.println(bt + "�^�F" + bt.features);
		}
	}
}
