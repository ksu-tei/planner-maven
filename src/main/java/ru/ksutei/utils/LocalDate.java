package ru.ksutei.utils;

public enum LocalDate {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    String russian;
    LocalDate(String dayInRussian) {
        russian = dayInRussian;
    }

    public String getRusName() {
        return russian;
    }
}
