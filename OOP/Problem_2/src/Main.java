public class Main {
    public static void main(String[] args) {
       menghitungvolume MenghitungVolume = new menghitungvolume();
       kubus Kubus = new kubus(10);
       balok Balok = new balok(3,6,10);
       tabung Tabung = new tabung(7,10);

      MenghitungVolume.volume();
        System.out.println("Volume Kubus adalah: " + Kubus.volume());
        System.out.println("Volume Balok adalah : " + Balok.volume());
        System.out.println("Volume Tabung adalah : " + Tabung.volume());

    }
}