package com.goit.online.mod5;

import javax.naming.NameAlreadyBoundException;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

/**
 * Created by pc on 06.06.2016.
 */
public class SortArray {


    public static void main(String[] args)  {
Scanner sc=new Scanner(System.in);

        int arr[];
        try {
            System.out.println("VVedite chislo: ");
          arr =new int[sc.nextInt()];


        }

        catch (RuntimeException e){
            System.out.println("Eshe ot ");
             arr=new int[sc.nextInt()];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.printf(Arrays.toString(arr));

    }





    public  static void sortArray(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int min_i=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    min_i=j;
                }
            }
            if(i !=min_i){
                int tmp=arr[i];
                arr[i]=arr[min_i];
                arr[min_i]=tmp;
            }
        }



    }
    public  static String maxMin(int []a){
        int min=a[0];

        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];

            }if(max<a[i]){
                max=a[i];
            }
        }
        return "Max number is "+max+" Min number is "+min;

    }

}
