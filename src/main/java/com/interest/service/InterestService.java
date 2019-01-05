package com.interest.service;

import com.interest.model.InterestEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface InterestService {

	public List<InterestEntity> getInsterest(String title);

	public InterestEntity getInsterestById(int id);

    public String savePicture(MultipartFile picture);

	public void insertEntity(InterestEntity interestEntity);

	public void updateEntity(InterestEntity interestEntity);

	public List<InterestEntity> interestList(int pageSize, int start);

	public Integer interestSize();

	public void deleteInterests(List<String> groupId);

    public List<InterestEntity> getBanners();

	public void updateBanners(List<String> groupId, int i);
}
