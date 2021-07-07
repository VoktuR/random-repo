package chain_of_responsibility.checks;

import chain_of_responsibility.users.User;
import chain_of_responsibility.users.UsersDbEmulation;

import java.util.Optional;

public class UserIsVerifiedCheck extends UserCheck {

    @Override
    public boolean check(long id) {
        Optional<User> requestedUser = UsersDbEmulation.allUsers.stream()
                .filter(user -> (user.getId() == id && user.isVerified()))
                .findFirst();
        if (requestedUser.isPresent()) {
            return checkNext(id);
        }
        return false;
    }

}
