# Kesişim Bulma Programı
Bu Java programı, iki farklı dizinin kesişimini bulur. İki dizi verildiğinde, her iki dizide de bulunan öğeleri içeren yeni bir dizi oluşturur.

## Kullanım
Program, `Kesisim` sınıfındaki `main` metodundan başlar. İki tane `int` türünde dizi alır ve bu dizilerin kesişimini bulur. Sonuç, ekrana yazdırılır.

```java
public static void main(String[] args) {
    int [] array1 = {1,2,3,4,5};
    int [] array2 = {2,4,7,5,6};
    int [] array3 = intersection(array1, array2);
    for (int k = 0; k < array3.length; k++) {
        System.out.print(array3[k]+" ");
    }   
}
```

`intersection` metodunun imzası şu şekildedir:
```java
public static int[] intersection(int[] array1, int[] array2)
```

Bu metod, iki tane `int` türünde dizi alır ve bu dizilerin kesişimini bulur. Kesişim dizisini döndürür.

## Algoritma
Kesişim bulma işlemi, her iki dizinin elemanlarını karşılaştırarak yapılır. İki dizi de taranırken, aynı elemanların bulunması durumunda kesişim dizisine eklenir.

```java
for (int i = 0; i < array1.length; i++) {
    int sayi1 = array1[i];
    for(int j = 0; j < array2.length; j++) {
        int sayi2 = array2[j];
        if (sayi1 == sayi2) {
            birleşik_dizi[index++] = sayi1;
            break;
        }
    }
}
```

## Geri Dönüş Değeri
Metod, kesişim dizisini `int[]` türünde döndürür.

```java
return intersection;
```

## Örnek
**Girdi:**
```
array1 = {1,2,3,4,5}
array2 = {2,4,7,5,6}
```

**Çıktı:**
```
2 4 5 
```
