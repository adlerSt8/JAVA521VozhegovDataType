public class TaskThird {
    //TODO: Даны стороны прямоугольника a и b. Найти его площадь S=a∗b и периметр P=2∗(a+b).
    public static void main(String[] args) {
        double sideFirst = 4;
        double sideSecond = 9;
        double square = sideFirst * sideSecond;
        double perimeter = (sideFirst + sideSecond) * 2;
        System.out.println("Задача: найти площадь и периметр прямоугольника. " +
                "Стороны квадрата: " + sideFirst + " и " + sideSecond);
        System.out.println("Площадь прямоугольника: " + square);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}
