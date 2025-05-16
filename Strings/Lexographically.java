package Strings;
//largest string lexographically(like dictionary)
public class Lexographically {
    public static void main(String[] args) {
        String arr[] = {"apple","mango","banana"};
        String largest = arr[0];
        for (int i =1;i<arr.length;i++){
            if(largest.compareTo(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
