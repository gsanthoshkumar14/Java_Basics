package sample_prog;

import java.util.HashMap;
import java.util.Map;

public class duplicatesChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ALLWAYS";
		char[] c = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<c.length; i++) {
			int count=1;
			if(map.containsKey(c[i])) {
				count=count+1;
				//map.put(c[i], count);
				map.replace(c[i], count);
			}
			else {
				map.put(c[i], count);
			}
		}
		
		for(char i : map.keySet()) {
			System.out.println(i + " : " + map.get(i));
			
		}
			
		

	}

}
