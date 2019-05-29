    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter row for m1:");
       int row1 = sc.nextInt();
       System.out.println("Enter col for m1:");
       int col1 = sc.nextInt();
       System.out.println("Enter row for m2:");
       int row2 = sc.nextInt();
       System.out.println("Enter col for m2:");
       int col2 = sc.nextInt();
       int m1[][] = new int[row1][col1];
       int m2[][] = new int[row2][col2];
       
       if(col1 == row2){
            System.out.println("Enter values for m1:");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter values for m2:");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    m2[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix 1:");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                   System.out.print(m1[i][j]+" ");
                }
                System.out.println("");
            }

            System.out.println("Matrix 2:");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                   System.out.print(m2[i][j]+" ");
                }
                System.out.println("");
            }
            
            int multi[][] = new int[row1][col2];
            int temp;
            
            System.out.println("Multiplied result");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                   temp = 0;
                   for(int n=0; n<row2; n++){
                       temp = temp+(m1[i][n]*m2[n][j]);
                   }
                   multi[i][j] = temp;
                   System.out.print(multi[i][j]+" ");
                }
                System.out.println("");
            }
           
       }
       else{
           System.out.println("Matrix multi not possible");
       }
        
    }