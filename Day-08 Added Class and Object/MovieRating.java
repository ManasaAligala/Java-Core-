import java.util.Scanner;
public class MovieRating {
    String movie_name;
    int rating;

    public MovieRating(String movie_name,int rating) {
        this.movie_name = movie_name;
        this.rating= rating;
    }
    void displayrating(){
        if(rating == 5){
            System.out.println("**Hit**");
        }else if(rating>=4 && rating<5){
            System.out.println("OKOK");
        }else{
            System.out.println("Flop");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movie_name = sc.nextLine();
        System.out.print("Give Rating: ");
        int rating = sc.nextInt();
        MovieRating obj = new MovieRating(movie_name, rating);
        obj.displayrating();

    }
}
