package user;

public class User {
    private UserManager userManager = new UserManager();

    public void signUp() {
        System.out.println("+----------------------+");
        System.out.println("|        SIGN UP       |");
        System.out.println("+----------------------+");
        System.out.println();
        
        String username;

        userManager.setUsername(username);
    }

    public void logIn() {
        System.out.println("+----------------------+");
        System.out.println("|         LOG IN       |");
        System.out.println("+----------------------+");
        System.out.println();
        System.out.println(" ");
    }    
}
