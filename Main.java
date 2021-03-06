import java.util.Scanner;
class Main{
  private No primeiro; 
  private No ultimo; 
  private String nomeDoVoo; 
  private String passageiros; 

  public Main(String nome) {
    nomeDoVoo = nome; 
    
    primeiro = ultimo = null; 
  } 
  public Main() {
    nomeDoVoo = "RS para SP"; 
    primeiro = ultimo = null; 
  }
  public void InsereNaFrente(String item) {

    if (Vazia())
    primeiro = ultimo = new No(item);
    else
    primeiro = new No(item, primeiro);
  }
  public void InsereNoFundo(String item) {
    if (Vazia())
    primeiro = ultimo = new No(item);
    else {
      ultimo.setProx(new No(item));
      ultimo = ultimo.getProx();
    }
  }
  public String RemoveDaFrente() {

    if (Vazia()) {
      return null;
    }
    String item = primeiro.getnomeDoPassageiro();

    if (primeiro == ultimo)
    primeiro = ultimo = null;

    else
    primeiro = primeiro.getProx();
    return item;
  } 
  public String RemoveDoFundo() {
    if (Vazia())
    {
      return null;
    }
    String item = ultimo.getnomeDoPassageiro();
    if (primeiro == ultimo)
    primeiro = ultimo = null;
    else
    {
      No atual = primeiro;
      while (atual.getProx() != ultimo)
      atual = atual.getProx();
      ultimo = atual;
      atual.setProx(null);
    }
    return item;
  }
  public boolean Vazia() {

    return primeiro == null;
  }

  public String EscreveLista() {
    String temp = "";
    if (Vazia()) {
      temp += "Vazia " + nomeDoVoo;
      return temp;
    }
    temp += "A " + nomeDoVoo + " contem: \n\n";
    No atual = primeiro;
    while (atual != null) {
      temp += atual.getnomeDoPassageiro() + ", ";
      atual = atual.getProx();
    }
    temp += "\n";
    return temp;
  } 
    public String exibePrim(){
    if (primeiro == null) return "primeiro: null"; 
    else return "Primeiro: " + primeiro.getnomeDoPassageiro(); 
  } 
  public String exibeUlt() {
    if (ultimo == null) return "Ultimo: null"; 

    else return "Ultimo: " + ultimo.getnomeDoPassageiro(); 
  }
  public static void main(String[] args) {

    Main l1 = new Main();
  
    l1.InsereNaFrente("Jaison");
    l1.InsereNaFrente("Cleber");
    l1.InsereNoFundo("Joaquina");
    System.out.print(l1.EscreveLista());
    l1.RemoveDaFrente();
    l1.RemoveDoFundo();
    System.out.print(l1.EscreveLista());
  }                                                                            
}
