package list;

import java.util.*;

public class ArrayListDemo {
	List list = new ArrayList();

	void insert(int num, String name, int age) {
		Student stu = new Student(num, name, age);
		list.add(stu);
	}

	void delete(int num) {
		int index = getIndex(num);
		if (index == -1) {
			System.out.println("该学号不存在!!");
		} else {
			list.remove(index);

		}

	}

	void update(int num, int num1, String name1, int age1) {

		int index = getIndex(num);
		Student stu = new Student(num1, name1, age1);
		list.set(index, stu);

	}

	void query(int num) {
		
		int index = getIndex(num);
		
		list.get(index);

		
	}

	void sort() {Collections.sort(list, new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			Student stu1=(Student)o1;
			Student stu2=(Student)o2;
			if(stu1.getAge()<stu2.getAge()){
				return 1;
			}else if(stu1.getAge()>stu2.getAge()){
				return -1;
			}else{
				return 0;
				
			}
		}
	});

	}

	void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

	int getIndex(int num) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Student stu = (Student) list.get(i);
			if (num == stu.getNum()) {
				index = i;
				break;
			}
		}
		return index;
	}
}
