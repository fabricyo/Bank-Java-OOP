import javax.swing.text.MaskFormatter;
import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String cpf;

    public Client(String name, String cpf){
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {

        return cpf;
    }
    public void printAllInfo() {
        String _cpf = this.cpf;
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
            _cpf =  mask.valueToString(cpf);
        }catch (Exception e){
            //Fazer nada
        }
        System.out.println(String.format("=== Informações de %s - %s ===", name, _cpf));
    }
}
