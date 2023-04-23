public class AllPattern {
    public static void main(String[] args) {
        pattern(3);
          
}   
    

/*
Pattern 1(Rectangle)
    ****
    ****
    ****
    ****
    **** 
    
    */
    public static void pattern1(int r, int c)
     {

        for (int row = 1; row <= r; row++) {
            for (int col = 1; col <=c; col++) {
                    System.out.print("*");  
            }
            System.out.println();
        }
    }



/*
Pattern 2(Hollow Rectangle)
    ****
    *  *
    *  *
    *  *
    **** 
    
    */
    public static void pattern2(int r, int c)
     {

        for (int row = 1; row <= r; row++) {
            for (int col = 1; col <=c; col++) {
                if (row==1 || row==r || col==1 || col==c){
                    System.out.print("*");  
                }
                else {
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }



    /*
 Pattern 3
        *
       **
      ***
     ****
    *****
    
    */
    public static void pattern3(int n){

        for (int row = 1; row <= n; row++) {
            //this loop is for space 
            for (int col =1 ; col <=n-row; col++) {
                System.out.print(" ");  
            }
           // this loop is for star
            for (int col = n-row+1; col <=n; col++) {
                    System.out.print("*");  
                }
                System.out.println();
        }
            
    }

     /*
 Pattern 4
        *
        **
        ***
        ****
        *****
    
    */
    public static void pattern4(int n){

        for (int row = 1; row <= n; row++) {
           // this loop is for star
            for (int col = n-row+1; col <=n; col++) {
                    System.out.print("*");  
                }
             //this loop is for space 
            for (int col =1 ; col <=n-row; col++) {
                System.out.print(" ");  
            }    
                System.out.println();
        }
            
    }


     /*
 Pattern 5
             *****
             ****
             ***
             **
             *
    
    */
    public static void pattern5(int n){

        for (int row = 1; row <= n; row++) {
           // this loop is for star
            for (int col =1; col <=n-row+1; col++) {
                    System.out.print("*");  
                }
            //  //this loop is for space 
            // for (int col =1 ; col <=n-row; col++) {
            //     System.out.print(" ");  
            // }    
                System.out.println();
        }
            
    }

     /*
 Pattern 6
             12345
             1234
             123
             12
             1
    
    */
    public static void pattern6(int n){

        for (int row = 1; row <= n; row++) {
           // this loop is for star
           int num=1;
            for (int col =1; col <=n-row+1; col++) {
                    System.out.print(num);
                    num++;  
                }   
                System.out.println();
        }
            
    }

     /*
 Pattern 7
             ABCDE
             FGHI
             JKL
             MN
             O
    
    */
    public static void pattern7(int n){
        char ch='A';
        for (int row = 1; row <= n; row++) {
           // this loop is for star
            for (int col =1; col <=n-row+1; col++) {
                    System.out.print(ch);
                    ch++;  
                }   
                System.out.println();
        }
            
    }

     /*
 Pattern 8
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15 
    
    */
    public static void pattern8(int n){
           int num=1;
        for (int row = 1; row <= n; row++) {
           // this loop is for star
            for (int col = n-row+1; col <=n; col++) {
                    System.out.print(num +" ");  
                    num++;
                }
            //  //this loop is for space 
            // for (int col =1 ; col <=n-row; col++) {
            //     System.out.print(" ");  
            // }    
                System.out.println();
        }
            
    }

     /*
 Pattern 9(0-1 triangle)
       1 
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1
    
    */
    public static void pattern9(int n){
     for (int row = 1; row <= n; row++) {
        // this loop is for star
         for (int col = 1; col <=row; col++) {
             // jaha per row+col even hai waha per 1 print karo
             int sum = row +col;
             if (sum%2==0){
                System.out.print("1 ");  
             }
             else{
                System.out.print("0 ");
             }
                 
             }
         //  //this loop is for space 
         // for (int col =1 ; col <=n-row; col++) {
         //     System.out.print(" ");  
         // }    
             System.out.println();
     }
         
 }

 /*
 Pattern 10
        *
        **
        ***
        ****
        *****
        *****
        ****
        ***
        **
        *
    
    */
    public static void pattern10(int n){
      // for first half
        for (int row = 1; row <= n/2; row++) {
           // this loop is for star
            for (int col =1; col <= row; col++) {
                    System.out.print("*");  
                }  
            for (int col =row+1; col <= n/2; col++) {
                    System.out.print(" ");  
                }
                System.out.println();
        }
       // for second half
        for (int row = n/2 +1; row <= n; row++) {
            // this loop is for star
             for (int col =1; col <=n-row+1; col++) {
                     System.out.print("*");  
                 }   
                 System.out.println();
         }
            
    }

    /*
 Pattern 11
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
    
    */
    public static void pattern11(int n){
        // for first half
          for (int row = 1; row <= n; row++) {
             // this loop is for star
              for (int col =1; col <= row; col++) {
                      System.out.print("*");  
                  } 

             // space 2*(n-row)     
              for (int col =1; col <= 2*(n-row); col++) {
                      System.out.print(" ");  
                  }

              // this loop is for star
              for (int col =1; col <= row; col++) {
                System.out.print("*");  
            }     
                  System.out.println();
          }
         // for second half
          for (int row = n; row >=1; row--) {

              // this loop is for star
              for (int col =1; col <= row; col++) {
                System.out.print("*");  
            } 

             // space 2*(n-row)     
            for (int col =1; col <= 2*(n-row); col++) {
                System.out.print(" ");  
            }

            // this loop is for star
            for (int col =1; col <= row; col++) {
            System.out.print("*");  
            }     
               System.out.println();
           }
              
      }


      /*
 Pattern 12(Rhombhus)
    *****
   *****
  *****
 *****
*****
    
    */
    public static void pattern12(int n){
       
          for (int row = 1; row <= n; row++) {
             // this loop is for space
              for (int col =1; col <= n-row; col++) {
                      System.out.print(" ");  
                  } 

             // for star    
              for (int col =1; col <= n; col++) {
                      System.out.print("*");  
                  }
    
                  System.out.println();
          }
        }

     /*
 Pattern 13(Hollow Rhombhus)
    *****
   *   *
  *   *
 *   *
*****
    
    */
    public static void pattern13(int n){
       
        for (int row = 1; row <= n; row++) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= n; col++) {
                if (row==1 || row==n || col==1 || col==n){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }
                }
  
                System.out.println();
        }
      }

      /*
      Pattern 14(Diamond)
                 *    
                ***
               *****
              *******
             *********
             *********
              *******
               *****
                ***
                 *
    
    */
    public static void pattern14(int n){
       // 1 half
        for (int row = 1; row <= n; row++) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                    System.out.print("*");
                }    
                System.out.println();
        }

        // 2 half
        for (int row =n; row >=1; row--) {
            // this loop is for space
             for (int col =1; col <= n-row; col++) {
                     System.out.print(" ");  
                 } 
 
            // for star    
             for (int col =1; col <= 2*row-1; col++) {
                     System.out.print("*");
                 }

                 System.out.println();
         }
      }

      /*
      Pattern 15
                  *
                 ***
                *****
               *******
            
    
    */
    public static void pattern15(int n){
         for (int row = 1; row <= n; row++) {
            // this loop is for space
             for (int col =1; col <= n-row; col++) {
                     System.out.print(" ");  
                 } 
 
            // for star    
             for (int col =1; col <= 2*row-1; col++) {
                     System.out.print("*");
                 }    
                 System.out.println();
         }
 
       }

       /*
      Pattern 16
                  *******
                   *****
                    ***
                     *
    
    */
    public static void pattern16(int n){
        for (int row = n; row >=1; row--) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                    System.out.print("*");
                }    
                System.out.println();
        }

      }

      /*
      Pattern 17
                    * 
                   * *
                  * * *
                 * * * *
                * * * * *
        
    
    */

    public static void pattern17(int N){

         
        for (int row=1; row<=N; row++)   
                {  
                //inner loop work for space      
                for (int col=N-1; col>=row; col--)   
                {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns  
                for (int col=1; col<=row; col++ )   
                {   
                //prints star      
                System.out.print("* ");   
                }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }  
            
    }
  /*
  Pattern 18
  
   * * * * * 
    * * * * 
     * * * 
      * * 
       * 

  */
    public static void pattern18(int N){

        for (int row=N; row>=1; row--)   
                {  
                //inner loop work for space      
                for (int col=N-1; col>=row; col--) {    
                  System.out.print(" ");   
                }   
                //inner loop for stars 
                for (int col=1; col<=row; col++ )   
                {        
                System.out.print("* ");   
                }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }     
    }


     /*
  Pattern 19
  
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * *

  */

  public static void pattern19(int N){

    for (int row=N; row>=1; row--)   
            {  
            //inner loop work for space      
            for (int col=N-1; col>=row; col--) {    
              System.out.print(" ");   
            }   
            //inner loop for stars 
            for (int col=1; col<=row; col++ )   
            {        
            System.out.print("* ");   
            }   
    //throws the cursor in a new line after printing each line  
    System.out.println();   
    } 
    
    for (int row=1; row<=N; row++)   
                {  
                //inner loop work for space      
                for (int col=N-1; col>=row; col--)   
                {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns  
                for (int col=1; col<=row; col++ )   
                {   
                //prints star      
                System.out.print("* ");   
                }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }  
        
}

  /*
      Pattern 20
                *
               * *
              *   *
             *     *
            *********
    
    */
    public static void pattern20(int n){
        for (int row = 1; row <=n; row++) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 || row==n ||col==1 || col==2*row-1){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }

                }    
                System.out.println();
        }

      }


      /*
      Pattern 21
            *********
             *     *
              *   *
               * *
                *
    
    */
    public static void pattern21(int n){
        for (int row = n; row >=1; row--) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 || row==n ||col==1 || col==2*row-1){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }

                }    
                System.out.println();
        }

      }


      /*
      Pattern 22
           
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
    
    */
    public static void pattern22(int n){
        for (int row = 1; row <=n; row++) {
            // this loop is for space
             for (int col =1; col <= n-row; col++) {
                     System.out.print(" ");  
                 } 
 
            // for star    
             for (int col =1; col <= 2*row-1; col++) {
                 if (row==1 ||col==1 || col==2*row-1){
                     System.out.print("*");  
                 }  
                 else {
                     System.out.print(" ");
                 }
 
                 }    
                 System.out.println();
         }
        for (int row = n; row >=1; row--) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 ||col==1 || col==2*row-1){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }

                }    
                System.out.println();
        }

      }


      /*
      Pattern 23
                      1 
                     1 1 
                    1 2 1 
                   1 3 3 1 
                  1 4 6 4 1 
        
    
    */

    public static void pattern23(int N){

         
        for (int row=0; row<N; row++)   
                {  
                //inner loop work for space      
                for (int col=1; col<N-row; col++)   
                {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns 
                int num=1; 
                for (int col=0; col<=row; col++ )   
                {   
                //prints star      
                System.out.print(num +" ");
                num= num* (row-col)/(col+1)  ; 
                }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }  
      
            
    }



     /*
      Pattern 24
           
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
    
    */
    public static void pattern24(int n){
        
            for (int row = 1; row <= 2 * n; row++) {
    
                int c = row > n ? 2 * n - row: row;
    
                for (int space = 0; space < n-c; space++) {
                    System.out.print("  ");
                }
    
                for (int col = c; col >= 1; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= c; col++) {
                    System.out.print(col + " ");
                }
    
                System.out.println();
            }
        }
      
  


         /*
      Pattern 25
           
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *
    
    */
    public static void pattern25(int n){
        for (int row = 1; row <=n; row++) {
            // this loop is for space
             for (int col =1; col <= n-row; col++) {
                     System.out.print("*");  
                 } 
 
            // for star    
             for (int col =1; col <= 2*row-1; col++) {
                 if (row==1 ||col==1 || col==2*row-1){
                     System.out.print("*");  
                 }  
                 else {
                     System.out.print(" ");
                 }
                 }  
                for (int col =1; col <= n-row; col++) {
                    System.out.print("*");  
                }   
                 System.out.println();
         }
        for (int row = n; row >=1; row--) {
           
            for (int col =1; col <= n-row; col++) {
                    System.out.print("*");  
                } 

           // for space    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 ||col==1 || col==2*row-1){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }

                } 
                
                for (int col =1; col <= n-row; col++) {
                    System.out.print("*");  
                } 
                System.out.println();
        }

      }


      /*
      Pattern 26
             *       *
            * *     * *
           *   *   *   *
          *     * *     *
         *       *       *
    
    */
    public static void pattern26(int n){
        for (int row = 1; row <=n; row++) {
           // this loop is for space
            for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 ||col==1 ||  col==2*row-1 ){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }
                }
                for (int col =1; col <= n-row; col++) {
                    System.out.print(" ");  
                } 

            // this loop is for space
            for (int col =1; col < n-row; col++) {
                System.out.print(" ");  
            }     

           // for star    
            for (int col =1; col <= 2*row-1; col++) {
                if (row==1 ||col==1 || col==2*row-1){
                    if (row==n & col==1){
                        System.out.print("");
                    }
                    else  {
                    System.out.print("*");  
                    }
                }  
                else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }

      }

      /*
 Pattern 27
        *        *
        **      **
        * *    * *
        *  *  *  *
        *   **   *
        *   **   *
        *  *  *  *
        * *    * *
        **      **
        *        *
    
    */
    public static void pattern27(int n){
        //here n is half of row
        // for first half
          for (int row = 1; row <= n; row++) {
             // this loop is for star
              for (int col =1; col <= row; col++) {
                if (row==1 ||col==1 || col==row){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }  
                  } 

             // space 2*(n-row)     
              for (int col =1; col <= 2*(n-row); col++) {
                      System.out.print(" ");  
                  }

              // this loop is for star
              for (int col =1; col <= row; col++) {
                if (row==1 ||col==1 || col==row){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                } 
            }     
                  System.out.println();
          }
         // for second half
          for (int row = n; row >=1; row--) {

              // this loop is for star
              for (int col =1; col <= row; col++) {
                if (row==1 ||col==1 || col==row){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }  
            } 

             // space 2*(n-row)     
            for (int col =1; col <= 2*(n-row); col++) {
                System.out.print(" ");  
            }

            // this loop is for star
            for (int col =1; col <= row; col++) {
                if (row==1 ||col==1 || col==row){
                    System.out.print("*");  
                }  
                else {
                    System.out.print(" ");
                }
            }     
               System.out.println();
           }
              
      }

     /*
      Pattern 28
                    ********
                     ******
                      ****
                       **
        
    
    */

    public static void pattern28(int N){

         
        for (int row=N; row>=1; row--)   
                {  
                //inner loop work for space      
                for (int col=1; col<=N-row; col++)   
                {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns 
                for (int col=1; col<=2*row; col++ )   
                {   
                    
                System.out.print("*");
                
                }   
        //throws the cursor in a new line after printing each line  
        System.out.println();   
        }  
      
            
    }
      
/*
      Pattern 29
                   1 2 3 10 11 12 
                     4 5 8 9
                       6 7
        
    
    */

    public static void pattern(int n){
        int firsthalf = 1;
		int secondhalf = (n* n) + 1;
        int numOfSpaces = 0;
        for (int row=n; row>=1; row--)   
                {  
                    
            // this loop is for star
            for (int col = numOfSpaces;col >= 1;col--) {
                System.out.print(" ");  
               }
            //this loop is for star 
            for (int col =1 ; col <=row; col++) {
                System.out.print(firsthalf++ +" ");
              }  


              for (int col =1 ; col <=row; col++) {
                System.out.print(secondhalf++ +" ");  
              }
              System.out.println();   
              numOfSpaces += 2;
        
                // Calculates the first number of the second half for the next iteration/line
			     secondhalf= (secondhalf - 1) - ((row - 1) * 2);
                 
            }  
    }
    /*  
    Pattern 30
    
         
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

    */


    static void pattern30(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}



