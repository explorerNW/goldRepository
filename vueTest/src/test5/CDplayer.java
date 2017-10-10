package test5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDplayer implements MediaPlayer {
                       private CompactDisk cd;
                       private MediaPlayer media;
                       @Autowired
                       public CDplayer(CompactDisk cd) {
                              this.cd = cd;       
                       }
	@Override
	public void play() {
                   media.play();
	}

}
