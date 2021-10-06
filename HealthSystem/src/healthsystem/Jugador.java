package healthsystem;

class Jugador {
  //atributos
  private String nombre;
  private int vida = 100;
  private int danioGolpe;

  //metodos
  public Jugador(String nom, int daGolpe, int vidaJ){
    this.nombre = nom;
    this.danioGolpe = daGolpe;
    this.vida = vidaJ;
  }

  public int ataque(){
    return(0);
  }

  public void recibirDanio(int danio){
    vida = vida-danio;
  }

  public void recibirVida(int vidaExtra){
    vida = vida + vidaExtra;
  }

  public int getvida(){return(this.vida);}
  public String getnom(){return(this.nombre);}
  
  public void setVida(int vida){
    this.vida = vida;
  }
}