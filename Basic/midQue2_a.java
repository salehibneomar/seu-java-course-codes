    public static void main(String[] args) {
       
        Integer x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        String y = x.toString();
        int min = y.charAt(0);
        int max = y.charAt(0);
        for(int i=0; i<y.length(); i++){
            if(y.charAt(i)<min){
                min = y.charAt(i);
            }
            if(y.charAt(i)>max){
                max = y.charAt(i);
            }
        }
        
        int dif = max-min;
        System.out.println(dif);
        
    }