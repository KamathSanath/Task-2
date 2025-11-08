public class StudentTask extends Thread {
    Student s;
    FileHandler f;

    StudentTask(Student s, FileHandler f) {
        this.s = s;
        this.f = f;
    }

    public void run() {
        f.writeData(s.toString());
    }
}
