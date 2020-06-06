package by.amintas.learning;

public class Driver {
    private IAvto avto;

    public Driver(IAvto avto) {
        this.avto = avto;
    }

    public void changeAvto(){
    System.out.println("Водитель выбрал "+ avto.getAvto());
    }
}
