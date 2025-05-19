package Model;

import java.util.ArrayList;
import java.util.List;

//esta clase contiene el modelo de las torres de hanoi
public class hanoiModel {
    
    private final List<String> moves = new ArrayList<>();

    public void solve(int n, char source, char aux, char target) {

        moves.clear();
        hanoi(n, source, aux, target);
    }

    private void hanoi(int n, char source, char aux, char target){

        if(n==1){
            moves.add("mover disco " + n + " de " + source + " a " + target);
            return;
        }
        hanoi(n -1, source, target, aux);
        moves.add("mover disco " + n + " de " + source + " a " + target);
        hanoi(n - 1, aux, source, target);
    }

    public List<String> getMoves() {
        return moves;
    }
}
