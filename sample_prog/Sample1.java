package sample_prog;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("Santhosh");
		a.concat("kumar");
		System.out.println(a);
		String b = new String("Santhosh");
		String c = "Santhosh";
		String d = "Santhosh";
		System.out.println(c==d);
		System.out.println(c==b);
		System.out.println(c.equals(b));
		

	}

}
