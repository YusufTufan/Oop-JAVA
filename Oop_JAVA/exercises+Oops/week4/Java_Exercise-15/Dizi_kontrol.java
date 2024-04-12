import java.util.Arrays;
public class Dizi_kontrol {
    public static void main(String[] args) {
        int [] dizi  = {1,2,3,4,5,6,7,8,9,10};
        int [] new_dizi = ciftleriarttir(dizi);
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(new_dizi));
    }
    public static  int[]  ciftleriarttir (int [] s){
        int yenilenmis_dizi[] = Arrays.copyOf(s,s.length);
        for(int i=0; i<yenilenmis_dizi.length;i++){
            if (yenilenmis_dizi[i]%2==0){
                yenilenmis_dizi[i]+=2;
            }
        }
        return yenilenmis_dizi;
    }
}