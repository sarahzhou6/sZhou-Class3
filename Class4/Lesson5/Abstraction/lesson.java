//4 basic oop concepts
//abstraction: hides the complexity of the data
    // avoids repetitive Code
    // gives flexibility to change implementation of abstract behavior
//encapsulation
//inheritance
//polymorphism

abstract class Animal {
  abstract void move (); //called abstract methods
  //every class that inherits from Animal must impliment these functions
  abstract void eat ();
  void label(){
    System.out.println("I'm an animal");
  }
}

class Bird extends Animal {
  //the extends tells you to use the same functions as Animal
  void eat(){
    System.out.println("Eat seeds");
  }
  void move(){
    System.out.println("Moves by flying");
  }
}

class Fish extends Animal {
  //the extends tells you to use the same functions as Animal
  void eat(){
    System.out.println("Eat seafood");
  }
  void move(){
    System.out.println("Moves by swimming");
  }
}
