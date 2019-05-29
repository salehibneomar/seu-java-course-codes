
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array size:");
       int n = sc.nextInt();
       int arr[] = new int[n];
       
        System.out.println("Enter array values:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[n-1];
        int diff = max-min;
        System.out.println("Difference between max and min values from an array");
        System.out.println(diff);
       
    }