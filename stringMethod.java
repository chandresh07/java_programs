

class stringMethod{
    public static void main(String [] args){


        String name = "Chandresh";

        String lname = name.toLowerCase();
        System.out.println(lname);

        String uname = name.toUpperCase();
        System.out.println(uname);

        int ln = name.length();
        System.out.println(ln);

        String trimed = "     Chandresh   ";
        String tr = trimed.trim();
        System .out.println(tr);

        System.out.println(name.substring(4));
        System.out.println(name.substring(2,8));

        System.out.println(name.replace('C','p'));
        System.out.println(name.replace("Chan","pand"));

        System.out.println(name.startsWith("ch"));
        System.out.println(name.endsWith("ch"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("han"));

        System.out.println(name.lastIndexOf("dr"));  // backward searching

        System.out.println(name.equals("Chandresh"));

        System.out.println(name.equalsIgnoreCase("chandresh"));

        
    }
}