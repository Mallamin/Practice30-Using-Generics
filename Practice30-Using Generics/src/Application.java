import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}
public class Application {

	public static void main(String[] args) {
		///Before Java  /////
		
  ArrayList list=new ArrayList();
  
  list.add("Apple");
  list.add("Banana");
  list.add("Orange");
  
  String fruit=(String) list.get(1);
  System.out.println(fruit);
  
  
  ////Modern Style////
  
  ArrayList <String> Strings= new ArrayList<String>();
  
  Strings.add("cats");
  Strings.add("Mouse");
  Strings.add("Parrot");
  
  String animal=Strings.get(1);
  System.out.println(animal);
  
  
  ///There can be more than one type argument//////7
  HashMap<Integer,String> map =new HashMap<Integer, String>();
  
  //////Java 7 Style/////
  
  ArrayList<Animal> someList=new ArrayList<>();
	}

}
