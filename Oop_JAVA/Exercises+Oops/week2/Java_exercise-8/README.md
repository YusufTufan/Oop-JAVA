# Asal Sayı Kontrolü
Bu basit Java programı, kullanıcının girdiği bir sayının asal olup olmadığını kontrol eder.

## Nasıl Çalışır?
1. Kullanıcıdan bir sayı istenir.
2. Girilen sayı, 1'den küçükse veya 2'den büyükse, sayı asal olamaz ve bu durum kullanıcıya bildirilir.
3. Girilen sayının 2'den başlayarak, kareköküne kadar olan sayılara kadar bir döngü oluşturulur.
4. Bu döngüde, sayının bu sayılara bölünüp bölünmediği kontrol edilir.
5. Eğer bir sayı böleni varsa, sayı asal değildir ve bu durum kullanıcıya bildirilir.
6. Eğer hiçbir bölen bulunamazsa, sayı asal olarak kabul edilir ve bu durum kullanıcıya bildirilir.

## Kullanım
1. Java derleyici ile `primeNumber.java` dosyasını derleyin: `javac primeNumber.java`
2. Oluşan `.class` dosyasını çalıştırın: `java primeNumber`
3. Program kullanıcıdan bir sayı girmesini isteyecek, ardından sayının asal olup olmadığını kontrol edecek ve sonucu ekrana yazdıracaktır.

## Örnek
```
Lütfen bir sayı giriniz: 17
Bu sayı asal sayıdır: 17
```
