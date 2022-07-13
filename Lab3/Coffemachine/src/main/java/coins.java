public class coins {
    int coins=0;

    void empty(int coin) {
        coins =0;
    }

    void putcoin(){
        coins++;
    }
    boolean has_coins(){
        return coins != 0;
    }

}