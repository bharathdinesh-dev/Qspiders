public class pattern {
    public static void main(String[] args)throws Exception {

        /*-----------------------------------------HEART PATTERN -----------------------------------------
        int n = 10; 
      
        for (int i = n / 2; i <= n; i += 2) {
            
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            } Thread.sleep(100);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }Thread.sleep(100);
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }Thread.sleep(100);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }Thread.sleep(100);
            
            System.out.println();
            Thread.sleep(100);
        }
        Thread.sleep(100);   
        for (int i = n; i >= 1; i--) {

            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            Thread.sleep(100);
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            Thread.sleep(100);
        }
-----------------------------------------HEART PATTERN END-----------------------------------------*/
/* 
        int n=5;
        for (int i=0;i<n;i++){
            for(int j = 0 ;j<n;j++){
                if(true){
                    System.out.print("* ");
                }
                else{
                    System.out.println(" ");
                }
            }System.out.println();
        }

        /*
         $$$$$$$$$$$$$$output$$$$$$$$$$$$

                * * * * * 
                * * * * *
                * * * * * 
                * * * * *
                * * * * *

         $$$$$$$$$$$$$$output$$$$$$$$$$$$      
         
        int n=7;
        for (int i=0;i<n;i++){
            for(int j = 0 ;j<n;j++){
                if(i+j<n-1 || i>j ){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

        int height = 7; // Height of the letters
        int width = 5;  // Width of each letter

        // Printing the letter K
        for (int i = 0; i < height; i++) {
            // Printing the letter K
            for (int j = 0; j < width; j++) {
                if (j == 0 || // Left vertical line
                    (i == j + 1 && j > 0) || // Diagonal from top to middle
                    (i + j == height - 1 && i >= height / 2)) { // Diagonal from middle to bottom
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); // Space between letters


            // Printing the letter D
            for (int j = 0; j < width; j++) {
                if (j == 0 || // Left vertical line
                    (i == 0 && j < width - 1) || // Top horizontal line
                    (i == height - 1 && j < width - 1) || // Bottom horizontal line
                    (j == width - 1 && i > 0 && i < height - 1)) { // Right vertical line
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        System.out.println("*    *   ****");
        Thread.sleep(500);
        System.out.println("*   *    *    *");
        Thread.sleep(500);
        System.out.println("*  *     *     *");
        Thread.sleep(500);
        System.out.println("**       *     *");
        Thread.sleep(500);
        System.out.println("*  *     *     *");
        Thread.sleep(500);
        System.out.println("*   *    *    *");
        Thread.sleep(500);
        System.out.println("*    *   ****");
    }
}
