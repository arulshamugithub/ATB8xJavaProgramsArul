package Oct.ex_14102024;

public class Lab144 {
    public static void main(String[] args) {
        chromeTestCase tch = new chromeTestCase();
        tch.openBrowser("Chrome");
        tch.closeBrowser("Chrome");
        tch.takescreenshot();
        tch.nobodyknowwhereIamPresent();

        firefoxTestCase tcf = new firefoxTestCase();
        tcf.openBrowser("Firefox");
        tcf.closeBrowser("Forefox");
    }

}
