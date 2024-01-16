package bootcamp;
import java.util.*;

public class Generator {
	public static void main(String[] args) {
	    String name;
	    String course;
	    String id="";
	    Integer py=1,j=1,ph=1,flag=1;
	    while(true){
	        Scanner sc=new Scanner(System.in);  
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter course: ");
            course= sc.nextLine();
            if(course.equals("java")){
                flag=j++;
            }
            if(course.equals("python")){
                flag=py++;
            }
            if(course.equals("php")){
                flag=ph++;
            }
            id+=name+": "+course+flag+"\n";
            System.out.println("Do you want to continue[y/n]: ");
            String c=sc.nextLine();
            if(c.equals("n")){
                break;
            }
            
	    }
	    System.out.println(id);
	}
}
