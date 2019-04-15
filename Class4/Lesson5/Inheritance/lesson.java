class Bird {
  String reproduction = "eggs";
  String outerCovering = "feathers";
  public void flyUp(){
    System.out.println("Flying up");
  }
  public void flyDown(){
    System.out.println("Flying down");
  }
}

class Eagle extends Bird {
  String name = "Eagle";
  int life = 15;
  public void Chirp() {
    System.out.println("Kaw");
  }
}
