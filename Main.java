import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> deck = new LinkedList<>();
        Queue<Integer> deckSec = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x = x + 1) {
            deck.offer(scanner.nextInt());
        }
        for (int x = 0; x < 5; x = x + 1) {
            deckSec.offer(scanner.nextInt());
        }
        int count=0;
        while(count!=106){
            int first=0;
            first=deck.poll();
            int second=0;
            second=deckSec.poll();
            if(first<second){
                deck.offer(first);
                deck.offer(second);
            }
            if(first>second){
                deckSec.offer(second);
                deckSec.offer(first);
            }
            if(deck.isEmpty()){
                System.out.println("second "+count);
                break;
            }
            if(deckSec.isEmpty()){
                System.out.println("first "+count);
                break;
            }
            count++;
        }
        if(count==106){
            System.out.println("botva");
        }
    }
}