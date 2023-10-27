package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(getDateString(input));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    private static String getDateString(Scanner input) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(setDate(input));
    }

    private static Date setDate(Scanner input) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập vào ngày tháng năm sinh của bạn VD:01/01/1970 :");
        var result = format.parse(input.nextLine());
        return result;
    }
}
