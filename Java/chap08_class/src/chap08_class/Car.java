package chap08_class;

public class Car {
 //1.���� �ʵ� �������
	String brand;		//�귣��
	String model;		//��
	int speed;			//�ӵ�
	boolean engineOn;	//���� ����
	//**************************************************//
	//������� ���� ��� �޼���� ����
	
//2.�����ڴ� �޼����� �Ѱ��� ����
	//���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = true;	
	}
	
//���� ���� �޼���
	public void startEngine() {
		//���࿡ ������ true :���� �õ�
		if(true) {
			System.out.println("������ �õ��մϴ�.");//��¸޼ҵ� �ۼ� 
		}else {
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");//������ false : ������ �̹� ����
		}
		
		
		
		
		
	}
	
	//���� �޼���
	public void acclerate(int amount) {
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			System.out.println("�ӵ� ���Դϴ�.");
		}else {
			//������ false�� ������ ���� �־� �ӵ��� �� �� ����.
			System.out.println("�ӵ��� �� �� ����.");
		}
		
		
		
		
	}
	
}
