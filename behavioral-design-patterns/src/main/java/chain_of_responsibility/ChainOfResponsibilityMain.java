package chain_of_responsibility;

import chain_of_responsibility.checks.UserCheck;
import chain_of_responsibility.checks.UserExistsCheck;
import chain_of_responsibility.checks.UserIsNotBlockedCheck;
import chain_of_responsibility.checks.UserIsVerifiedCheck;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        UserCheck isExist = new UserExistsCheck();
        UserCheck isVerified = new UserIsVerifiedCheck();
        UserCheck isNotBlocked = new UserIsNotBlockedCheck();

        isExist.link(isNotBlocked).link(isVerified);
        boolean res = isExist.check(2);
        System.out.println(res);
    }
}
