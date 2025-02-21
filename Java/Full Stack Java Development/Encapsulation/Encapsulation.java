 class Person {
    public String name;
    public int age;
    public String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + '}';
    }
}
public class Encapsulation {
        public static void main(String[] args) {
            Person person= new Person("Lovely", 20, "Female");
            System.out.println(person);

        }
}
