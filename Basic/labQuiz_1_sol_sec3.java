 //Find the sum of middle row and middle column value and 2D array must be of same size and and Odd numbers
 
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows:");
       int row = sc.nextInt();
       System.out.println("Enter cols:");
       int col = sc.nextInt();
       
       int arr[][] = new int[row][col];
       
       if((row%2!=0 && col%2!=0) && row==col){
           System.out.println("Enter array values:");
           for(int i=0; i<row; i++){
               for(int j=0; j<col; j++){
                   arr[i][j] = sc.nextInt();
               }
           }
           
           System.out.println("Here are the values:");
           for(int i=0; i<row; i++){
               for(int j=0; j<col; j++){
                   System.out.print(arr[i][j]+" ");
               }
               System.out.print("\n");
           }
           
           int mid = row/2;
           int rowSum = 0, colSum = 0;
           for(int i=0; i<row; i++){
               if(i == mid){
                   for(int j=0; j<col; j++){
                       rowSum += arr[i][j];
                   } 
               }
               for(int j=0; j<col; j++){
                   if(j == mid){
                       colSum += arr[i][j];
                   }
               } 
           }
           
           System.out.println("Row sum = "+rowSum+" Col sum = "+colSum);
           
       }
       else{
           System.out.println("Row and Col should be odd numbers and of same size");
       }
       
    }
    