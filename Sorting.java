import java.util.Scanner;

public class Sorting{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp =0;
        for(int i = 0; i < n-1; i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void insertionSort(int[] arr){
        int n = arr.length;
        System.out.println(n);
        
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {20,30,10,40,80,50,60,90,70};
        System.out.println("1.Bubble sort\n2.Insertion Sort\n3.Selection Sort");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1: Sorting.bubbleSort(arr);
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    break;
            case 2: Sorting.insertionSort(arr);
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    break;
            case 3: Sorting.selectionSort(arr);
                    for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                    }
                    break;
        }
        
       



    }
}