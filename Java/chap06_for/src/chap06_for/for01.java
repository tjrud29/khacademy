package chap06_for;

public class for01 {

	public static void main(String[] args) {
		/*
		 for���� ���α׷��ֿ��� �ݺ��۾��� �����ϱ� ���� ���Ǵ� �����
		 Ư���� ������ �����ϴ� ���� �ڵ� ����� �ݺ� �����ϴµ� ���
		 ��κ��� ���α׷��� ���� for���� ���� ����
		 for (�ʱ�ȭ; ����; ����) {
		 	//������ ���� ��� �ݺ������� ������ �ڵ�
		 	 }
		 �ʱ�ȭ  : �ݺ����� ���۵� �� �� ���� ����Ǵ� �κ�����,
		 		 �ݺ� ������ �ʱ�ȭ �ϴ� ������ �Ѵ�.
		 ���ǽ�   : �ݺ����� ����� ������ �˻��ϴ� �κ�����
		 		������ ���� ��쿡�� �ݺ��ڵ� ��� ���� �� ����
		 ������  : �ݺ� ������ ������Ŷ�ų� ���ҽ�Ű�� �κ�����,
		 �ݺ� ��� ���� �� ����
		 * */

			for (int i =1; i <= 5; i++) {
				//���� i<=5 �� ���� ��쿡 ����Ǵ� ����
				System.out.println(i);
			}
			
			for (int i =0; i <= 5; i++) {
				System.out.println(i);
			}
			
			for (int i = 2; i<=7; i++) {
				System.out.println(i);
			}
			
			for (int i = 10; i>=5; i--) {
				System.out.println(i);
			}
			int sum = 0;
			for(int i = 1; i<=10; i++) {
				
				sum += i;
				System.out.println("1���� 10������ �� :" +sum);
			}
			
			//sum�� ���� 1~5������ ������ ����ϱ�
			
			
			sum = 0;
			for(int z = 1; z <= 5; z++) {
			sum += z;
			System.out.println(sum);
			}
			
			int sum2 = 10;
			for (int a = 5; a>= 2; a--) {
				sum2 -= a;
				System.out.println(sum2);
			}
			
			int mul = 1;
			for(int i = 1; i <= 9; i++) {
				mul = 2 * i;
				System.out.println(mul);
			}
			
			
			
		
	}

}
