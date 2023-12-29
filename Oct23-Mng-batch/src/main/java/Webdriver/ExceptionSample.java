package Webdriver;

public class ExceptionSample {

    public static void main(String args[]){

      try {
          int a[] = new int[3];

          a[0] = 20;
          a[1] = 30;
          a[2] = 40;
        //  a[3] = 50;

          for (int i : a) {

              System.out.println(i);

          }
      }
      catch (Exception e){
          System.out.println(e);
      }

      finally {
          System.out.println("Executes at all point of time");
      }


    }
}
