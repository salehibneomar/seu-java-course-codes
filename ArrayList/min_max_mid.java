    public static void main(String[] args) {
        //Generic
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int val;
        for(int i=0; i<5; i++){
            val = sc.nextInt();
            al.add(val);
        }
        
        Collections.sort(al);
        
        System.out.println("Min = "+al.get(0));
        System.out.println("Max = "+al.get(al.size()-1));
        System.out.println("Mid = "+al.get(al.size()/2));
       
    }