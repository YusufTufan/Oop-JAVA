# Sayı Tahmin Oyunu
Bu basit Java programı, bilgisayarın rastgele bir sayı seçtiği ve kullanıcının bu sayıyı tahmin etmeye çalıştığı bir oyundur.

## Nasıl Çalışır?

1. Bilgisayar rastgele bir sayı seçer (1 ile 100 arasında).
2. Kullanıcıdan bir tahmin istenir.
3. Kullanıcının tahmini, bilgisayarın seçtiği sayı ile karşılaştırılır.
4. Eğer tahmin doğruysa, kullanıcıya tebrik mesajı gösterilir ve oyun sona erer.
5. Eğer tahmin yanlışsa, kullanıcıya doğru cevabın daha yukarıda veya aşağıda olduğu bilgisi verilir ve yeni bir tahmin istenir.
6. Kullanıcı doğru cevabı bulana kadar bu işlem tekrarlanır.

## Kullanım

1. Java derleyici ile `sayiTahmin.java` dosyasını derleyin: `javac sayiTahmin.java`
2. Oluşan `.class` dosyasını çalıştırın: `java sayiTahmin`
3. Program bilgisayarın seçtiği sayıyı tahmin etmenizi isteyecek ve her tahmin sonrasında size ipuçları verecektir.

## Örnek
```
Lütfen tahmininizi giriniz: 50
Şu anlık cevabın yanlış, tahmin edilen sayıdan daha yukarıdasın. Tekrar Dene!!
Lütfen tahmininizi giriniz: 30
Şu anlık cevabın yanlış, tahmin edilen sayıdan daha aşağıdasın. Tekrar Dene!!
Lütfen tahmininizi giriniz: 40
Tebrikler, doğru cevap: 40
```
