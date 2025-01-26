public class TaskFourth {
    //TODO: Дан диаметр окружности d. Найти ее длину L=π∗d. В качестве значения π использовать константу 3.14.
    public static void main(String[] args) {
        double diameterCircle = 8;
        double lengthCircle;
        double PI = 3.14d;
        System.out.println("Задача: найти длину окружности. Диаметр окружности: " + diameterCircle);
        lengthCircle = PI * diameterCircle;
        System.out.println("Длина окружности: " + lengthCircle);
    }
}
