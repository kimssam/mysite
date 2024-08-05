package com.study.mysite;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.study.mysite.question.Question;
import com.study.mysite.question.QuestionRepository;

@SpringBootTest
class MysiteApplicationTests {

	 @Autowired
	    private QuestionRepository questionRepository;

	    @Test
	    void testJpa() {     
	    	/*
	        Question q1 = new Question();
	        q1.setSubject("JPA가 무엇인가요?");
	        q1.setContent("JPA에 대해서 알려주세요.");
	        q1.setCreateDate(LocalDateTime.now());
	        this.questionRepository.save(q1);  // 첫번째 질문 저장

	        Question q2 = new Question();
	        q2.setSubject("ORM이 무엇인가요?");
	        q2.setContent("ORM에 대해서 알려주세요.");
	        q2.setCreateDate(LocalDateTime.now());
	        this.questionRepository.save(q2);  // 두번째 질문 저장
	        */
	    	
	        /*
	    	List<Question> all = this.questionRepository.findAll();
	        assertEquals(2, all.size());

	        Question q = all.get(0);
	        assertEquals("JPA가 무엇인가요?", q.getSubject());
	        */
	    	
	        /*
	    	Optional<Question> oq = this.questionRepository.findById(1);
	        if(oq.isPresent()) {
	            Question q = oq.get();
	            assertEquals("JPA가 무엇인가요?", q.getSubject());
	        }
	        */
	    	
	        /*
	        Question q = this.questionRepository.findBySubject("JPA가 무엇인가요?");
	        assertEquals(1, q.getId());
	        */
	    	
	    	Question q = this.questionRepository.findBySubjectAndContent(
	                "ORM이 무엇인가요?", "ORM에 대해서 알려주세요.");
	        assertEquals(2, q.getId());
	    }
	    
}



















