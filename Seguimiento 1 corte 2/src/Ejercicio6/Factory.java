package Ejercicio6;

    public interface Factory {
        void hasLegs();
        void sitOn();
    }

    abstract class Chairs implements Factory{

    }
    abstract class Sofas implements Factory{
    }
    abstract class Tables implements Factory{

    }

    abstract class VictorianC extends Chairs{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }

    abstract class ModernC extends Chairs{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }
    abstract class ArtDecoC extends Chairs {
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("Yes :)");
        }
    }

    abstract class VictorianS extends Sofas{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }

    abstract class ModernS extends Sofas{
        public void hasLegs(){
            System.out.println("No :(");
        }
        public void sitOn(){
            System.out.println("Yes :)");
        }
    }
    abstract class ArtDecoS extends Sofas {
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("Yes :)");
        }
    }

    abstract class VictorianT extends Tables{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println();
        }
    }

    abstract class ModernT extends Tables{
        public void hasLegs(){
            System.out.println("Yes :)");
        }
        public void sitOn(){
            System.out.println("No :(");
        }
    }
    abstract class ArtDecoT extends Tables {
        public void hasLegs() {
            System.out.println("No :(");
        }

        public void sitOn() {
            System.out.println("No :(");
        }
    }

   class Main {
       public static void main(String[] args) {
           ArtDecoC adt = new ArtDecoC(){};
           System.out.println("Art Deco Style selected");
           System.out.println("You choosed table");
           System.out.println("The product has legs?");
           adt.hasLegs();
           System.out.println("Can you sit in that?");
           adt.sitOn();
       }
   }


