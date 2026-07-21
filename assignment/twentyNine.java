//Write a program in Java to implement getter and setter methods

public class twentyNine {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Lion");
        animal.setAge(5);

        System.out.println("Animal Name: " + animal.getName());
        System.out.println("Animal Age: " + animal.getAge());
    }

    static class Animal {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
