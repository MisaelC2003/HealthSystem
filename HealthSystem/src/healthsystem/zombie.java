package healthsystem;
class zombie {
  //atributos
  private String nombre;
  private int vida = 50;
  private int danioRasgunio = 10;
  private int recibirdanio = 20;

  public zombie(String nom, int vidaZ, int danioZ){
    this.nombre = nom;
    this.vida = vidaZ;
    this.danioRasgunio = danioZ;
  }

  public void recibirdanio(int danio){
    vida = vida-danio;
  }

  public int ataque(){
    return(10);
  }

  public int getvida(){return(this.vida);}
}