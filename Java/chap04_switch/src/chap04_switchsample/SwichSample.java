package chap04_switchsample;

public class SwichSample {

	public static void main(String[] args) {
		// switch��
		/*
		 Ư�� ������ ǥ������ ���� ���� �پ��� ��츦 ó���ϴ� ���� ����
		 switch���� �Ϸ��� case���� �ش� ���� ���Ͽ� ��ġ�ϴ� ��쿡 �ڵ��� ����
		 �� case�� �ڿ��� ��ġ�ϴ� ���̳� ǥ������ ����
		
		switch( ���� �Ǵ� ǥ����)
			case ��1 :
			//�� 1�� �ش��ϴ� �ڵ�
			 break; // �ش� ����� ������ �ߴ��ϴ� ����
			case ��2 :
			//�� 2�� �ش��ϴ� �ڵ�
			 break;
			default : 
			 //���� ��� ���̽��� ��ġ���� ���� �� ����Ǵ� �ڵ�
		 * */
		int day = 5;
		switch (day) { // day == 30
		case 1 : //case�� 30�̸� ������ ��� //30�� �ƴϱ� ������ false
			System.out.println("������");//��� �ȵ�
			break;
		case 2 :
			System.out.println("ȭ����");
			break;
		case 30 :
			System.out.println("������");
			break;
			default :
			System.out.println("�ָ�");
			
		
		}
		
		int choice = 3;
		switch (choice) {
		
		case 1 :
			System.out.println("�Ƹ޸�ī��");
			break;// �극��ũ�� �������� ������ �������� ���̶�� �ص� �Ʒ��� ���̽������  ����ȴ�.
		case 2 :
			System.out.println("���ν����");
			break;
		case 3 : 
			System.out.println("ī���");
			break;
		case 4 :
			System.out.println("������");
			break;
			 
			default :
				System.out.println("�ֹ����");
		}
		
			
		
		
			
	}

}
