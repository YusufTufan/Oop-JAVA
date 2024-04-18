import java.util.Random;
public class Virus {

    private String gen;
    private int kod;
    private Virus parent;

    public String getGen() {
        return gen;
    }
    public void setGen(String gen) {
        this.gen = gen;
    }
    public int getKod() {
        return kod;
    }
    public void setKod(int kod) {
        this.kod = kod;
    }
    public Virus getParent() {
        return parent;
    }
    public void setParent(Virus parent) {
        this.parent = parent;
    }
    public Virus(String gen, int kod){
        setKod(kod);
        setGen(gen);
    }
    private Virus(String gen, int kod, Virus patent){
        setGen(gen);
        setKod(kod);
        setPatent(patent);
    }
    public void print(){
        System.out.println("Kod>>>"+getKod()+" Gen>>>"+getGen());
    }
    public boolean hasParent(){
        if(this.parent == null){
            return false;
        }else{
            return true;
        }
    }
    public  boolean DnaCompare(Virus obj){
        if(this.gen.compareTo(obj.gen)==0){
            return true;
        }else{
            return false;
        }
    }
    public void Mutasyon(){
        Random rnd = new Random();
        char [] genom = {'A','C','G','I'};
        char [] mutantGen = this.gen.toCharArray();
        int number = rnd.nextInt(getGen().length());
        int numberForGenom = rnd.nextInt(1000);
        mutantGen[number] = genom [numberForGenom%4];
        this.gen = new String(mutantGen);      
    }
}