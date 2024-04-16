//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ConsoleView view = new ConsoleView();
        People people1;
        people1 = view.readPeople();
        System.out.println(people1);
        Writer writer = new Writer();
        writer.writePeopleToFile(people1);
    }
}