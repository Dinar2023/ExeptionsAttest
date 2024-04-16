package MyExeptions;

public class SexExeption extends RuntimeException{
    public SexExeption() {
        super("Указан не корректный формат пола");
    }
}
