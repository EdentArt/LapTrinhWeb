package vn.iotstar.services.impl;

import vn.iotstar.entity.Video;

public class VideoServices {
	List<Video> findAll();
    Video findById(int id);
    void insert(Video video);
    void update(Video video);
    void delete(int id);

}
