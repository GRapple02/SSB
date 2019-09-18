package com.example.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.example.domain.BoardVO;

public interface BoardMapper{
    public void boardInsert(BoardVO vo) throws Exception;

    public List<BoardVO> boardList() throws Exception;
}