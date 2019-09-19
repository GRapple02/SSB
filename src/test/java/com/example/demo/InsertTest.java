package com.example.demo;

import com.example.mapper.BoardMapper;
import com.example.domain.BoardVO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
 
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class InsertTest {
    
    @Autowired
    private BoardMapper mapper; //작성
 
    @Test
    public void contextLoads() {
    }
    
    @Test
    public void tesMapper() throws Exception{//작성
        BoardVO vo = new BoardVO();

        vo.setSubject("제목");
        vo.setContent("내용");
        vo.setWriter("작성자");

        mapper.boardInsert(vo);
        
    }
 
}
