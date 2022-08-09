//import java.util.*;

public class bubblesort {
    public static void main(String args[]) {

        //Scanner sc=new Scanner(System.in);
        int temp;
        int arr[]={1,7,3,2,9};

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
