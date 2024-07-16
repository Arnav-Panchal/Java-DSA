package src.Tutorials;

public class Student {
    static int roll;
    static String name;
    static String div;




     Student(int roll,String name,String div){
        this.roll=roll;
        this.name=name;
        this.div=div;
    }


    public static void main(String[] args) {
        Student s1=new Student(12,"Arnav","A");
        Student s2=new Student(21,"Sahil","B");


        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.div);
    }

}
