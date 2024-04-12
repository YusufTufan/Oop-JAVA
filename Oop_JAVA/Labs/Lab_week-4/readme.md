# Banka Hesap Yönetimi ve Kalp Atış Hızı Hesaplama
Bu proje, Java dilinde iki farklı sınıf içermektedir: `BankAccount` ve `HeartRate`. Her biri belirli bir amaca hizmet eder ve farklı kullanım senaryolarına yöneliktir.

## BankAccount Sınıfı
`BankAccount` sınıfı, banka hesaplarını yönetmek için tasarlanmıştır. İşte temel özellikleri ve kullanımları:

### Özellikler
- **Hesap Numarası (`HesapNo`):** Her hesaba özgü benzersiz bir numara.
- **Bakiye (`Bakiye`):** Hesaptaki mevcut para miktarı.

### Temel İşlemler
- **Para Yatırma (`ParaYatir(float miktar)`):** Belirtilen miktarı hesaba yatırır.
- **Para Çekme (`ParaCek(float miktar)`):** Belirtilen miktarı hesaptan çeker.
- **Havale (`Havale(BankAccount other, float miktar)`):** Başka bir hesaba belirtilen miktarı havale eder.
- **Hesaplar Arası Havale (`HesaplarimArasindaHavale(BankAccount first, BankAccount second, float miktar)`):** İki farklı hesap arasında belirtilen miktarı havale eder.

### Kullanım
```java
// Örnek Banka Hesabı Oluşturma
BankAccount hesap1 = new BankAccount("1234567890");

// Para Yatırma
hesap1.ParaYatir(1000);

// Para Çekme
hesap1.ParaCek(500);

// Havale Yapma
BankAccount digerHesap = new BankAccount("0987654321");
hesap1.Havale(digerHesap, 200);

// Hesaplar Arası Havale Yapma
BankAccount birinciHesap = new BankAccount("1111111111");
BankAccount ikinciHesap = new BankAccount("2222222222");
birinciHesap.HesaplarimArasindaHavale(birinciHesap, ikinciHesap, 300);
```

## HeartRate Sınıfı
`HeartRate` sınıfı, kişinin yaşına bağlı olarak kalp atış hızını hesaplamak ve önerilen kalp atış hızını belirlemek için tasarlanmıştır.

### Özellikler
- **Ad (`ad`):** Kişinin adı.
- **Soyad (`soyAd`):** Kişinin soyadı.
- **Doğum Yılı (`dogumYili`):** Kişinin doğum yılı.

### Temel İşlemler
- **Yaş Hesaplama (`getAge()`):** Kişinin yaşını hesaplar.
- **Maksimum Kalp Atış Hızı Hesaplama (`MaxHeartRate()`):** Kişinin maksimum kalp atış hızını hesaplar.
- **Önerilen Kalp Atış Hızını Belirleme (`RequriedHeartrate()`):** Kişinin yaşına bağlı olarak önerilen kalp atış hızını belirler.

### Kullanım
```java
// Örnek Kişi Oluşturma
HeartRate kisi = new HeartRate("John", "Doe", 1980);

// Yaş Hesaplama
int yas = kisi.getAge();

// Maksimum Kalp Atış Hızı Hesaplama
int maksKalpAtisHizi = kisi.MaxHeartRate();

// Önerilen Kalp Atış Hızını Belirleme
kisi.RequriedHeartrate();
```

---
Bu README.md dosyası, projenin kullanımını açıklamak için kullanıcılara ve diğer geliştiricilere yardımcı olacaktır.
