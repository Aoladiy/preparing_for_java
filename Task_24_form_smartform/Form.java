package Task_24_form_smartform;

import java.util.Objects;

public class Form {
    public String user;
    public String password;

    Form(){

    }


    public String checkAuthority(Smartform smf, String user, String password){
        if (smf.requestPassword(user).equals(password)){
            return "Success!";
        }
        return "Access denied!";

    }


}
