import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accountList;


    public Bank(String name){
        this.name = name;
        accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc){
        accountList.add(acc);
    }

    public void printAllAccounts(){
        System.out.printf(" ================= Banco %s ", this.name);
        for (Account account: accountList) {
            account.print_statement();
        }
    }

}
