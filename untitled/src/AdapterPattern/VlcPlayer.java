package AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename){
        System.out.println("Playing VLC file. Name: " + filename);
    }
    @Override
    public void playMp4(String filename){}//什么也不做
}
