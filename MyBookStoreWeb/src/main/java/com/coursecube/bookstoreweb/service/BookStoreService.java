package com.coursecube.bookstoreweb.service;

import java.util.List;
import java.util.Map;

import com.coursecube.dto.BookDTO;
import com.coursecube.dto.BookInfoDTO;
import com.coursecube.dto.UserRatingDTO;

public interface BookStoreService {
	public List<String> getCategoryList();
	public List<String> getAuthorsList();
	public List<BookDTO> getMyBooks(String author, String category);
	public BookInfoDTO getBookInfoByBookId(Integer bookId);
	public BookDTO getBookByBookId(Integer bookId);
	public void placeOrder( Map<Integer,BookDTO> mycartMap);
	public void addUserRating(UserRatingDTO userRating);
	public List<UserRatingDTO> getMyRatings(String userId);
}
