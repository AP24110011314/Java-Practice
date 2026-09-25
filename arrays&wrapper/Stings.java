public class Stings {
    public static void main(String[] args){
        // //  String city=new String("Bangalore");
        // //  System.out.println("City : "+city);

        // //String Methods
        //  String name="Ammu";
        // //  System.out.println(name);
        // //  System.out.println("name.length() : "+name.length());
        // // System.out.println("name.toLowerCase() : "+name.toLowerCase());
        // // System.out.println("name.toUpperCase() : "+name.toUpperCase());
        // // System.out.println("name.charAt(2) : "+name.charAt(2));
        // // System.out.println("name.indexOf('m') : "+name.indexOf('m'));
        // // System.out.println("name.substring(1,3) : "+name.substring(1,3));
        // // System.out.println("name.replace('m','n') : "+name.replace('m','n'));
        // // System.out.println("name.equals(\"Ammu\") : "+name.equals("Ammu"));
        // // System.out.println("name.equalsIgnoreCase(\"ammu\") : "+name.equalsIgnoreCase("ammu"));
        // // System.out.println("name.trim() : "+name.trim());
        // // System.out.println("name.startsWith(\"Am\") : "+name.startsWith("Am"));
        // // System.out.println("name.endsWith(\"mu\") : "+name.endsWith("mu"));
        // // System.out.println("name.contains(\"mm\") : "+name.contains("mm"));
        // // System.out.println("name.isEmpty() : "+name.isEmpty());   
        // String name2="Ammu";
        // System.out.println("name==name2 : "+(name==name2));
        // System.out.println("name.equals(name2) : "+name.equals(name2));  

        // String Buffer and StringBuilder
        // String Buffer is synchronized and thread safe but StringBuilder is not synchronized and 
        // not thread safe. StringBuffer is slower than StringBuilder.

        // StringBuffer sb=new StringBuffer("Neha");
        // System.out.println("sb : "+sb);
        // sb.append(" is a good girl");
        // System.out.println("sb : "+sb);
        // sb.insert(4," likes pink");// it will insert the string at the specified index and 
        // // shift the existing characters to the right
        // System.out.println("sb : "+sb);
        // sb.replace(4, 6, " is a bad girl");  // it will replace the characters from index 4 to 6 with the specified string 
        // System.out.println("sb : "+sb);

        // String builder is faster than StringBuffer because it is not synchronized and not thread safe.
        StringBuilder sb1=new StringBuilder("Neha");
        System.out.println("sb1 : "+sb1);
        sb1.append(" is a good girl");
        System.out.println("sb1 : "+sb1);  
        sb1.delete(0, 1);// it will delete the characters from index 0 to 0  
        System.out.println("sb1 : "+sb1);
        sb1.reverse();// it will reverse the string
        System.out.println("sb1 : "+sb1);    



    }
}