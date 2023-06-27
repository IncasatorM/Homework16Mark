public class User {
    private String login;

    Acount acount;


    public User(String login, String password) {
        this.login = login;
        this.acount = new Acount(password);

    }

    public User(String login) {
        this.login = login;
    }

    class Acount {
        private String password;

        private Acount(String password) {
            this.password = password;
        }

        void displayAccount(){
            System.out.println("Account Login successful! Login: " + User.this.login + " Password " + this.password);
        }

    }




}





