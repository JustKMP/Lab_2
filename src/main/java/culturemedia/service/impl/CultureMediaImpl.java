package culturemedia.service.impl;

import java.util.List;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewRepository;
import culturemedia.service.CultureMediaService;

public class CultureMediaImpl implements CultureMediaService {

    private VideoRepository videoRepository;
    private ViewRepository viewRepository;

    public CultureMediaImpl(VideoRepository videoRepository, ViewRepository viewRepository){
        this.videoRepository = videoRepository;
        this.viewRepository = viewRepository;
    }

    @Override
    public List<Video> findAllVideos() {
        List<Video> videos = videoRepository.findAll();
        return videos;
    }

    @Override
    public Video add(Video video) {
        Video videoAdd = videoRepository.save(video);
        return videoAdd;
    }

    @Override
    public View add(View view) {
        View viewAdd = viewRepository.add(view);
        return viewAdd;
    }

}
