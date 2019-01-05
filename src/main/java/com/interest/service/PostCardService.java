package com.interest.service;

import com.interest.model.PostCardEntity;
import com.interest.model.view.PostCardModel;

import java.util.List;

public interface PostCardService {//PostCardService层的接口

	public List<PostCardModel> postcardList(String interestid, int pageSize, int start);

	public Integer postcardSize(String interestid, int pageSize, int start);

	public void insertEntity(PostCardEntity postCardEntity);

	public PostCardModel getPostcard(int id);

	public void deletePostcards(List<String> groupId);

}
