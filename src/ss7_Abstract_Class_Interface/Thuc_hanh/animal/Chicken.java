package ss7_Abstract_Class_Interface.Thuc_hanh.animal;

public class Chicken extends Animal implements Edible{
    public String makeSound(){
        return "Chicken: ò ó o ";
    }
    public String howToEat(){
        return "could be fried";
    }
}

