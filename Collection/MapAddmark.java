package Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * MapAddmark
 */
public class MapAddmark {

    public static void main(String[] args) {
        Map<String, Map<String ,Integer>> Stu=new HashMap<>();

        HashMap<String , Integer> karanm=new HashMap<>();
        karanm.put("java" ,90);
        karanm.put("py" ,80);
        karanm.put("C" ,70);

        HashMap<String ,Integer> pavanm=new HashMap<>();
        pavanm.put("java", 89);
        pavanm.put("py", 75);
        pavanm.put("C", 79);
        HashMap<String , Integer> rutikm=new HashMap<>();
        rutikm.put("java", 76);
         rutikm.put("py", 90);
          rutikm.put("C", 86);

          Stu.put("karan", karanm);
          Stu.put("pavan", pavanm);
          Stu.put("rutik", rutikm);

          for (Map.Entry<String, Map<String, Integer>> student : Stu.entrySet()) {

            System.out.println("Student: " + student.getKey());

            for (Map.Entry<String, Integer> subject : student.getValue().entrySet()) {
                System.out.println(subject.getKey() + " = " + subject.getValue());
            }

            System.out.println();
        }
    }
}