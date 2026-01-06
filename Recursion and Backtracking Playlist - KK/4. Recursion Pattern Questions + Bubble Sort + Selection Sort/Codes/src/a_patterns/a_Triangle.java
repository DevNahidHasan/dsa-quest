/*
Triangle -
****
***
**
*

Triangle 2-
*
**
***
****


 */

package a_patterns;

public class a_Triangle {

    public static void main(String[] args) {
        triangle(4,0);
        System.out.println();
        triangle2(4,1,0);
    }

    static void triangle(int r, int c){
        if (r == 0){
            return;
        }
        if(r > c){
            System.out.print("*");
            triangle(r,c+1);
        }else {
            System.out.println();
            triangle(r-1,0);

        }
    }

    static void triangle2(int n, int r, int c){
        if (r == n+1){
            return;
        }
        if(r > c){

            System.out.print("*");
            triangle2(n,r,c+1);
        }else {

            System.out.println();
            triangle2(n,r+1,0);
        }
    }

}
