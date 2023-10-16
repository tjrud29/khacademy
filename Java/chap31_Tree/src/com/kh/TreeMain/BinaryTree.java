package com.kh.TreeMain;
/*
 * ��带 �����ϰ� ���ư��� ����ϴ� ����Ʈ��
 * ���� ��ȸ : root(�Ѹ�)�� ���� �湮
 * ���� ��ȸ : ���� ���� Ʈ���� �湮 �� root(�Ѹ�) �湮
 * ���� ��ȸ : ���� Ʈ�� ��� �湮 �� root(�Ѹ�) �湮
 * ���� ��ȸ : �� �� node�� ���� �Ʒ��������� ���ʴ�� �湮
 * */
public class BinaryTree {
	TreeNode root;                                                
	public BinaryTree() {
		this.root = null;										
	}
	/*
	 insert�޼���� insertRec�޼���� ���� Ʈ���� ���ο� ��带 �����ϴµ� ��� 
	 * */
	//insert : �ܺο� ����Ǵ� �޼���
	public void insert(int data) {
		root = insertRec(root, data);
	}
	//insertRec : ���� ���� �۾� �޼���
	//��������� ��带 �����ϰ� ������ ��ġ�� ã�� ���ο� ��带 ����
	//����� : �ڱ� �ڽ��� �����ϰ� �ٽ� �ڱ� �ڽ��� ����ؼ� ���� ����
	private TreeNode insertRec(TreeNode root, int data) {
		if( root == null ) {
			root = new TreeNode(data);
			return root;
		}
		
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.right, data);
		}
		return root;
	}
	
	public void inOrderT() {//inOrder Traversal ������ȸ
		inOrderTR(root);
	}
	/*
	 inOrderT : ���� ��ȸ
	 inOrderTR : ���� ��ȸ�� �����Ͽ� Ʈ���� ��带 ����ϴµ� ���
	 ���� ����Ʈ�� ������ ������ ����Ʈ�� ������ ��� ��� 
	 * */
	private void inOrderTR(TreeNode root) {
		if(root != null) {
			inOrderTR(root.left);
			System.out.println("root.left" +root.data);
			inOrderTR(root.right);
			System.out.println("root.right" +root.data);
		}
	}
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		
		System.out.println("���� Ʈ�� ���� ��ȸ ��� : "  );
		tree.inOrderT();
		
	}

}