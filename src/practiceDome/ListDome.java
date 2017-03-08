package practiceDome;

import java.util.*;

public class ListDome {
  
	public static void main(String[] args) {
		 List list=new ArrayList();
		   list.add("中国人爱自己的国家");
		   list.add("主要爱自己的国家才能为国家奉献自己的力量");
		   for(int i=0;i<list.size();i++){
			   System.out.println(list.get(i));
		   }
		   list.remove(1);

	}

}
