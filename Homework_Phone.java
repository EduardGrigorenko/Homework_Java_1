package Homework_1;

public class Homework_Phone {
    class Phone{
      int number;
      String model;
      String weight;
      int getNumber;
      String receiveCall;

        public static void main(String[] args) {
            PhobeApple phobeApple = new PhobeApple();
            phobeApple.call();
            phobeApple.receiveCall();
            PhoneLG phoneLG = new PhoneLG();
            phoneLG.call();
            phoneLG.receiveCall();
            PhoneSony phoneSony = new PhoneSony();
            phoneSony.call();
            phoneSony.receiveCall();
            System.out.println(phoneLG +"Звонит (Edaward) " );
            System.out.println(5 + 5);
        }
    }
}
