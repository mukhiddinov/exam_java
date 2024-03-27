package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AvarageAge {
    public static List<Student> students;

    public static void main(String[] args) throws IOException {

        List<Student> newStudents = new ArrayList<>();
        newStudents.add(new Student("Ali", 22));
        newStudents.add(new Student("Vali", 19));
        newStudents.add(new Student("Soli", 21));

        Gson gson = new Gson();
        String json = gson.toJson(newStudents);
        System.out.println(json);
        Files.writeString(Path.of("students"),json);

        String jsonText = Files.readString(Path.of("students"));
        Type type = TypeToken.getParameterized(List.class, Student.class).getType();
        students = gson.fromJson(jsonText, type);

        Double avarageAge = getAvarageAge();
        System.out.println("O'rtacha yosh: " + avarageAge);

    }

    private static Double getAvarageAge() {
        Double sum = 0.0;
        for (Student student : students) {
            sum += student.getAge();
        }
        Double result = sum/students.size();
        return result;

    }

}
