import java.text.SimpleDateFormat;
import java.util.Date;

public class People {  //В случае дальнейшей работы, проще создать отдельный класс вместо списка с разными типами данных
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", dateBirth=" + dateBirth +
                ", phoneNumber=" + phoneNumber +
                ", sex=" + sex +
                '}';
    }

    private String name; //Имя
    private String secondName; //Фамилия
    private String thirdName; // Отчество

    private Date dateBirth; // Дата рождения

    private long phoneNumber; // номер телефона (int слишком короткий)

    private Character sex; // пол
    void setName (String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
    void setSecondName (String secondName){
        this.secondName = secondName;
    }
    String getSecondName(){
        return this.secondName;
    }

    void setThirdName (String thirdName){
        this.thirdName = thirdName;
    }
    String getThirdName(){
        return this.thirdName;
    }

    void setDateBirth (Date date){
        this.dateBirth = date;
    }
    String getStrDateBirh(){
        SimpleDateFormat formater = new SimpleDateFormat("dd.MM.yyyy");
        return formater.format(dateBirth);
    }

    void setPhoneNumber (long phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    String getStrPhoneNumber(){
        return String.valueOf(this.phoneNumber);
    }

    void setSex (Character character){
        this.sex=character;
    }
    Character getSex() {
        return this.sex;
    }

}
