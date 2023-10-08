package ru.ksutei;
import java.util.Scanner;
import ru.ksutei.utils.LocalDate;
public class App 
{
    public static void main(String[] args){
        System.out.println("Введите день недели на английском: ");
       Scanner sc = new Scanner(System.in);
       String thisDay = sc.next();
       System.out.println("Сегодня " + LocalDate.valueOf(thisDay.toUpperCase()).getRusName());
    }
}
