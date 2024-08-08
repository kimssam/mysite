package com.study.mysite.question;

import java.time.LocalDateTime;
import java.util.List;

import com.study.mysite.answer.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200) //한글(600바이트), 영어(100바이트) 모두 200자
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
    //Question 엔티티에서 작성 일시에 해당하는 createDate 속성의 이름은 데이터베이스의 테이블에서는 create_date라는 열 이름으로 설정된다. 즉, createDate처럼 카멜 케이스(camel case) 형식의 이름은 create_date처럼 모두 소문자로 변경되고 단어가 언더바(_)로 구분되어 데이터베이스 테이블의 열 이름이 된다.
    
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) 
    private List<Answer> answerList; 
}



