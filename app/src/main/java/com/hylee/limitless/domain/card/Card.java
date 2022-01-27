package com.hylee.limitless.domain.card;

import com.hylee.limitless.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Card extends BaseTimeEntity{

    @Id
    @GeneratedValue
    private Long id;

    private String question;

    private String answer;

    public Card(){}

    public Card(Long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public Card(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}