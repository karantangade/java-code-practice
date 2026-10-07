/**
 * InnerAnimalApp
 */
public interface AnimalAppp{
void sound();
    
}
class dog implements AnimalAppp{
    public void sound(){
        System.out.println("dog bark");
    }
}
class cat implements AnimalAppp{
    public void sound(){
        System.out.println("the cat sound");
    }
}
class AnimalApp{
    public static void main(String[] args) {
        AnimalAppp pd=new dog();    
        pd.sound();
        AnimalAppp dp=new cat();
        dp.sound();
    }
}