
public class Movement {
    Board board=new Board();
    int max=board.get_max();
    public int move(int pos,int inc,int change){
        if(change>0){
            return change;
        }
        if(pos+inc>max) return pos;
        return pos+inc;

    }
}
