public class Class {
        int age;
        String name;
        int[] massive;


    public Class(int number, String name, int[] massive) {
        this.age = number;
        this.name = name;
        this.massive = massive;
    }
    public void mass(int index) {
        System.out.println(massive[index]);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }
}