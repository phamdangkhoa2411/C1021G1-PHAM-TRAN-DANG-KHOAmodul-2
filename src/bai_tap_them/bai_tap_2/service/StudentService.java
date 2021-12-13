package bai_tap_them.bai_tap_2.service;

import bai_tap_them.bai_tap_2.model.Student;

public interface StudentService {
    void add (Student student);
    Student[] findAll();
    void remove(int id);
    void removeIndex(int index);
    void search(String studentCode);
}
