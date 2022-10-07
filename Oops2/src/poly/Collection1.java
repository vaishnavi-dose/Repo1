package poly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> list= new ArrayList<String>();
		  
		  list.add("a"); list.add("b"); list.add("b"); list.add("c"); list.add("c");
		  list.add("c"); list.add("d"); list.add("d"); list.add("d"); list.add("d");
		  
		  //System.out.println(list.get(0)); System.out.println(list);
		  
		  Set<String> set=new HashSet<String>(); Set set2=new HashSet();
		  
		  set.add("a"); set.add("a"); set.add("b");
		  
		  set2.add("x"); set2.add(5);
		  
		  System.out.println(set); System.out.println(set2);
		 
		
		Map<String, Integer> hm
		= new HashMap<String, Integer>();
		
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);
		hm.put("e", 100);
		hm.get("a");

		System.out.println(hm);

	}

}
