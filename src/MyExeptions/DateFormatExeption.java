package MyExeptions;

public class DateFormatExeption extends RuntimeException{
    public DateFormatExeption() {
        super("Введен некорректный формат даты, дата должна быть введена в формате dd.MM.yyyy");
    }
}
