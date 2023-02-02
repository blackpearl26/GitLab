public class Sorting{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp =0;
        for(int i = 0; i < n; i++){
            for(int j=1;j<(n-i);j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }


    }

    public static void main(String[] args){
        int[] arr = {20,30,10,40,80,50,60,90,70};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After sorting:");
        Sorting.bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }



    }
}