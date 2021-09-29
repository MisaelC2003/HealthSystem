package healthsystem;

class Jugador {
  //atributos
  private String nombre;
  private int vida = 100;
  private int danioGolpe;

  //metodos
  public Jugador(String nom, int daGolpe){
    nombre = nom;
    danioGolpe = daGolpe;
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

  //Get y Set
  public int getVida(){return vida;}
  public void setVida(int vida){ this.vida = vida;}
}