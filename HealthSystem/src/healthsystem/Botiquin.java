package healthsystem;
class botiquin{ 
//atributos
private int montoPuntoDeVida;
private boolean estaUsado;

//metodos
public botiquin(int botVida, boolean botUsado){
    this.montoPuntoDeVida = botVida;
    this.estaUsado = botUsado;
  }
  public boolean getEstaUsado(){return(this.estaUsado);}
}