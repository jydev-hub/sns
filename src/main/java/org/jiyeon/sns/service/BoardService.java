package org.jiyeon.sns.service;

import org.jiyeon.sns.dto.BoardDTO;
import org.jiyeon.sns.dto.PageRequestDTO;
import org.jiyeon.sns.dto.PageResponseDTO;

public interface BoardService {
Long register(BoardDTO boardDTO);
BoardDTO readOn(Long bno);
void modify(BoardDTO boardDTO);
void remove(Long bno);
PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);
}
