package chain_of_responsibility.checks;

public abstract class UserCheck {

    private UserCheck next;

    public UserCheck link(UserCheck userCheck) {
        this.next = userCheck;
        return next;
    }

    public abstract boolean check(long id);

    protected boolean checkNext(long id) {
        if (next == null) {
            return true;
        } else {
            return next.check(id);
        }
    }

}
