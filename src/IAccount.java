public interface IAccount {

    boolean withdraw(double value);

    void deposit(double value);

    boolean transfer(double value, IAccount recipient);

    void print_statement();
}
