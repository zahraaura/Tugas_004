public class LCD {

    // deklarasi variabel anggota
    private String Status;//menyimpan status LCD (misalnya "Mati", "Menyala", "Freeze")
    private int Volume;//menyimpan nilai volume LCD
    private int Brightness;//menyimpan nilai kecerahan LCD
    private int Cable;//menyimpan jenis kabel yang terhubung ke LCD
    private String[] cables;//array berisi beberapa nama kabel

    // constructor untuk menginisialisasi nilai awal variabel anggota
    public LCD() {
        this.Status = "Mati";
        this.Volume = 0;
        this.Brightness = 0;
        this.Cable = 0;
        cables = new String[]{"Tidak terhubung", "VGA", "HDMI", "DVI", "DisplayPort"};
    }

    // getter method
    public String getStatus() {
        return Status;
    }//mengembalikan nilai variabel status
    public int getVolume() {
        return Volume;
    }//mengembalikan nilai variabel volume
    public int getBrightness() {
        return Brightness;
    }//mengembalikan nilai variabel brightness
    public String getCable() {
        return cables[Cable];
    }//mengembalikan nama jenis kabel yang terhubung (dari array cables)

    // method untuk mengubah status
    public void turnOn() {
        this.Status = "Menyala";
    }
    public void turnOff() {
        this.Status = "Mati";
    }
    public void Freeze() {
        this.Status = "Freeze";
    }

    // method untuk mengatur volume
    public void volumeUp() {
        if (Volume < 100) {
            Volume++;
        }//meningkatkan nilai volume sebanyak 1 (jika tidak lebih dari 100)
    }
    public void volumeDown() {
        if (Volume > 0) {
            Volume--;
        }//menurunkan nilai volume sebanyak 1 (jika tidak kurang dari 100)
    }
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.Volume = volume;
        }//mengatur nilai volume ke nilai yang diberikan (jika antara 0 dan 100)
    }

    // method untuk mengatur kecerahan
    public void brightnessUp() {
        if (Brightness < 100) {
            Brightness++;
        }//meningkatkan nilai brightness sebanyak 1 (jika tidak lebih dari 100)
    }
    public void brightnessDown() {
        if (Brightness > 0) {
            Brightness--;
        }//menurunkan nilai brightness sebanyak 1 (jika tidak  kurang dari 100)
    }
    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.Brightness = brightness;
        }//mengatur nilai brightness ke nilai yang diberikan (jika antara 0 dan 100)
    }

    // Method untuk mengatur kabel
    public void setCable(int option) {
        if (option >= 0 && option < cables.length) {
            this.Cable = option;
        } else {
            System.out.println("Pilihan kabel tidak valid!");
        }//mengubah nilai cable ke nilai yang diberikan (jika antara 0 dan 4).
        // jika nilai tidak valid, pesan tidak valid akan ditampilkan
    }

    // method untuk menampilkan pesan
    public void displayMessage() {
        System.out.println("LCD Status: " + getStatus());
        System.out.println("Volume: " + getVolume());
        System.out.println("Brightness: " + getBrightness());
        System.out.println("Cable: " + getCable());
    }
}