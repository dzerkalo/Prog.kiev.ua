package week2.hw.hw2;

/**
 * Created by acer on 27.12.2015.
 */
public class MyException extends Exception {

    @Override
    public String getMessage() {
        return "Места в группе больше нет! Приходите в следующем году)";
    }
}
