package prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        /**
         * Создание студента через конструктор
         */
        Student s1 = new Student(4, "Sebastian", 19, 3, 79.5);

        /**
         * Создание прототипа студента через интерфейс Cloneable
         */
        Student s2 = s1.makePrototype();

        System.out.println(s1 + " " + s2);
    }

}
