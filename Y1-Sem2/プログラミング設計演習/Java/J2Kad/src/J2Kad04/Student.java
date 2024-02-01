package J2Kad04;

public class Student {
    private final String name;
    private final String course;

    Student(String name, String course){
        this.name = name;
        this.course = course;
        System.out.println(this.name + "がやってきた！");
    }

    public void showData(){
        System.out.println("名前: " + this.name + "コース: " + this.course);
    }
}
