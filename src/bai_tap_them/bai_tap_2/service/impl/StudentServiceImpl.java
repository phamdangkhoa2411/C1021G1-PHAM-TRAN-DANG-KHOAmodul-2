package bai_tap_them.bai_tap_2.service.impl;

import bai_tap_them.bai_tap_2.model.Student;
import bai_tap_them.bai_tap_2.service.StudentService;

public class StudentServiceImpl implements StudentService {
    private static Student[] studentList = new Student[5];
    static {
        studentList[0] = new Student(4, "trong", "01/02/1995","Male" , "C1021G1", "C10");
        studentList[1] = new Student(5, "long", "08/05/1996","Male" , "C1021G1", "C10");
        studentList[2] = new Student(3, "ngoc", "12/03/1997","Female" , "C1021G1", "C10");
        studentList[3] = new Student(1, "khoa", "09/12/2003","Male" , "C1021G1", "C10");
        studentList[4] = new Student(2, "Tuan", "01/02/2001","Male" , "C1021G1", "C10");
    }
    @Override
    public void add(Student student) {
        Student[] newStudentList = new Student[studentList.length + 1];
        newStudentList[newStudentList.length - 1] = student;
        for (int i = 0; i < studentList.length; i++){
            newStudentList[i] = studentList[i];
        }
        studentList = newStudentList;
    }
    @Override
    public Student[] findAll() {
        return studentList;
    }
    @Override
    public void remove(int id) {
        for (int i = 0; i < studentList.length; i++){
            if (studentList[i].getId() == id){
                studentList[i] = null;
            }
        }
    }
    @Override
    public void removeIndex(int index) {
        studentList[index - 1] = null;
    }

    @Override
    public void search(String StudentCode) {
        for (int i = 0; i < studentList.length; i++){
            if(isNumeric(StudentCode)){
                if(studentList[i].getId() == (Integer.parseInt(StudentCode))){
                    System.out.println(studentList[i]);
                }
            }else{
                if(studentList[i].getName().equals(StudentCode)) {
                    System.out.println(studentList[i]);
                }
            }
        }
    }
    public static boolean isNumeric(CharSequence chars) {
        if (chars.equals(null)) {
            return false;
        }
        for (int i = 0; i < chars.length(); i++) {
            if (!Character.isDigit(chars.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
