package com.interest.controller.template;

import com.interest.model.PageResult;
import com.interest.model.PostCardEntity;
import com.interest.model.view.PostCardModel;
import com.interest.service.PostCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostCardController {

	@Autowired
	private PostCardService postCardService;

	@GetMapping("/public/postcards")
	public PageResult postcardList(@RequestParam(value="interestid",required=false) String interestid,
                                   @RequestParam("pageSize") int pageSize, @RequestParam("page") int page) {
		PageResult pageResult = new PageResult();
		pageResult.setData(postCardService.postcardList(interestid, pageSize, page * pageSize));
		pageResult.setTotalCount(postCardService.postcardSize(interestid, pageSize, page * pageSize));
		return pageResult;
	}
	
	@GetMapping("/public/postcards/postcard")
	public PostCardModel postcardGet(@RequestParam("id") int id) {
		return postCardService.getPostcard(id);
	}
	
	@PostMapping("/postcards/postcard")
	public PostCardEntity insertEntity(@RequestBody PostCardEntity postCardEntity ) {//springboot自动注入到PostCardEntity的bean中
		postCardService.insertEntity(postCardEntity);
		return postCardEntity;
	}
	
	@DeleteMapping("/postcards")
	public List<String> deletePostcards(@RequestBody List<String> groupId) {
		postCardService.deletePostcards(groupId);
		return groupId;
	}

}
