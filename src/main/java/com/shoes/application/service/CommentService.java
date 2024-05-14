package com.shoes.application.service;

import com.shoes.application.entity.Comment;
import com.shoes.application.model.request.CreateCommentPostRequest;
import com.shoes.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
