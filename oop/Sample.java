class Human {
    private String name;
    private int age;

    public Human() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Sample {
    public static void main(String[] args) {
        System.out.println("This is a sample Java object program.");

        Human human1 = new Human();
        System.out.println("Human 1: Name = " + human1.getName() + ", Age = " + human1.getAge());

        Human human2 = new Human("Alice", 25);
        System.out.println("Human 2: Name = " + human2.getName() + ", Age = " + human2.getAge());
    }
}
