public class TaskSecond {
    //TODO: Дана сторона квадрата a. Найти его площадь S=a2.
    public static void main(String[] args) {
        double side = 4;
        double square;
        System.out.println("Задача: найти площадь квадрата. Сторона квадрата = " + side);
        square = (int) Math.pow(side, 2);
        System.out.println("Площадь квадрата: " + square);
    }
}

