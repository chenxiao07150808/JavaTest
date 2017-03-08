package list;

import java.util.Scanner;

public class Test {

	void showMenu() {

		Scanner scan = new Scanner(System.in);
		ArrayListDemo arrayListDemo = new ArrayListDemo();

		while (true) {
			System.out.println("请输入你要进行的操作1:添加2删除3修改4查询5排序6输出7退出");
			int choose = scan.nextInt();
			switch (choose) {
			case 1: {
				System.out.println("请输入你要添加的学生的学号 姓名 年龄");
				int num = scan.nextInt();
				String name = scan.next();
				int age = scan.nextInt();
				arrayListDemo.insert(num, name, age);
				break;
			}
			case 2: {
				System.out.println("请输入你要删除的学生的学号");
				int num = scan.nextInt();
				arrayListDemo.delete(num);
				
				break;
			}
			case 3:{
				System.out.println("请输入你要修改的学生的学号");
				int num = scan.nextInt();
				System.out.println("请输入你要修改后的学生的学号 姓名 年龄");
				int num1 = scan.nextInt();
				String name1 = scan.next();
				int age1 = scan.nextInt();
				arrayListDemo.update(num, num1, name1, age1);
				;
				break;
			}
			case 4:
				System.out.println("请输入你要查询的学生的学号");
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
