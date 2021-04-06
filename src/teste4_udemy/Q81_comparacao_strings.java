package teste4_udemy;

public class Q81_comparacao_strings {
	public static void main(String[] args) {
        String s1 = "1Z0-815";
        String s2 = "1Z0-815" + "";
        System.out.println(s1 == s2);
        
        String str1 = "1Z0-815";
        String str2 = str1 + "";
        System.out.println(str1 == str2);
        
        String str3 = new String("1Z0-815");
        String str4 = new String("1Z0-815");
        System.out.println(str3 == str4);
	}
}
