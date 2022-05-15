package com.zerock.mapper.ex03;

import java.util.List;

import com.zerock.domain.ex02.ReplyDto;

public interface Ex04Mapper {

	int insertReply(ReplyDto reply);

	List<ReplyDto> selectReplyByBoardId(int boardId);

	int deleteReplyById(int id);

	void deleteReplyByBoard(int boardId);

	

}
