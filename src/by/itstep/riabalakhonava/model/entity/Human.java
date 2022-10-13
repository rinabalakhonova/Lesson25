package by.itstep.riabalakhonava.model.entity;

public class Human {
    public static final int MAX_AGE = 100;
        public static final int MIN_AGE = 10;
    }
    private String name;
    private int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int setAge(int age) {
        if (age >= 10 && age >= 100) {
            this.age = age;
        }
    }

    public String getInfo() {
        return name + ": age = " + age;
    }
}
