package car;

public class Main {

    public static void main(String[] args){
        Ford f1 = new Ford("Mustang" , 1968 , 45 , 150,500);
        Ford f2 = new Ford("f150" , 2019 , 70 , 300,600);
        Ford f3 = new Ford("focus" , 2010 , 40 , 200,400);
        Porsche t1 = new Porsche("X",2020,50,100,350);
        Porsche t2 = new Porsche("S",2021,55,250,500);
        System.out.println(Car.getCountCars());
    }
}
