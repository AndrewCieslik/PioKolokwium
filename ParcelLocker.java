import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;

public class ParcelLocker {
    private List<Parcel> packages = new ArrayList();

    public void addParcel(Parcel newPackage){
        packages.add(newPackage);
    }

    public void listParcel() {
        int sum = 0;
        for (Parcel parcel : packages) {
            System.out.println(parcel.getCode());
            sum += parcel.getWeight();
            System.out.println("Summary weigth: " + sum);

        }
    }

    public void removeAll() {
        packages.removeAll(packages);
    }
}
