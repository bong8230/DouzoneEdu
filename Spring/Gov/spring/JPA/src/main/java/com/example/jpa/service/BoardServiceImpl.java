package com.example.jpa.service;

import com.example.jpa.model.Board;
import com.example.jpa.repository.BoardRepository;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl extends BoardService {
    @Autowired
    BoardRepository boardRepository;


    @Override //게시판 리스트, 5개씩보기 //curPage :요청하는 페이지, 첫페이지는 0
    public Page<Board> findAll(Integer curPage) {
        PageRequest pr = new PageRequest(curPage, 5,
                new Sort.Order(Sort.Direction.DESC,"reply"),new Sort.Order(Sort.Direction.ASC,"replystep") );

        return boardRepository.findAll(pr);
    }
}
