package singleton;

public class SingletonMain {

    public static void main(String[] args) {
        /**
         * Первоначальное создание синглтона с постоянным значением
         */
        Singleton s = Singleton.getInstance("aaaaaaa");
        System.out.println(s);

        /**
         * Получение уже созданного синглтона без singletonValue
         */
        Singleton a = Singleton.getInstance();
        System.out.println(a);

        /**
         * Попытка получить синглтон с другим value, что невозможно сделать используя этот паттерн
         */
        Singleton b = Singleton.getInstance("bbbbbbb");
        System.out.println(b);
    }

}
