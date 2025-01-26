public class TaskSixth {
    //TODO: Даны два ненулевых числа.
    // Найти сумму, разность, произведение и частное их квадратов.
    public static void main(String[] args) {
        double numberFirst = 5;
        double numberSecond = 3;

        System.out.println("Задача: найти сумму, разность, произведение и частное квадратов чисел " +
                numberFirst + " и " + numberSecond);
        System.out.println("Сумма квадратов = " + (Math.pow(numberFirst, 2) + Math.pow(numberSecond, 2)));
        System.out.println("Разность квадратов = " + (Math.pow(numberFirst, 2) - Math.pow(numberSecond, 2)));
        System.out.println("Произведение квадратов = " + (Math.pow(numberFirst, 2) * Math.pow(numberSecond, 2)));
        System.out.println("Частное квадратов = " + (Math.pow(numberFirst, 2) / Math.pow(numberSecond, 2)));
    }
}
