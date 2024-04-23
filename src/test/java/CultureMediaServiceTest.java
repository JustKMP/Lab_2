import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import culturemedia.service.CultureMediaService;
import culturemedia.service.impl.CultureMediaImpl;
import culturemedia.repository.impl.*;
import culturemedia.repository.*;
import culturemedia.model.*;

public class CultureMediaServiceTest {

    private  CultureMediaService cultureMediaService;

    @BeforeEach
    void unit(){
        VideoRepository videoRepository = new VideoRepositoryImpl();
        ViewRepository viewRepository = new ViewRepositoryImpl();
        cultureMediaService = new CultureMediaImpl(videoRepository, viewRepository);

        List<Video> videos = List.of(new Video("01", "Títle 1", "HHH----", 4.5),
									 new Video("02", "Títle 2", "HHH----", 5.5),
									 new Video("03", "Títle 3", "HHH----", 4.4),
									 new Video("04", "Títle 4", "HHH----", 3.5),
									 new Video("05", "H 5", "HHH----", 5.7),
								     new Video("06", "H 6", "HHH----", 5.1));


		for ( Video video : videos ) {
			cultureMediaService.add( video );
		}

    }

    @Test
    void when_FindAll_all_videos_should_be_returned_successfully() {
        assert(false);
    }
    
    @Test
    void when_FindAll_does_not_find_any_video_an_VideoNotFoundException_should_be_thrown_successfully() {
        assert(false);
    }

    
}
