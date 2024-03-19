public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Перебор элементов с помощью цикла for-each
        System.out.println("Элементы в списке:");
        for (Integer element : list) {
            System.out.println(element);
        }

        // Удаление элемента
        list.remove(2);
        System.out.println("\nПосле удаления элемента 2:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
