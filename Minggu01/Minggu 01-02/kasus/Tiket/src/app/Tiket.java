package app;

//Interface digunakan saat parent tidak memiliki apa-apa, hanya metode,
//namun metode tersebut harus di implementasikan[harus ada] pada kelas child.
//contoh class interface :

public interface Tiket {
        //method interface
        public void setTiket(int kodeTiket, String tujuanTiket, float harga);
}