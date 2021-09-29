package healthsystem;

class Healthsystem {
  public static void main(String[] args){
  Jugador Jprincipal = new Jugador("Misa",5);

  System.out.println("Sistema de Salud (Healthsystem)/n");

  Jprincipal.recibirDanio(10);
  System.out.println(">> El Zombie ataca a Jugador Principal.Jugador Principal tiene "+Jprincipal.getVida()+" de vida");
  }
}