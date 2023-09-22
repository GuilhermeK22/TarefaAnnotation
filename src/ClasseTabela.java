import java.lang.annotation.Target;

@Tabela(value = {"Pedro, João, Ana, Larissa, Maria"}, carros = {"Ford, Volkswagen, Fiat, Tesla, Toyota"}, placaVeic = 20231451L)
public class ClasseTabela {
    @Tabela(value = {"Pedro, João, Ana, Larissa, Maria"}, carros = {"Ford, Volkswagen, Fiat, Tesla, Toyota"}, placaVeic = 20231451L)
    private String nome;
    @Tabela(value = {"Pedro, João, Ana, Larissa, Maria"}, carros = {"Ford, Volkswagen, Fiat, Tesla, Toyota"}, placaVeic = 20231451L)
    public ClasseTabela(){

    }
}
