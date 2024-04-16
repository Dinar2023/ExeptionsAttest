import MyExeptions.DateFormatExeption;
import MyExeptions.NumberFormatExrption;
import MyExeptions.SexExeption;
import MyExeptions.StringParseExeption;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleView {
Scanner scanner = new Scanner(System.in);
People readPeople (){
    People chel = new People(); //В случае дальнейшей работы, проще создать отдельный класс вместо списка с разными типами данных
     System.out.println("Введите данные 'Фамилия Имя Отчество дата_рождения номер_телефона пол'");
     String text = scanner.nextLine();
     String[] arrTxt = text.split(" ");  // Получаем массив строк
     if (arrTxt.length != 6) throw new StringParseExeption(); // Проверяем колличество введенных "слов", разделенных пробелом
     else {
         chel.setName(arrTxt[0]); // Перепутал имя и фамилию, в идеале исправить
         chel.setSecondName(arrTxt[1]);
         chel.setThirdName(arrTxt[2]);
         Date dateBirth = new Date(); // Дату рождения лучше хранить в соответствующем формате
         SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
         try {
             dateBirth = format.parse(arrTxt[3]);
            chel.setDateBirth(dateBirth);
//             System.out.println(dateBirth.getYear());
             if (dateBirth.getYear() <-900) {    //Проверка правильности года (В теории можно распарсить строку по "." и сравнить) (Сомневаюсь, что в спавочнике буду люди родившиеся до 1000 года)
                 throw new DateFormatExeption();
             }

         } catch (ParseException e) {
             throw new DateFormatExeption();
         }


         try {
             arrTxt[4] = arrTxt[4].replace("-","");
             arrTxt[4] = arrTxt[4].replace(".","");
             arrTxt[4] = arrTxt[4].replace(",","");
             chel.setPhoneNumber(Long.parseLong(arrTxt[4]));
         } catch (NumberFormatException e){
             throw new NumberFormatExrption();
         }

         if ((!Objects.equals(arrTxt[5], "f")) && (!Objects.equals(arrTxt[5], "m"))) throw new SexExeption();
         else chel.setSex(arrTxt[5].charAt(0));



         return chel;}


}
}
