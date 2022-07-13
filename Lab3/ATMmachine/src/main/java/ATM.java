public class ATM {
    float balance = 0;
    withdraw w = new withdraw();
    deposit d = new deposit();

    public float transaction(int op, float amount) {
            if (op==1)
                this.balance = w.withdraw_money(amount, balance);
            else if(op==2)
                this.balance = d.deposit_money(amount, balance);
        return balance;
    }
}
