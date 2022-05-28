import java.util.ArrayList;
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

    public void removeParcel(String code){
        int i = -1;
        for (Parcel parcel : packages) {
            i++;
            if (code.equals(parcel.getCode())){
                break;
            }
        }
        packages.remove(packages.remove(i));
    }

    public void removeAll() {
        packages.removeAll(packages);
    }
}
