interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}
class SmartPhone implements Camera, MusicPlayer{

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println("Music player plays a song");
        
    }

    @Override
    public void takePhoto() {
        // TODO Auto-generated method stub
        System.out.println("Camera takes photos");
      
    }

}
public class MultipleInterfaces {
    public static void main(String args[]){
        SmartPhone s = new SmartPhone();
        s.playMusic();
        s.takePhoto();
    }
    
}
