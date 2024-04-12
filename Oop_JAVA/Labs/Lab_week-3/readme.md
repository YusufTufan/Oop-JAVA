# Lab Week 3
Bu Java programı, Sezar şifreleme, Sezar deşifreleme ve Vigenere şifreleme yöntemlerini içerir. İki farklı uygulama alanını kapsar.

## Uygulama-1: Sezar Şifreleme ve Deşifreleme
Bu bölümde, metinleri Sezar şifreleme yöntemiyle şifreler ve deşifre ederiz. Sezar şifreleme, metin içindeki her karakteri bir anahtar (sabit bir kaydırma miktarı) ile değiştirir.

### Kullanım
```java
String sifreliMesaj = SezarEncrypt(mesaj, key);
String DesifrelenmisMesaj = SezarDecrypt(sifreliMesaj, key);
```

- `mesaj`: Şifrelenecek veya deşifre edilecek olan metin.
- `key`: Kaydırma miktarı.

## Uygulama-2: Vigenere Şifreleme
Bu bölümde, metinleri Vigenere şifreleme yöntemiyle şifreleriz. Vigenere şifreleme, metni bir anahtar kelimeye göre şifreler. Her bir karakter, anahtar kelimenin karakterleriyle dönüştürülür.

### Kullanım
```java
String sifreliMetin = vigenereSifrele(metin, anahtar);
```

- `metin`: Şifrelenecek metin.
- `anahtar`: Şifreleme için kullanılacak anahtar kelime.

## Örnek Kullanım
```java
// Sezar şifreleme örneği
String mesaj = "HELLO ALL THERE";
String sifreliMesaj = SezarEncrypt(mesaj, 7);
String DesifrelenmisMesaj = SezarDecrypt(sifreliMesaj, 7);

// Vigenere şifreleme örneği
String sifrelimetin = vigenereSifrele(metin, anahtar);
```

## Gereksinimler
- Java JDK (Java Development Kit)
- IDE (Integrated Development Environment) veya Java derleyici
