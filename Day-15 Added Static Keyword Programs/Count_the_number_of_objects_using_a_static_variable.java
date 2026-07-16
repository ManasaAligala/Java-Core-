public class Count_the_number_of_objects_using_a_static_variable {
    static int var = 0;
    Count_the_number_of_objects_using_a_static_variable(){
            var++;
    }
    public static void main(String args[]){
        for(int i=0;i<5;i++){
        Count_the_number_of_objects_using_a_static_variable obj = new Count_the_number_of_objects_using_a_static_variable();
        
        }

    
        System.out.println(var);
    }

    
}
