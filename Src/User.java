public class User {
    private String login;

    Acount acount;


    public User(String login, String password) {
        this.login = login;
        acount = new Acount(password);

    }

    public User(String login) {
        this.login = login;
    }

    class Acount {
        private String password;

        private Acount(String password) {
            this.password = password;
        }
    }

    public void displayAccount(String pass) {
        class Account {
            String password;

            Account() {
                password = pass;
            }

            void display() {
                System.out.printf("Account Login successful!: %s \t Password: %s \n", login, password);
            }
        }
        Account account = new Account();
        account.display();


    }


}





