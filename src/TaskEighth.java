public class TaskEighth {
    //TODO: Даны два ненулевых числа.
    // Найти сумму, разность, произведение и частное их квадратов.
    public static void main(String[] args) {
        double numberFirst = 5;
        double numberSecond = 3;
        double squareNumberFirst = Math.pow(numberFirst, 2);
        double squareNumberSecond = Math.pow(numberSecond, 2);

        System.out.println("Задача: найти сумму, разность, произведение и частное квадратов чисел " +
                numberFirst + " и " + numberSecond);
        System.out.println("Сумма квадратов = " + (squareNumberFirst + squareNumberSecond));
        System.out.println("Разность квадратов = " + (squareNumberFirst - squareNumberSecond));
        System.out.println("Произведение квадратов = " + (squareNumberFirst * squareNumberSecond));
        System.out.println("Частное квадратов = " + (squareNumberFirst / squareNumberSecond));
    }
}
