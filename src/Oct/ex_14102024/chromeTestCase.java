package Oct.ex_14102024;

public class chromeTestCase extends BaseClass{

    @Override
    void openBrowser(String browser) {
        System.out.println("Open Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close Chrome");
    }
}
