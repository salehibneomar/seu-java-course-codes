
    public static void main(String[] args) {
        
       //Non generic
       ArrayList al = new ArrayList();
       
       al.add("Saleh");
       al.add(10);
       al.add(5.2);
       al.add('A');
       al.add(20);
       
       System.out.println(al);

       al.remove(al.size()-1);
       System.out.println(al);
       
       al.set(1, 100);
       System.out.println(al);
       
       System.out.println(al.get(1));
       
       System.out.println(al.contains(10));
       System.out.println(al.contains(100));
       System.out.println(al.indexOf(100));
       al.set(2, 11);
       al.set(1, 10);
       al.set(3, 10);
       System.out.println(al.lastIndexOf(10));
       System.out.println(al.isEmpty());
       
       ArrayList al2 = (ArrayList) al.clone();
       System.out.println(al2);
       
       ArrayList al3 = new ArrayList();
       al3.addAll(al2);
       System.out.println(al3);
       
       al.clear();
       System.out.println(al);
       
       for(Object i:al2){
           System.out.println(i);
       }
        
    }