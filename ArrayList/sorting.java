    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        //Sort in ASC
        Collections.sort(al);
        
        System.out.println(al);
        
        //Sort in DESC
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
       
    }