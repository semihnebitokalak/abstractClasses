public class Main {
    public static void main(String[] args) {
        // Abstract sınıftan nesne oluşturamayız:
        // GameCalculator gameCalculator = new GameCalculator();
        // GameCalculator gameCalculator1 = new GameCalculator();
        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
        GameCalculator gameCalculator1 = new WomanGameCalculator();
        gameCalculator1.hesapla();
        gameCalculator1.gameOver();
    }
}
// Bu örneğimizde class isimlerinden de anlayacağınız üzere bi oyun var ve 3 farklı puanlama katagorisi var.
// bu katagorilerin puan değerleri farklı olduğundan abstract kullanırız.
// Peki abstract nedir?
// Abstract extends ettiğimiz genel bilgiyi çürütür ve bulunan class içerisindeki değeri yazar.
// Bunu bütün classlarda belirtmemiz lazım ki hata almayalım.
// Abstract lar zorunlu herkesin içini doldurması gereken bir yapıdır.
// New ile oluşturamıyoruz.
// 6. satırdaki yorum satırını kaldırırsanız hatayı fark edeceksiniz.