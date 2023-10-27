package ex1.exception;

public class InvalidGradeException extends RuntimeException{
    private double invalidGrade;

    public InvalidGradeException() {
    }

    public InvalidGradeException(String message, double invalidGrade) {
        super(message);
        this.invalidGrade = invalidGrade;
    }

    public double getInvalidGrade() {
        return invalidGrade;
    }
}
