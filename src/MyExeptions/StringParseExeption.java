package MyExeptions;

public class StringParseExeption extends RuntimeException{
    public StringParseExeption() {
        super("Проверьте правильность введенных данных, вы любо ввели не все данные, либо указпли лишние пробелы");
    }
}
