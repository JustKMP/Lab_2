package culturemedia.service;

import culturemedia.model.*;
import java.util.List;


public interface CultureMediaService {
    List<Video> findAllVideos();
    Video add(Video video);
    View add(View view);
}
