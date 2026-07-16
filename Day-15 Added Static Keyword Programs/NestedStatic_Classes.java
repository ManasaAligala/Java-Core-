class NestedStatic_Classes{
    static class Outerclass extends NestedStatic_Classes{
        static String m = "manasa";
            static class Innerclass1 extends Outerclass{
                  static String s = "deepthi";
               
                }
            
            
        }
        public static void main(String args[]){
                System.out.println(Outerclass.Innerclass1.s);
                System.out.println(Outerclass.Innerclass1.m);
        }
}
    


    
