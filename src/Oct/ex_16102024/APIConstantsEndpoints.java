package Oct.ex_16102024;

public enum APIConstantsEndpoints {

    BASE_URL("www.base.com"),
    END_URL("www.end.com");

    private String name;

    APIConstantsEndpoints(String name){
        this.name = name;
    }

    public String getValue(){
        return name;
    }
}
