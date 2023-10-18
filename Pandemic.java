 class Main {
     public static void main(String[] args) {
         System.out.println("Hello world!");
     }
 }
 interface IContaining {

        int strength = 75;

        int effectivity = 20;


    }


   interface ITransmission {

        int strength = 60;

        int effectivity = 20;

        boolean isDangerToPeople();
    }

    abstract class AbsPandemic implements IContaining {

        int strength;

        int effectivity;

        AbsPandemic(int strength, int effectivity) {
            this.strength = strength;
            this.effectivity = effectivity;
        }
    }


       class Virus implements ITransmission {

        int effectivity;

        int strength;

        boolean mutation;


        // Constructor
        Virus(int effectivity, int strength, boolean mutation) {
            this.effectivity = effectivity;
            this.strength = strength;
            this.mutation = mutation;

        }

        // Method
        public boolean isDangerToPeople() {
            if (this.effectivity > 10 && this.mutation == true && this.strength > 50) {
                return true;
            } else {
                return false;
            }
        }

    }

   class Antibodies extends AbsPandemic implements IContaining {

       int strength;

       int effectivity;

       boolean hasAntibodies;


       // Constructor
       Antibodies(int strength, int effectivity, boolean hasAntibodies) {
           super(strength, effectivity);
           this.strength = strength;
           this.effectivity = effectivity;
           this.hasAntibodies = hasAntibodies;
       }

       //Method
       public boolean goodAntibodies() {
           if (this.hasAntibodies == true && this.strength >= 50 && this.effectivity > 10) {
               return true;
           } else {
               return false;
           }
       }
   }


