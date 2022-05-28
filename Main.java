public class Main {
    public static void main(String[] args) {
        Parcel package1 = new Parcel("PPP-0000C", 2000);
        Parcel package2 = new Parcel("PPP-0020C", 5000);
        Parcel package3 = new Parcel("PPP-0023C", 3000);


        ParcelLocker locker = new ParcelLocker();
        locker.addParcel(package1);
        locker.addParcel(package2);
        locker.addParcel(package3);

        locker.listParcel();
        locker.removeParcel("PPP-0000C");
        locker.listParcel();

    }
}
