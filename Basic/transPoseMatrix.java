public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter row:");
       int row = sc.nextInt();
       System.out.println("Enter col:");
       int col = sc.nextInt();

       int arr[][] = new int[row][col];
       
       System.out.println("Enter values:");
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               arr[i][j] = sc.nextInt();
           }
       }
       
       System.out.println("Matrix:");
       for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               System.out.print(arr[i][j]+" ");
           }
           System.out.println("");
       }
       
       if(row!=col){
           int temp = row;
           row = col;
           col = temp;
       }
       
       int t[][] = new int[row][col];
       System.out.println("Transpose Matrix:");
          for(int i=0; i<row; i++){
           for(int j=0; j<col; j++){
               t[i][j] = arr[j][i];
               System.out.print(t[i][j]+" ");
           }
           System.out.println("");
       }

    }