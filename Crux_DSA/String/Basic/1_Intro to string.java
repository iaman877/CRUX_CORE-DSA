public class String_Demo {

	public static void main(String[] args) {
        String	str1= "Hello";
        
		String str3 = "hellobye";
		System.out.println("str3.charAt(5) : "+str3.charAt(5));
        
		// SubString 
		String str4 = str3.substring(2, 3);
		System.out.println("str4 "+str4);
		System.out.println("str3.substring(4) : "+str3.substring(4));
        
		// Cancat
		String s = "Welcome to ";
		String s1 = "CB";
        /*
        s= s+s1;
		System.out.println(" Using + Operator  "+ s);
        */
		s=s.concat(s1);
        System.out.println("Using concat "+ s);
		System.out.println("str1.substring(0,0) : "+ str1.substring(0,0));
		
		// Index of 
    String  str = "hello";
    System.out.println("str.length : "+str.length());
		System.out.println("str.indexOf('l') : "+str.indexOf('l'));
		System.out.println("str.lastIndexOf('l') : "+str.lastIndexOf('l'));// char ka Index 
		System.out.println("str3.startsWith('hel') : "+str3.startsWith("hel"));
		System.out.println("str3.endsWith('bye') : "+str3.endsWith("bye"));
		append();
	}
	public static void append() {
		String ans = "";
		for (int i = 0; i < 100000; i++) {
			ans= ans + i;	
		}
		System.out.println(ans);
	}
}
