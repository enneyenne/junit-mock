import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.util.*;


public class Student {

    @Setter
    private GradeCheck gradeCheck;

    @Getter
    @Setter
    private String name;
    private List grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public List getGrades() {
        return new ArrayList<>(grades);
    }

    @SneakyThrows
    public void addGrade(int grade) {
        if (!gradeCheck.checkGrade(grade)) {
            throw new IllegalArgumentException(grade + " is wrong grade");
        }
        grades.add(grade);
    }

}