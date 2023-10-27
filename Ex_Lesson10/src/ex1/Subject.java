package ex1;

import ex1.exception.InputNotNumberException;
import ex1.exception.InvalidGradeException;

import java.util.Scanner;

public class Subject {
    private String id;
    private String name;
    private double score;

    public Subject() {
    }

    public Subject(String id, String name, double score) {
        this.id = id;
        this.name = name;
        setScore(score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {

        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            this.score = 0d;
            var msg = "Giá trị nhập vào phải lớn hơn 0 và nhỏ hơn 10.";
            throw new InvalidGradeException(msg, score);
        }
    }

    public double checkNotNumber(Scanner input) {
        double number = 0;
        if (!input.hasNextDouble()) {
            var msg = "Giá trị nhập vào từ bàn phím không phải là số.";
            throw new InputNotNumberException(msg);
        }
        return number = input.nextDouble();
    }
}
