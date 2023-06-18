package Task_24_form_smartform;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner sc_str = new Scanner(System.in);
        System.out.println("Введите пользователя...");
        String user = sc_str.nextLine();
        System.out.println("Введите пароль...");
        String password = sc_str.nextLine();
        Form f1 = new Form();
        Smartform smf = new Smartform();
        System.out.println(smf.register(user, password));
        System.out.println("Введите пользователя...");
        user = sc_str.nextLine();
        System.out.println("Введите пароль...");
        password = sc_str.nextLine();
        System.out.println(f1.checkAuthority(smf, user, password));

    }
}
