package proxy.model;

import java.util.Set;

public class UsersDbEmulation {

    public static Set<User> allUsers = Set.of(
            new User(1, "Artem", 22, false),
            new User(2, "Daria", 23, true),
            new User(3, "Ilan", 23, false)
    );

}
