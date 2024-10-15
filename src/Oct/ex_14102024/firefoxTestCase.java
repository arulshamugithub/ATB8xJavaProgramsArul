package Oct.ex_14102024;

public class firefoxTestCase extends BaseClass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Opening FireFox");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Closing FireFox");
    }
}
