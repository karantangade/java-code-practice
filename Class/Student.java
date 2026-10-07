import java.util.Scanner;

class Students{
    int id;
    String name;
    int mark;
    void Print(){
        System.out.println(" The student id is the = "+id);
        System.out.println("The name of the user is = "+name);
        if (mark>35) {
            System.out.println("Result is pass mark is = "+mark);
        } else {
             System.out.println("Result is  failed mark is = "+mark);
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Students pd=new Students();
        System.out.println("Enter the Id name and th mark");
        pd.id=sc.nextInt();
        sc.nextLine();
        pd.name=sc.nextLine();
        pd.mark=sc.nextInt();
        pd.Print();
    }
}
