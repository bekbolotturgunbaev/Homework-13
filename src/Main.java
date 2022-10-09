public class Main {

    public static void main(String[] args) {
        int[] massNum = new int[] {1998,2000,1999};
        Class class1 = new Class(23,"Bekbolot",massNum);
        System.out.print("Age: "+class1.getAge()+"\nName: "+class1.name+"\nYear: ");
        class1.mass(2);
    }
}
