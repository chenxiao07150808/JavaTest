package practiceDome;

import java.util.*;

public class ListDome {
  
	public static void main(String[] args) {
		 List list=new ArrayList();
		   list.add("�й��˰��Լ��Ĺ���");
		   list.add("��Ҫ���Լ��Ĺ��Ҳ���Ϊ���ҷ����Լ�������");
		   for(int i=0;i<list.size();i++){
			   System.out.println(list.get(i));
		   }
		   list.remove(1);

	}

}
