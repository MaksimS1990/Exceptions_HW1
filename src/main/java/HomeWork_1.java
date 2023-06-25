import java.io.File;
import java.io.FileNotFoundException;

public class HomeWork_1 {

    public static void main(String[] args) throws FileNotFoundException {

//        firstMethod();
//        secondMethod();
        thirdMethod();
    }

    public static void firstMethod() throws NullPointerException {
        throw new NullPointerException("Вызван NullPointerException");
    }

    public static void secondMethod() throws FileNotFoundException {
        throw new FileNotFoundException("Вызван FileNotFoundException");
    }

    public static void thirdMethod() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException("Вызван ArrayIndexOutOfBoundsException");
    }
}
