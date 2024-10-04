package com.streamFlix.app.Service;

import java.nio.file.Path;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.streamFlix.app.entities.Video;

public interface VideoService {
	Video save(Video video, MultipartFile file);
	
	Video get(String videoId);
	
	Video getByTitle(String title);
	
	List<Video> getAll();
	
	//video processing
	String processVideo(String videoId);

}
