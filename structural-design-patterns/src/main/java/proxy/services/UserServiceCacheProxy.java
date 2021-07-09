package proxy.services;

import proxy.model.User;

import java.util.*;

public class UserServiceCacheProxy implements UserService {

    private final UserServiceImpl userService = new UserServiceImpl();

    private Map<Long, User> cachedUsers = new HashMap<>();

    @Override
    public Optional<User> getById(long id) {
        if (!cachedUsers.containsKey(id)) {
            cachedUsers.put(id, userService.getById(id).get());
            System.out.println("User " + id + " was added to cache");
        }
        return Optional.of(cachedUsers.get(id));
    }

    @Override
    public boolean checkVerification(long id) {
        if (!cachedUsers.containsKey(id)) {
            cachedUsers.put(id, userService.getById(id).get());
            System.out.println("User " + id + " was added to cache");
        }
        return cachedUsers.get(id).isVerified();
    }

}
