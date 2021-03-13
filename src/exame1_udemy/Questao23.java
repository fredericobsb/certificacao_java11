package exame1_udemy;

import java.util.*;

class Father {}
 
class Son extends Father {}
 
class GrandSon extends Son {}
 
abstract class Super {
    abstract List<Father> get();
}
 
class Sub extends Super {
    /*INSERT*/
	//List<Father> get() {return null;}
	
	//ArrayList<Father> get() {return null;}
	
	//List<Son> get() {return null;} //tipo de retorno incompativel
	
	//List<GrandSon> get() {return null;}//tipo de retorno imcompativel
	
	//ArrayList<GrandSon> get() {return null;}  //tipo de retorno imcompativel
	
	//List<Object> get() {return null;} //tipo de retorno imcompativel
}

/*
 * And the definitions of get() method:
	
1.List<Father> get() {return null;}

2. ArrayList<Father> get() {return null;}

3. List<Son> get() {return null;}

4. ArrayList<Son> get() {return null;}

5. List<GrandSon> get() {return null;}

6. ArrayList<GrandSon> get() {return null;}

7. List<Object> get() {return null;}

8. ArrayList<Object> get() {return null;}

How many definitions of get() method can replace *INSERT* such that there is no compilation error?
 * 
 */