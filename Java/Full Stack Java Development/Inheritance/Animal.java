//Single Inheritance

public class Animal {
    int height;
    int weight;
    String animaltype;
    String bloodtype;
}
class Reptile extends Animal{
     String animaltype="dryskin";
     String Eggstype="Soft shelled eggs";
}
class crocodile extends  Reptile{
    String Eggstype="Hard shelled eggs";
    public void showinfo(){
        System.out.println(animaltype);
    }

    public static void main(String[] args) {
        crocodile c=new crocodile();
        System.out.println(c.Eggstype);
        c.showinfo();
    }

}
