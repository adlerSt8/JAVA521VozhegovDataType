public class TaskSixth {
    //TODO: Даны целые положительные числа A и B (A>B).
    // На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    // Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.
    public static void main(String[] args) {
        int numberFirst = 1518;
        int numberSecond = 111;
        int numberOfSegments =  numberFirst / numberSecond;
        System.out.println("Задача: найти количество отрезков B на отрезке A: ");
        System.out.println("Количество отрезков: " + numberOfSegments);
    }
}
