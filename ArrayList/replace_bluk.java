
    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        //Replace values (bluk) odd or even > or < same method can be applied
        for(int i=0; i<al.size(); i++){
            int j=al.get(i);
            if(j%2!=0){
                val = sc.nextInt();
                al.set(i, val);
            }
        }
        
        System.out.println(al);
       
    }