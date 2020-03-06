package epam.collections;
import java.util.Scanner;
public class Main {
	
		public static void main(String args[]){
				CustomList l=new CustomList();
				System.out.println("Enter the size of list:");
				Scanner sc= new Scanner(System.in);
				int size=sc.nextInt();
				System.out.println("Enter "+size+" elements to insert");
				for(int i=0;i<size;i++) {
					int num=sc.nextInt();
					l.add(num);
				}
				System.out.println("The elements in the list are:");
		        System.out.println(l);
		        System.out.println("Enter index to delete an element");
		        int num=sc.nextInt();
		        l.remove(num+1);
		        System.out.println("List after deleting "+num+"th element:");
		        System.out.println(l);
		        System.out.println("Enter index to search element");
		        num=sc.nextInt();
		        System.out.println( l.get(num+1) );
		        System.out.println("The size of the list");
		        System.out.println(l.size());
		    }
	
}
