public class test{

    public static void main(String args[]){
        int scores [] = {90,45,69,56};
        System.out.println("mid term1: " + scores[0]);
        System.out.println("mid term2: " + scores[1]);
        System.out.println("final:     " + scores[2]);
        System.out.println("project:   " + scores[3]);
        System.out.println("# exams:   " + scores.length);
        Student students[] = {new Student(), new Student(), new Student()} ;
        students[0].name = "JOhn";
        students[1].name = "radha";
        students[2].name = "jai";
        System.out.println("Student1 :" + students[0].name);
        System.out.println("Student2 :" + students[1].name);
        System.out.println("Student3 :" + students[2].name);
        

    } 
}
