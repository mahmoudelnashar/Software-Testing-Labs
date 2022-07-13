public class coffee_machine {
    coins coin1= new coins();
    stock stock1 = new stock();

    public  coffee_machine(int s) {
        stock1.fill(s);
    }
    void giving_coffee(int x){
        while(x>0 && stock1.has_stock()){
            System.out.println("getting coffee");
            coin1.putcoin();
            stock1.buy();
            x--;
        }
        if (x!=0) System.out.println("machine has no coffee");
    }

}




