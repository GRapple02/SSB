package com.example.domain;

import java.util.Date;

public class BoardVO{
    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_date;
    private int hit;


    public int getBno() {
        return this.bno;
    }
    public void setBno(int bno) {
        this.bno = bno;
    }


    public String getSubject() {
    	return this.subject;
    }
    public void setSubject(String subject) {
    	this.subject = subject;
    }


    public String getContent() {
    	return this.content;
    }
    public void setContent(String content) {
    	this.content = content;
    }


    public String getWriter() {
    	return this.writer;
    }
    public void setWriter(String writer) {
    	this.writer = writer;
    }


    public Date getReg_date() {
    	return this.reg_date;
    }
    public void setReg_date(Date reg_date) {
    	this.reg_date = reg_date;
    }


    public int getHit() {
    	return this.hit;
    }
    public void setHit(int hit) {
    	this.hit = hit;
    }

    
}