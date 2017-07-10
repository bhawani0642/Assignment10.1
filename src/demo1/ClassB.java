//Created another package named demo1 in the sane project
package demo1;
//Using import statement imported the package demo
import demo.ClassA;
//Created a class named ClassB
public class ClassB {
// 	Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of ClassA
 ClassA obj= new ClassA();
 //Calling the print method from the package demo
 obj.print();
	}

}
