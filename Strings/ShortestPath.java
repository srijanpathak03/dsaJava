package Strings;

public class ShortestPath {
    public static double shortestPath(String str){
        int x=0,y=0;
        for(int i= 0; i<str.length();i++){
            char s = str.charAt(i);
            if (s == 'E'){
                x++;
            }else if(s == 'W'){
                x--;
            }else if(s == 'N'){
                y++;
            }else if(s == 'S'){
                y--;
            }
        }
        int sum = x^2 + y^2;
        double d = Math.sqrt(sum);
        return d;
    }
    public static void main(String[] args) {
        String str ="WNEENESENNN";
        System.out.println(shortestPath(str));
    }
}
