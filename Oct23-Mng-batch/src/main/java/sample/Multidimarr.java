package sample;

public class Multidimarr {

    public static void main(String args[]){



        int arr[][] = {
                {10,20,30},
                {20,30,40},
                {60,70,80}
        };



        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }


    }
}
