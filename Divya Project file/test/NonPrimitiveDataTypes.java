package test;

public interface NonPrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		String str = "test";
		System.out.println("String is: "+ str);
		
		String str1 = new String("test");
		System.out.println("Another string: "+ str1);
		
		int a = 20;
		String b = Integer.toString(a);
		System.out.println("c ="+ b);
		
		int arr[];
		arr = new int[2];
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(arr);
		System.out.println(arr[0]);

		
	}

}
