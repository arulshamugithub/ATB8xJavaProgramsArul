package Oct.ex_16102024;

import java.awt.*;

public class Lab155 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getHexcode());

        if(Color.RED.getHexcode() == "#FF000"){
            System.out.println("Color is RED");
        }
    }
}

enum Color {
    RED("#FF000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");


    private String hexcode;

    private Color(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return this.hexcode;
    }
}

