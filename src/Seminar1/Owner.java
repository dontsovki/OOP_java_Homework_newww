package Seminar1;

public class Owner extends Cat{
    private String nameOner;

    public String getNameOner() {
        return nameOner;
    }

    public void setNameOner(String nameOner) {
        this.nameOner = nameOner;
    }

    public Owner(String nameOner) {
        super();
        this.nameOner = nameOner;
    }


}
