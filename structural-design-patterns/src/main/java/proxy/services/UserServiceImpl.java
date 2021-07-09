package proxy.services;

import proxy.model.User;
import proxy.model.UsersDbEmulation;

import java.util.Optional;

public class UserServiceImpl implements UserService {

    @Override
    public Optional<User> getById(long id) {
        return UsersDbEmulation.allUsers.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public boolean checkVerification(long id) {
        return UsersDbEmulation.allUsers.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .get()
                .isVerified();
    }
}
