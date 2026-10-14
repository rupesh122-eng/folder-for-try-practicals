package bank;

class Account {

    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public String setPassword(String password) {
        return this.password = password;
    }
}

public class Bank {

    public static void main(String[] args) {

        Account a1 = new Account();
        a1.name = "Rupesh";
        a1.setPassword("ABCD");
        a1.email = "hello@gmail.com";
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());

    }
}
