package chap08_class;

public class student {
//1.�������(�л��� �Ӽ�)
	String name;
	int age;
	String grade;
	
	
/*********** ������ �� �޼��� �� �Ϻ� ***************/
	//�л����� ������ ���̴�. �̸� ���� �г�
	public student(String name, int age, String grade) {	
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//�л� ���� ��� �޼��� 
	//�л����� ������ ����� ���̴�.
	public void displayInfo() {
		System.out.println("�л� �̸�" + name);
		System.out.println("����" + age);
		System.out.println("�г�" + grade);
	}

	
	
}
