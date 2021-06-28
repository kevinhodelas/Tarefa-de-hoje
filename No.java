public class No {
  private String nomeDoPassageiro;
  private No prox; 

  // propriedade da classe 
  public No getProx(){
    return this.prox; 
  } 
  public void setProx(No prox) {
    this.prox = prox; 
  }
  public String getnomeDoPassageiro(){
    return this.nomeDoPassageiro;
}
  //Construtor da classe No
  public No(String nomeDoPassageironovo) {
    nomeDoPassageiro = nomeDoPassageironovo;
    prox = null;
  }
  public No(String nomeDoPassageironovo, No ligacao) {
    nomeDoPassageiro = nomeDoPassageironovo;
    prox = ligacao;
  }
}
