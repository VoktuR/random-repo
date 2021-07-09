package proxy.services;

import proxy.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> getById(long id);

    boolean checkVerification(long id);

}
