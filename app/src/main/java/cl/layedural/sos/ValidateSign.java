package cl.layedural.sos;

/**
 * Created by Genesis Narvaez on 06/04/2018.
 */

public class ValidateSign {
    String email, password;

    public ValidateSign(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

