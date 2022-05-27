import java.util.ArrayList;
import java.util.List;

public class Parcel {
    private String code;
    private int weight;

    public Parcel(String code, int weight) {

        if(code != null && code.matches("^[A-Z]{3}-[0-9]{4}C$")) {
            this.code = code;
        } else {
            throw new IllegalArgumentException("Wrong code (ex. XXX-0000C)");
        }

        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
