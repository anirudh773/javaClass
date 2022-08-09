public class bubbleSort {
     public static void main(String[] args) {
            int arr[] ={1,7,9,5,8,2};
            for(int i=0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1;j++){
                    if(arr[j]>arr[j+i]){
                        int temp = arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;

                    }
                }
            }
            for(int i=0; i<arr.length;i++);
            for(int i;arr){
                System.out.println(i+"");

            }

            }
        }
    
