
public class Student {
    private String name;
    private Major major;
    
    public Student(String n, Major m) {
        name = n;
        major = m;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major m) {
        major = m;
    }
    
    public String toString() {
        return "Student Name: " + name + "\n" + major;
    }
    
    public boolean equals(Student s) {
        return name.equals(s.name) && major.equals(s.major);
    }
}
