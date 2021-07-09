package proxy;

import proxy.services.UserService;
import proxy.services.UserServiceCacheProxy;

public class ProxyMain {

    public static void main(String[] args) {

        UserService userService = new UserServiceCacheProxy();

        System.out.println(userService.getById(1).get());
        System.out.println(userService.getById(1).get());

        System.out.println(userService.checkVerification(2));
        System.out.println(userService.checkVerification(2));

    }

}
