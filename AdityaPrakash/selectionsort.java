public class selectionsort {
    public static void main(String args[]) {

        int arr[]={3,4,2,8,1};
        int small, temp;

        for(int i=0; i<arr.length; i++)
        {
            small=i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        
    }
    
}
