package chain_of_responsibility.checks;

import chain_of_responsibility.users.User;
import chain_of_responsibility.users.UsersDbEmulation;

import java.util.Optional;

public class UserIsNotBlockedCheck extends UserCheck {

    @Override
    public boolean check(long id) {
        Optional<User> bannedUser = UsersDbEmulation.blockedUsers.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
        if (bannedUser.isEmpty()) {
            return checkNext(id);
        }
        return false;
    }

}
