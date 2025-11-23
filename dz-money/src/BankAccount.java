public class BankAccount {
    private double money;

    public double getAmount() {
        return money;
    }

    public void deposit(double sum) {
        money += sum;
    }

    public void withDraw(int sum) throws LimitException{
        if (sum > money){
            throw new LimitException("Недостаточно средств!", money);
        }
        money -= sum;
        System.out.println("Снято " +sum+ ". Остаток: " + money);
    }

    public void withdrawRemainning(double sum) {
        money -= sum;
        System.out.println("Снято оставшиеся "+sum+". Остаток: " + money);
    }
}
