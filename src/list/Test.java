package list;

import java.util.Scanner;

public class Test {

	void showMenu() {

		Scanner scan = new Scanner(System.in);
		ArrayListDemo arrayListDemo = new ArrayListDemo();

		while (true) {
			System.out.println("��������Ҫ���еĲ���1:���2ɾ��3�޸�4��ѯ5����6���7�˳�");
			int choose = scan.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("��������Ҫ��ӵ�ѧ����ѧ�� ���� ����");
				int num = scan.nextInt();
				String name = scan.next();
				int age = scan.nextInt();
				arrayListDemo.insert(num, name, age);
				break;
			}
			case 2: {
				System.out.println("��������Ҫɾ����ѧ����ѧ��");
				int num = scan.nextInt();
				arrayListDemo.delete(num);
				
				break;
			}
			case 3:{
				System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ��");
				int num = scan.nextInt();
				System.out.println("��������Ҫ�޸ĺ��ѧ����ѧ�� ���� ����");
				int num1 = scan.nextInt();
				String name1 = scan.next();
				int age1 = scan.nextInt();
				arrayListDemo.update(num, num1, name1, age1);
				;
				break;
			}
			case 4:
				System.out.println("��������Ҫ��ѯ��ѧ����ѧ��");
				int num = scan.nextInt();
				arrayListDemo.query(num);
				
				break;
			case 5:
				arrayListDemo.sort();
				
				break;
			case 6:
				arrayListDemo.print();
				break;
			case 7:
				System.exit(0);
				break;

			}

		}
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.showMenu();
	}

}
