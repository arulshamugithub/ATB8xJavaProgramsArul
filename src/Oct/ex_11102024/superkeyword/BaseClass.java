package Oct.ex_11102024.superkeyword;

public class BaseClass {
    private String browser;
   BaseClass(){
       System.out.println("DC - Baseclass");
   }
   BaseClass(String a) {
        System.out.println("PC -- Baseclass");;
    }

    public String getBrowser() {
        return browser;
    }
    public void setBrowser(String browser, boolean is_auth) {
        if (is_auth) {
            this.browser = browser;
            System.out.println("Browser set successfully");
        } else{
            System.out.println("Not Allowed");
        }
   }
    void openBrowser(){
        System.out.println("Chrome");
    }
    void openBrowser(String browserName){
        System.out.println("Browser name " + browserName);
   }
    void closeBrowser(){
        System.out.println("CloseBrowser");
    }
}
