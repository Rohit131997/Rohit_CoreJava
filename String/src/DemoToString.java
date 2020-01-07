public class DemoToString
{ 
		 int rollno;  
		 String name;  
		 String city;
		 
		  
		

		DemoToString (int rollno, String name, String city)
		 {  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		  
 public static void main(String args[])
         {  
			 DemoToString s1=new  DemoToString(101,"Raj","lucknow");  
			 DemoToString s2=new  DemoToString(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }

@Override
public String toString() {
	return "DemoToString [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
}  
}  

