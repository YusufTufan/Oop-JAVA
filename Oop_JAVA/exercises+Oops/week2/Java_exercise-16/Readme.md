# Ağaç Desenleri
Bu Java programı, iki ağaç deseni yazdırır: biri yukarı doğru büyüyen ve diğeri aşağı doğru büyüyen.

## Kullanım
Programı çalıştırmak için, `Tree.java` dosyasını bir Java derleyicisi ile derleyip çalıştırabilirsiniz:

1. `Tree.java` dosyasını derleyin:
   ```
   javac Tree.java
   ```

2. Derlenmiş programı çalıştırın:
   ```
   java Tree
   ```

## Ağaç Desenleri

### Yukarı Doğru Büyüyen Ağaç
Programın ilk kısmı, yukarı doğru büyüyen bir ağaç yazdırır. Ağacın her satırı artan sayıda yıldız işareti (`*`) içerir, üçgen bir şekil oluşturur.

```
*         
**        
***       
****      
*****     
******    
*******   
********  
********* 
**********
```

### Aşağı Doğru Büyüyen Ağaç
Programın ikinci kısmı, aşağı doğru büyüyen bir ağaç yazdırır. Ağacın her satırı azalan sayıda yıldız işareti (`*`) içerir, ters üçgen bir şekil oluşturur.

```
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
```

## Notlar
- Program, her ağaç deseninin her satırını yazdırmak için iç içe geçmiş `for` döngülerini kullanır.
- Ağaç desenlerinin her bir satırı, döngü indeks değişkeni `i`'nin mevcut değerine dayanarak yazdırılır.
- Programın ilk kısmı yukarı doğru büyüyen bir ağaç yazdırırken, ikinci kısmı aşağı doğru büyüyen bir ağaç yazdırır.

Bu README dosyası, programın nasıl kullanılacağını, üretilen ağaç desenlerini açıklar, programın yapısı hakkında notlar sağlar...
