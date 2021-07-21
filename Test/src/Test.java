
public class Test {

	public static void main(String[] args) {
		String s1 = new String("Test");
		String s2 = "Test";
		String s3 = String.valueOf("Test");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		String s4 = new String("Test");
		String s5 = "Test";
		String s6 = String.valueOf("Test");
		System.out.println(s1==s4);
		System.out.println(s2==s5);
		System.out.println(s3==s6);
		

	}

}
