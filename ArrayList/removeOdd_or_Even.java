    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        //Remove Odd or Even Number
        for(int i=0; i<al.size(); i++){
            int j=al.get(i);
            if(j%2!=0){
                al.remove(i);
                i=-1;
            }
        }
        
        System.out.println(al);
       
    }