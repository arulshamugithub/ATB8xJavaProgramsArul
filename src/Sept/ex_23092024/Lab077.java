package Sept.ex_23092024;

public class Lab077 {
    public static void main(String[] args) {
        //web automation
        // ask user to enter which browser you want to open
        String browser = "chrome";
        switch (browser){

            case "chrome":
                System.out.println("Open Chrome browser");
                break;
            case "firefox":
                System.out.println("Open Firefox browser");
                break;
            case "safari":
                System.out.println("Open safari browser");
                break;
            default:
                System.out.println("invalid browser name");
                break;
        }

    }
}
