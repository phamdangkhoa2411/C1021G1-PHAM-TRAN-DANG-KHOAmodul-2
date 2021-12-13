package bai_tap_them.bai_tap_2.model;

public class Student implements Comparable<Student>{
    private int iD;
    private String name;
    private String dateOfBirth;
    private String sex;
    private String nameClass;
    private String nameCourse;

    public Student(int iD, String name, String dateOfBirth, String sex, String nameClass, String nameCourse) {
        this.iD = iD;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.nameClass = nameClass;
        this.nameCourse = nameCourse;
    }

    public int getId() {
        return iD;
    }

    public void setId(int id) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + iD +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", sex='" + sex + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return getId()-o.getId();
    }
}
