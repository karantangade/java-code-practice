import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class newa {
    public static void main() {
		Vector vt=new Vector();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  number");
		int size=sc.nextInt();
		
		for(int i=0; i<size;i++) {
			vt.add(sc.nextInt());
		}
		System.out.print("______________________________");
		Enumeration ev=vt.elements();
		while (ev.hasMoreElements()) {
			Object object = (Object) ev.nextElement();
			System.out.println(object);
		}
	}
}
