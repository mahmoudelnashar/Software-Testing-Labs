public class withdraw {
    float withdraw_money(float amount,float balance){
        if (amount <= balance)
            return balance -amount;

        else
            return balance;
    }
}
