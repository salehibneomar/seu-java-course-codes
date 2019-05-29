    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        System.out.println("Even number print");
        for(int i=0; i<al.size(); i++){
            int j=al.get(i);
            if(j%2==0){
                System.out.println(al.get(i));
            }
        }
        
        System.out.println("Odd number print");
        for(int i=0; i<al.size(); i++){
            int j=al.get(i);
            if(j%2!=0){
                System.out.println(al.get(i));
            }
        }
       
    }