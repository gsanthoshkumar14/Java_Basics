package sample_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamsDemo {

	public static void regularFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Gurusami");
		names.add("Seethalakshmi");
		names.add("Santhosh");
		names.add("Sorna");
		names.add("Vaibhav");
		int count =0;
		
		for(int i=0;i<names.size();i++) {
			String actual = names.get(i);
			if(actual.startsWith("S")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Gurusami");
		names.add("Seethalakshmi");
		names.add("Santhosh");
		names.add("Sorna");
		names.add("Vaibhav");
		System.out.println(names.stream().filter(s->s.startsWith("S")).count());
		
		long count1 = Stream.of("Gurusami","Seethalakshmi","Santhosh","Sorna","Vaibhav").filter(s->
		
		{
			s.startsWith("S");
			return false;
		}
				).count();
		System.out.println(count1);
		names.stream().forEach(s->System.out.println(s));
		System.out.println("------------------------------------------");
		names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
		
	}

	public static void streamMap() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Chokalingam");
		names.add("Umayal");
		names.add("Chidambram");
		names.add("Seetha");
		names.add("Sai");
		List<String> names1 = Arrays.asList("Gurusami","Seethalakshmi","Santhosh","Sorna","Vaibhav");
		//Stream.of("Gurusami","Seethalakshmi","Santhosh","Sorna","Vaibhav").filter(s->s.endsWith("i"))
		//.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newList = Stream.concat(names.stream(), names1.stream());
		//newList.forEach(s->System.out.println(s));
		boolean flag = newList.anyMatch(s->s.equalsIgnoreCase("Vaibhav"));
		System.out.println(flag);
	}
	
	public static void streamCollect() {
		List<String> ls = Stream.of("Gurusami","Seethalakshmi","Santhosh","Sorna","Vaibhav").filter(s->s.endsWith("i"))
				.map(s->s.toUpperCase()).collect(Collectors.toList());
				System.out.println(ls.get(0));
		List<Integer> nums = Arrays.asList(3,2,2,7,5,1,9,7);
		nums.stream().distinct().forEach(s->System.out.println(s));
		List<Integer> ls1 = nums.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls1.get(2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		regularFilter();
		streamFilter();
		System.out.println("----------------------------------");
		streamMap();
		streamCollect();

	}
	

}
