public class TaskFifth {
    //TODO: Дано расстояние L в сантиметрах. Найти количество полных метров (1 метр = 100 см).
    public static void main(String[] args) {
        int distance = 305;
        int meters = distance / 100;

        System.out.println("Дано расстояние: " + distance + " см");
        System.out.println("Количество полных метров: " + meters);
    }
}
