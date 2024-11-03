public class Lab_week_2 {
    public static void main(String[] args) {
        //Uygulama 1
        int [] a = {10,15,20,25,5,8,100,9};
        System.out.println(search(a,15));
        int [] b = selectionSort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static boolean search(int [] dizi,int x){ //Uygulama 1 in search methodu...
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]==x){
                return true;
            }
        }
        return false;
    }

    //Uygulama 2
    public static int [] selectionSort(int [] dizi){  //Uygulama 2 nin selectionSort methodu...
        int min;
        int temp;
        for (int i = 0; i < dizi.length-1; i++) {
            min =i;
            for (int j = i+1; j < dizi.length; j++) {
                if(dizi[j]<dizi[min]){
                    min = j;
                }
            }  
            temp = dizi[i];
            dizi[i] = dizi[min];
            dizi[min] = temp;
        }
        return dizi;
    }
}