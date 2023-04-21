import java.util.*;

public class Bag {

    List<Integer> numberInBag;
    Stack<Integer> numbersExtracted;
    static Random r;

    public Bag(){
        numbersExtracted = new Stack<>();
        numberInBag = new ArrayList<>();
        setupBag();
        r = new Random();
    }

    public List<Integer> getNumberInBag() {
        return this.numberInBag;
    }

    private void setupBag() {
        numberInBag.clear();
        numbersExtracted.clear();
        for(int i = 1; i <= 90; i++){
            numberInBag.add(i);
        }
        Collections.shuffle(numberInBag);
    }

    public int extractANumber(){
        int numberExtracted = numberInBag.remove(r.nextInt(numberInBag.size()));
        numbersExtracted.add(numberExtracted);
        return numberExtracted;
    }
    
    public int lastExtracted(){
        return numbersExtracted.peek();
    }
    
    public Stack<Integer> allExtracted(){
        return numbersExtracted;
    }
}
