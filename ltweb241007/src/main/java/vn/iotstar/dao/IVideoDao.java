package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.entity.Video;

public interface IVideoDao {
	List<Video> findAll();
    Video findById(int id);
    void insert(Video video);
    void update(Video video);
    void delete(int id);
}
