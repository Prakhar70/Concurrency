package UnderstandingConcurrency.ConcurencyIsDifferent;

import java.util.Scanner;

class Lec001{
    public static void main(String[] args) {
        int[] arr={1,43,4,213,2,4,144};
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(name);
    }
}