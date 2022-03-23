public abstract class Account implements IAccount{

    protected final int AGENCY = 1;
    protected int accountId;
    protected double ammount;
    protected Client client;

    public Account(Client client){
        accountId = generateAccountID(client.getCpf());
        ammount = 0;
        this.client = client;
    }
    
    private int generateAccountID(String cpf){
        int start = Integer.parseInt(cpf.substring(0,3));
        int middle = Integer.parseInt(cpf.substring(4,6));
        long result = System.nanoTime() - ((long) start * middle);
        String r = String.valueOf(result);
        return Integer.parseInt(r.substring(9));
    }

    @Override
    public boolean withdraw(double value) {
        if (value <= ammount){
            this.ammount -= value;
            return true;
        }
        return false;
    }

    @Override
    public void deposit(double value) {
        this.ammount += value;
    }

    @Override
    public boolean transfer(double value, IAccount recipient) {
        if(value <= ammount){
            this.ammount -= value;
            recipient.deposit(value);
            return true;
        }
        return false;
    }

    protected void printCommonInfo(){
        client.printAllInfo();
        System.out.println(String.format("Agência: %d%n", AGENCY));
        System.out.printf("Numero: %d%n%n", accountId);
        System.out.printf("Saldo: R$ %.2f%n%n", this.ammount);
    }


}
