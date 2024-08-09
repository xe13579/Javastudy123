package AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename){
    }//什么也不做
    @Override
    public void playMp4(String filename){
        System.out.println("Playing MP4 file. Name: " + filename);
    }
}
