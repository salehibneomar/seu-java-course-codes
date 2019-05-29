    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        val = sc.nextInt();
        for(int i=0; i<al.size(); i++){
            if(al.get(i).equals(val)){
                al.remove(i);
                i=-1;
            }
        }
        
        System.out.println(al);
       
    }