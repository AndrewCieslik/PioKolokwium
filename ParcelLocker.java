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
        int countRemovedParcels = 0;

        for (Parcel parcel : packages) {                     //ALTERNATIVELY: packages.removeIf( (Parcel parcel) -> parcel.getCode().equals(code));
            if(code.equals(parcel.getCode())){
                packages.remove(parcel);
                countRemovedParcels++;
            }
        }
        if (countRemovedParcels == 0) {
            throw new IllegalArgumentException("Parcel doesn't exist");
        }
    }

    public void removeAll() {
        packages.removeAll(packages);
    }
}
