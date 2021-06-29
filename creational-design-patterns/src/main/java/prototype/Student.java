package prototype;

public class Student implements Cloneable{

    private long id;

    private String name;

    private int age;

    private int course;

    private double score;

    public Student() {
    }

    public Student(long id, String name, int age, int course, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.score = score;
    }

    public Student makePrototype() {
        return (Student) clone();
    }

    @Override
    protected Object clone() {
        Student student = new Student();
        student.setId(this.getId());
        student.setName(this.getName());
        student.setAge(this.getAge());
        student.setCourse(this.getCourse());
        student.setScore(this.getScore());
        return student;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", score=" + score +
                '}';
    }
}
