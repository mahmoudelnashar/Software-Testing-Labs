public class stock {
    int stock=3;

    public void fill(int s)
    {
        stock +=s;
    }
    public void buy(){
        stock -=1;
    }
    public void empty(){
        stock =0;
    }
    public void set_stock(int s) {
        stock = s;
    }
    public int get_stock(){
        return stock;
    }
    boolean has_stock(){
        return stock > 0;

    }
}

