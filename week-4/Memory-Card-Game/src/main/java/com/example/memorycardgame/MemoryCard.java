package com.example.memorycardgame;

public class MemoryCard extends Card {
    private boolean matched;

    public MemoryCard(String suit, String faceName, boolean matched) {
        super(suit, faceName);
        this.matched = matched;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public boolean isSameCard(MemoryCard otherCard) {
        return (this.getSuit().equals(otherCard.getSuit()) &&
                this.getFaceName().equals(otherCard.getFaceName()));
    }
}
