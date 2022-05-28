public class Main {
    public static void main(String[] args) {
        Parcel package1 = new Parcel("PPP-0000C", 2000);
        ParcelLocker locker = new ParcelLocker();
        locker.addParcel(package1);
        locker.addParcel(null);
        locker.listParcel();

    }
}
