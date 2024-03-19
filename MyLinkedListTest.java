public class MyLinkedListTest {
    public static void main(String[] args) {
        testAdd();
        testRemove();
    }

    public static void testAdd() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Добавленные элементы:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }

    public static void testRemove() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(2);
        System.out.println("\nПосле удаления элемента 2:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
