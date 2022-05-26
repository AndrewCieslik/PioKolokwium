public class Main {
    public static void main(String[] args) {
        Parcel package1 = new Parcel("PP-0000", 2000);
        ParcelLocker locker = new ParcelLocker();
        locker.addParcel(package1);
        locker.listParcel();
    }
}
