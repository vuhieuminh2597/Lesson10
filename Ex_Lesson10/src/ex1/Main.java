package ex1;

import ex1.exception.InputNotNumberException;
import ex1.exception.InvalidGradeException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào điểm số |0 - 10|:");
        try {
            var score = new Subject().checkNotNumber(input);
            Subject subject = new Subject("1", "Toán", score);
        } catch (InputNotNumberException | InvalidGradeException e) {
            e.printStackTrace();
        }
        System.out.println("===============================================================");
    }
}
