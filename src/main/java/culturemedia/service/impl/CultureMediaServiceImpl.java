package culturemedia.service.impl;

import java.util.List;

import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewRepository;
import culturemedia.service.CultureMediaService;
import culturemedia.exception.VideoNotFoundException;

public class CultureMediaServiceImpl implements CultureMediaService {

    private VideoRepository videoRepository;
    private ViewRepository viewRepository;

    public CultureMediaServiceImpl(VideoRepository videoRepository, ViewRepository viewRepository){
        this.videoRepository = videoRepository;
        this.viewRepository = viewRepository;
    }

    @Override
    public List<Video> findAllVideos() throws VideoNotFoundException{
        List<Video> videos = videoRepository.findAll();
        if (videos.isEmpty()){
            throw new VideoNotFoundException();
        }
        else {
            return videos;
        }
    }

    @Override
    public Video add(Video video) {
        Video videoAdd = videoRepository.save(video);
        return videoAdd;
    }

    @Override
    public View add(View view) {
        View viewAdd = viewRepository.save(view);
        return viewAdd;
    }

    @Override
    public List<Video> find(String title) throws VideoNotFoundException {
        List<Video> video = videoRepository.find(title);
        if(video.isEmpty()){
            throw new VideoNotFoundException();
        }
        else{
            return video;
        }
    }

    @Override
    public List<Video> find(double fromDuration, double toDuration) throws VideoNotFoundException {
        List<Video> video = videoRepository.find(fromDuration, toDuration);
        if(video.isEmpty()){
            throw new VideoNotFoundException();
        }
        else{
            return video;
        }
    }
}