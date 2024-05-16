import java.io.IOException;

public class MainProgram {
    public static void main(String[] args) throws IOException, InterruptedException {
        UserMenu userMenu = new UserMenu();
        userMenu.showInitialMenu();
    }
}