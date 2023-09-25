package edu.cnm.deepdive.cards.model;

import java.util.Objects;

public class Card {
  private final Rank rank;
  private final Suit suit;
  private final int hash;
  private final String representation;
  private boolean faceup;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    hash = Objects.hash(rank, suit);
    representation = rank.getSymbol() + suit.getSymbol();
  }
  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  public boolean isFaceup() {
    return faceup;
  }

  public void setFaceup(boolean faceup) {
    this.faceup = faceup;
  }

  @Override
  public String toString() {
    return representation;
  }

  @Override
  public int hashCode() {
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Card other)
    {
      result = rank.equals(other.rank) && suit.equals(other.suit);
    }
    else {result = false;}
    return result;
  }
}
