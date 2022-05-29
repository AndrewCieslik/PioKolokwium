import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParcelLocker {
    private List<Parcel> packages = new ArrayList();

    public void addParcel(Parcel newPackage){
        if (newPackage != null){
            packages.add(newPackage);
        } else {
            throw new NullPointerException("No parcel");
        }
    }

    public void listParcel() {
        int sum = 0;
        for (Parcel parcel : packages) {
            System.out.println(parcel.getCode());
            sum += parcel.getWeight();
        }
        System.out.println("Summary weight: " + sum);
    }

    public void removeParcel(String code) {
        for (Parcel parcel : packages) {
            if(code.equals(parcel.getCode())){
                packages.remove(parcel);
            }
        }
    }

    public void removeAll() {
        packages.removeAll(packages);
    }
}
