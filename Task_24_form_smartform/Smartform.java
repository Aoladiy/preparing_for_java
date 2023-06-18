package Task_24_form_smartform;

import java.util.HashMap;

public class Smartform extends Form {
    protected static HashMap<String, String> base = new HashMap<>();
    Smartform() {
        super();
    }

    public String register(String user, String password){
        base.put(user, password);
        return "Success!";
    }

    public String requestPassword(String user){
        return base.get(user);
    }

}
