package com.hylee.limitless.controllers;

import com.hylee.limitless.application.CardService;
import com.hylee.limitless.domain.card.Card;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin
public class CardController {
    //TODO
    // 1. id CRUD 하기
    // V 2. cards 하면 일단은 전체 리스트들 -> 후에는 마인드맵으로
    // 3. id별로 - 1개 보여주기
    // 4. 카테고리별로 - 여러개로 보여주기
    // 5. timeline - 기록한 날짜별로 보여주기
    // 6. today - 오늘 공부해야될 카드들 보여주기

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> list() {
        return cardService.getCards();
    }

}