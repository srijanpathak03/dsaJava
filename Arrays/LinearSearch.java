package Arrays;
// import java.util.*;

public class LinearSearch {
    public static int Lsearch(int n){
        //int marks[] = new int[]
        int marks[]={1,2,3,4,5,6,7,8,9};
        for(int i =0 ; i<= marks.length;i++ ){
            if(marks[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        if(Lsearch(4)==-1){
            System.out.println("NOt Found");
        }
        else{
            System.out.println("At index "+Lsearch(4));
        }
}
}