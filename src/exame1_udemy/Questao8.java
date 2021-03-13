package exame1_udemy;

public class Questao8 {
	public static void main(String[] args) {
        String s1 = "OCP";
        String s2 = "ocp";
        /*Which of the following options, if used to replace INSERT,
        will compile successfully and on execution will print true on to the console?
        Select 2 options.
        
        s1.contentEquals(s2)
		s2.equals(s1.toLower())
		s1.length() = s2.length()
		s1.equals(s2)
		s1.equals(s2.toUpper())
		s1.equalsIgnoreCase(s2))
        */
        System.out.println(s1.contentEquals(s2));
        System.out.println(s2.equals(s1.toLower()));// s1.toLowerCase()
        System.out.println(s1.length() = s2.length());//s1.length() == s2.length()
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2.toUpper()));//s2.toUpperCase()
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
