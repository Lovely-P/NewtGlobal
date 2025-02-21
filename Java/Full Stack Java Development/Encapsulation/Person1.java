public class Person1 {

        private String name;
        private int age;
        private String gender;

        public Person1(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean setAge(int age) {
            if (age >=0 && age <=150){
                this.age = age;
                return true;
            }else {
                return false;
            }

        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\'' + '}';
        }
    }
class PersonMain{
    public static void main(String[] args) {
        Person1 person = new Person1("Lovely", 20, "Female");
        person.setName("Lovely");
        person.setAge(20);
        System.out.println(person);

    }
}
