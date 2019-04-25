package com.kgisl.qs1;

class RemoveElement{
       public static void main(String[] args) {
        int arr[] =new int[]{1,22,1,23,11,22};
System.out.println("Duplicate ArrayList:");
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
        if(arr[i] == arr[j])  
        System.out.println(arr[j]);  
    }

}
    }
}