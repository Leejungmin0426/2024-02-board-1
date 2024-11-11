package com.green.board;

import com.green.board.model.BoardInsRequest;
import com.green.board.model.BoardSelOneRes;
import com.green.board.model.BoardSelRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

    /*
        @Service - 빈 등록, 서비스가 로직처리 담당, 로직처리가 있다면 여기서 처리한다.
        없으면 연결작업만... 연결작업이 Controller와 Persistence(DB) 연결

        빈 등록: 스프링 컨테이너에게 객체 생성을 대리로 맡기는 것, 기본적으로 싱글톤으로 객체화
        프라이빗하게 객체생성해서 딱 하나만 만들 수 있도록 하는 것

     */


@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public int insBoard(BoardInsRequest p) {
        return mapper.insBoard(p);
    }

    public List<BoardSelRes> selBoardList() {
        return mapper.selBoardList();
    }
    public BoardSelOneRes selBoardOne(int p) {
        return mapper.selBoardOne(p);
    }
}
