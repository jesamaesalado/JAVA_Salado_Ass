abstract class Animal {
    
    String sound;
    String heigth;
    abstract void makeSound();
    abstract void Color();
    abstract void Gender();
    
    public void showSound(){
        System.out.println("Sound: "+ sound);
    }
    public void setSound(String sound){
       this.sound = sound;
    }
     public void showHeigth(){
        System.out.println("Heigth: "+ heigth);
    }
    public void setHeigth(String heigth){
       this.heigth = heigth;
    }
    
}
