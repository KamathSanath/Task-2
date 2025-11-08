public class Main {
    public static void main(String[] args) {
        FileHandler file = new FileHandler("student_scores.csv");

        Student s1 = new Student("Sanath", 101, 90);
        Student s2 = new Student("Aditi", 102, 85);
        Student s3 = new Student("Ravi", 103, 78);

        StudentTask t1 = new StudentTask(s1, file);
        StudentTask t2 = new StudentTask(s2, file);
        StudentTask t3 = new StudentTask(s3, file);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("All scores written to student_scores.csv");
    }
}
