package com.zerock.domain.ex02;

import lombok.Data;

@Data
public class ReplyDto {
	private int id;
	private int boardId; // board_id column < 원래 이건데 별칭 잘 주기
	private String content;
	private LocalDateTime inserted;
}
