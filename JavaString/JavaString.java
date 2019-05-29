
package javastring;

public class JavaString {

    public static void main(String[] args) {
        
        
        String str[]={"Saleh", "Abc", "Cbc", "Bdc"};
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println("");
        for(int i=0; i<str.length-1; i++){
            
            for(int j=0; j<str.length-i-1; j++){
                if(str[j+1].compareTo(str[j])<0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp; 
                }
            }
        }
        
        for(int i=0; i<str.length; i++){
            System.out.println(str[i]);
        }
        
        String s3[] = {"CSE1201", "CSE1201", "ENG1001", "CSE1200"};
        for(int i=0; i<s3.length; i++){
            if(s3[i].startsWith("CSE") && s3[i].endsWith("0")){
                System.out.println(s3[i]);
            }
        }
        
        String l = "Heollo";
        String o = "EW";
        System.out.println(l.lastIndexOf("o"));
        System.out.println(l.concat(o));
        System.out.println(l.substring(1,3));
        String Str = new String("Welcoome to Tutorialspoint.com");
      System.out.print("Found Last Index :" );
      System.out.println(Str.lastIndexOf( 'o', 5 ));
      
        System.out.println(l.replace("H", "KKK"));
        
        String stt = "Hello world me";
        String sty[] = stt.split(" ");
        for(String b:sty){
            System.out.println(b);
        }
        
        System.out.println(stt.toLowerCase());
        System.out.println(stt.toUpperCase());
        
        StringBuffer sb = new StringBuffer("KKKKKK");
        sb.replace(0, 2, "LL");
        
        System.out.println(sb.substring(0, 3));
         System.out.println(sb.capacity());
         sb.setLength(2);
         System.out.println(sb);
         char ch='A';
         sb.setCharAt(1, 'A');
         System.out.println(sb);
        
         A obj = new A();
         try{
             obj.kk(1);
         }
         catch(Exception e){
             System.out.println(e);
         }
         
         try{
             obj.pp();
         }
         catch(ArithmeticException e){
             System.out.println(e);
         }
    }
    
}
