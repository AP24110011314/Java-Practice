class Teacher{
    String name;
    int age;
    String subject;
    
    Teacher(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }
    void addMarks(Student student, int maths, int science){
        student.maths = maths;
        student.science = science;
        student.showMarks();
    }
    void showDetails(){
        System.out.println("Teacher Name : "+name+" , Age : "+age+" , Subject : "+subject);
    }

}
class Student{
    String name;
    int age;
    int maths;
    int science;


    Student(String name, int age ){
        this.name = name;
        this.age = age;
        
    }
    void showMarks(){
        System.out.println("Marks of student with name ~"+name+" are : ");
        System.out.println(  "Maths :" +maths+  " , Science : "+science);
    }
    void showDetails(){
        System.out.println("Student Name : "+name+" , Age : "+age);
    }
}


public class _6ObjectArg {
    public static void main(String[] args){

        Teacher teacher = new Teacher("John", 35, "Math");
        Student student = new Student("Alice", 20);

        teacher.showDetails();
        student.showDetails();

        teacher.addMarks(student, 85, 90);

    }
}
