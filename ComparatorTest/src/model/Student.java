package model;

public class Student implements Comparable<Student> {
    private String name;
    private int studentNummer;

    public Student(String name, int studentNummer) {
        this.name = name;
        this.studentNummer = studentNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(int studentNummer) {
        this.studentNummer = studentNummer;
    }

//     vergelijken op basis van naam
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.studentNummer;
    }
}
