# Günlük Sürüş Maliyeti Hesaplama
Bu Java programı, kullanıcının günlük sürüş maliyetini hesaplamak için kullanılır. Program, kullanıcıdan günlük kat edilen mesafe, benzin fiyatı, aracın kilometre başına benzin tüketimi, otopark ücreti ve diğer ek ücretler gibi bilgileri alır.

## Nasıl Çalışır?

1. Kullanıcıya günlük kat edilen mesafe, benzin fiyatı, aracın kilometre başına benzin tüketimi, otopark ücreti ve diğer ek ücretler sorulur.
2. Girilen bilgiler kullanılarak günlük sürüş maliyeti hesaplanır.
3. Hesaplanan maliyet kullanıcıya ekranda gösterilir.

## Kullanım

1. Java derleyici ile `GunlukSurusMaaliyeti.java` dosyasını derleyin: `javac GunlukSurusMaaliyeti.java`
2. Oluşan `.class` dosyasını çalıştırın: `java GunlukSurusMaaliyeti`
3. Program kullanıcıdan gerekli bilgileri isteyecek, ardından günlük sürüş maliyetini hesaplayacak ve ekrana yazdıracaktır.

## Örnek
```
Günlük katettiğiniz mesafe kaç mil? 50
Aldığınız bir galon benzinin fiyatı nedir? 3.5
Mil başına ne kadar galonluk benzin harcıyorsun? 0.2
Otoparkın saatlik ücreti ne kadar? 2.5
Araban otoparkta kaç saat geçirdi? 4
Günde kaç kez geçiş ücreti ödedin? 2
Her geçişte ne kadar ödedin? 1.75

Günlük sürüş maaliyeti: 59.5
```
