public class linear{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            } 
        }
            System.out.println(key+ "key is not in the array");    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 60;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}