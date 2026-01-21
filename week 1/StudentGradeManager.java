package week1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class StudentGradeManager {
    HashMap<String, Integer> students = new HashMap<>();

    public static void main(String[] args) {
        StudentGradeManager sgm = new StudentGradeManager();
        sgm.add_student("Alice", 85);
        sgm.add_student("Bob", 92);
        sgm.add_student("Charlie", 78);

        System.out.printf("Average grade: %d", sgm.get_average());
        System.out.printf("\nTop student: %s", sgm.get_top_student());
    }

    void add_student(String name, int grade) {
        students.put(name, grade);
    }

    int get_average() {
        if (students.isEmpty()) return 0;
        int total = 0;
        for (int i : students.values()) total+=i;
        return total/students.size();
    }

    String get_top_student() {
        int max = Integer.MIN_VALUE;
        String topStudent = null;
        Set<String> studentName = students.keySet();

        for (String i : studentName) {
            int currentStudent = students.get(i);
            if (currentStudent > max) {
                max = currentStudent;
                topStudent = i;
            }
        }

        return topStudent;
    }


}
