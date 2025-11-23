public class Main {
    public  static  void  main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(20000);
        System.out.println("На счет положено: 20000");

        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("Ошибка: "+ e.getMessage());
                System.out.println("Остаток: "+ e.getRemainingAmount());

                account.withdrawRemainning(e.getRemainingAmount());
           break;
            }
        }

        System.out.println("Цикл завершен.");
    }
}
