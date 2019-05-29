public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        
        System.out.println("Enter array values:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            temp[i] = -1;
        }
        int counter = 1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] == arr[i]){
                    counter++;
                    temp[j] = 0;
                }
            }
            
            if(temp[i]!=0){
                temp[i] = counter;
            }
            
            counter = 1;
        }
        
        for(int i=0; i<n; i++){
             if(temp[i]!=0){
                System.out.println(arr[i]+" = "+temp[i]);
             }
        }
        
    }