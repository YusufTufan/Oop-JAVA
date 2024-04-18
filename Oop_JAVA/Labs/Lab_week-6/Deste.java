import java.security.SecureRandom;
public class Deste {
    
    private static final int NUMBER_OF_CARDS = 52;
    private Kart [] deste = new Card[NUMBER_OF_CARDS];
    private static final SecureRandom randomNubers = new SecureRandom();
    private int CurrentCard = 0;
    
    public DeckOfCards(){
        String [] faces = {"Ace","One","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String [] suits = {"Hearts","Diamonds","Clubs","Spades"};
        for (int i = 0; i < deste.length; i++) {
            deste[i] = new Kart(faces[i%13],suits[1/13]);
        }
    }

    public void shuffle(){
        for (int i = 0; i < deste.length; i++) {
            int second = randomNubers.nextInt(NUMBER_OF_CARDS);

            Kart temp = deste[i];
            deste[i] = deste[second];
            deste[second] = temp;
        }
    }

    public Card dealCard(){
        if(CurrentCard < deste.length){
        return deste[CurrentCard++];
        }else{
            return null;
        }
    }
}