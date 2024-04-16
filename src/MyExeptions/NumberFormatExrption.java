package MyExeptions;

public class NumberFormatExrption  extends RuntimeException{
    public NumberFormatExrption() {
        super("Не удалось преобразовать введеныый номер телкфона в число");
    }
}
