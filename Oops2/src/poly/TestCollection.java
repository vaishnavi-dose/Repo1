package poly;

import java.util.ArrayList;

/**
 * @author VaishnaviSunil
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list= new ArrayList<String>();
		ArrayList list2= new ArrayList();
		
		list.add("xyz");  //Only allows String
		list.add("V");
		
		list2.add(1);    //Any value
		list2.add("S");
		
		//System.out.println(list.get(0));
		System.out.println(list);
		System.out.println(list2);
		
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)=="V")  //i=0,1...
			System.out.println(i);

		}
		
		for(int j=0; j<10; j++)
		{
			list2.add(j);
			
		}
		System.out.println(list2);

	}

}
