# Lab Hafta 2
Bu Java programı, iki farklı uygulamayı içerir ve her birinin kendi işlevselliğini yerine getiren yöntemleri vardır.

## Uygulama 1: Dizi Elemanı Arama
Bu uygulama, bir dizide belirli bir elemanın varlığını arar. `search` yöntemi kullanılarak gerçekleştirilir.

### Kullanım
```java
boolean sonuc = search(dizi, arananEleman);
```

- `dizi`: Arama yapılacak dizi.
- `arananEleman`: Dizide aranacak olan eleman.

### Örnek
```java
int[] dizi = {10, 15, 20, 25, 5, 8, 100, 9};
boolean sonuc = search(dizi, 15);
System.out.println(sonuc); // true
```

## Uygulama 2: Seçim Sıralaması
Bu uygulama, bir dizi içindeki elemanları seçim sıralama algoritması kullanarak küçükten büyüğe sıralar. `selectionSort` yöntemi kullanılarak gerçekleştirilir.

### Kullanım
```java
int[] siralanmisDizi = selectionSort(dizi);
```

- `dizi`: Sıralanacak olan dizi.

### Örnek
```java
int[] dizi = {10, 15, 20, 25, 5, 8, 100, 9};
int[] siralanmisDizi = selectionSort(dizi);
for (int i = 0; i < siralanmisDizi.length; i++) {
    System.out.println(siralanmisDizi[i]);
}
```

Bu, sıralanmış diziyi konsola yazdıracaktır.

## Notlar
- Program, `search` ve `selectionSort` adlı iki farklı yönteme sahiptir.
- Her bir yöntem, belirli bir işlevselliği gerçekleştirir.
- Uygulamaların kullanımı ve örnekleri README dosyasında açıklanmıştır.

Bu README dosyası, her bir uygulamanın işlevselliğini açıklar, kullanımını ve örneklerini gösterir, katkıları hoş karşılar ve projenin lisansını belirtir.
