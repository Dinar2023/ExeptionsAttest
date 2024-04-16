import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    void writePeopleToFile(People people){
        try (FileWriter writer = new FileWriter(people.getName(), true)){
//            writer.append(people.getName()+" "+people.getSecondName()+" "+people.getThirdName()+" "+people.getStrDateBirh()+" "+people.getStrPhoneNumber()+" "+people.getSex() +"\n");
            java.io.Writer append = writer.append(people.getName()).append(" ").append(people.getSecondName()).append(" ").append(people.getThirdName()).append(" ").append(people.getStrDateBirh()).append(" ").append(people.getStrPhoneNumber()).append(" ").append(String.valueOf(people.getSex())).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
