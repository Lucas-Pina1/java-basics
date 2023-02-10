public class MinhaClasse {

  public static void main(String[] args) {
    // Declaração de variaveis
    // Tipo do dado + nome bem definido = atribuição(se nescessário)
    String primeiroNome = "Lucas";
    String segundoNome = "Pina";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeCompleto);

  }

  // Declaração metodos
  // Tipo + Retorno + nome Objetivo no infinitivo + parametros(x)

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
  }

}
