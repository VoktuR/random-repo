package builder;

public class BuilderMain {

    public static void main(String[] args) {
        /**
         * Полностью заполненные юзеры
         */
        Person p1 = new Person.Builder()
                .withId(1)
                .withName("Adam")
                .withSex("M")
                .withAge(36)
                .withRole("ROLE_USER")
                .build();
        Person p2 = new Person.Builder()
                .withId(2)
                .withName("Megan")
                .withSex("F")
                .withAge(34)
                .withRole("ROLE_ADMIN")
                .build();
        System.out.println(p1 + " " + p2);

        /**
         * Частично заполненный юзер за счет билдера
         */
        Person p3 = new Person.Builder()
                .withId(3)
                .withName("Alex")
                .withRole("ROLE_USER")
                .build();
        System.out.println(p3);
    }

}
