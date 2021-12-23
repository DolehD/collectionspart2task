package model;
public enum Login {

    Login1("SaMPlE"),
    Login2();

    private String login;

    Login() {

    }

    Login(String login) {
        this.login = login;
    }

    public void setLogin(String login) throws IllegalLoginException {
        for (Login x : Login.values()) {
            if (login == null || login.equals(x.getLogin())) {
                throw new IllegalLoginException();
            }
        }
        this.login = login;
    }

    public String getLogin() {
        return this.login;
    }
}