public class removespecial {
    public static String reveString(String str){
       String rs =new StringBuilder(str).reverse().toString().trim();
       return rs;
    }
    public static void main(String[] args) {
      String str = " Hello!&^012$ ";
      String clean = str .replaceAll("[^zA-Za-z0-1]" ,"");
        System.out.println(clean);

        // String reverse = reveString(str);
        System.out.println(reveString(str));
    }
   

    
}
