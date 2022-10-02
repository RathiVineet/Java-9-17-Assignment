record Student(int id,String name,int age){
    static int count=0;
    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
        count += 1;
    }
};
public class Ans11 {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Vineet",24);
        Student student2= new Student(1,"Vineet",24);
        Student student3 = new Student(2,"Lalit",24);

        System.out.println("Is student1 object equal to student2  :  "+ student1.equals(student2));
        System.out.println("Number of Object Created :  " +  Student.count );
    }
}

