package Practica7_RefuerzoInterfaz;

/**
 * Created by vitaly94 on 05/10/2016.
 */
public interface Database {
    Student getStudent(Student student);
    void removeStudent(Student student);
    void addStrudent(Student student);
    void contractStudent(Student student);
}
