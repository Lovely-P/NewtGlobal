//Hybrid Inheritance

class Fish extends Animal1{
    String animaltype="Lives in Water";

}
class Birds extends  Animal1{
    String animaltype="Animals with feathers";
}
class Eel extends Fish {
    String animaltype="Release electric charge";
    public void showinfo(){
        System.out.println(animaltype);
    }
}
public class Animal1 {
    int height;
    int weight;
    String animaltype;
    String bloodtype;

    public static void main(String[] args) {
        Eel e= new Eel();
        e.showinfo();
    }
}