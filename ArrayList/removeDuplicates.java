    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        Set <Integer> i = new HashSet<Integer>(al);
        al.clear();
        al.addAll(i);
        
        
        System.out.println(al);
       
    }