import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> clients = new LinkedList<>(firstClients);
       // clients.addAll(firstClients);

        while (!clients.isEmpty()) {
            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                clients.offer("a friend of " + clients.peek());
                System.out.println(clients.poll() + " сделала новый маникюр");
            } else {
                System.out.println(clients.poll() + " сделала новый маникюр");
            }
        }
        System.out.println(clients + "Конец Очереди!");
    }
}