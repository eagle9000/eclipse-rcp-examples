package de.baeckerit.jdk.util;

public class RangeOfCharacters implements SetOfCharacters {

  private final char start;
  private final char end;

  public RangeOfCharacters() {
    this(Character.MIN_VALUE, Character.MAX_VALUE);
  }

  public RangeOfCharacters(char start, char end) {
    if (start > end)
      throw new IllegalArgumentException("start of range is greater than end of range");
    this.start = start;
    this.end = end;
  }

  public char getStart() {
    return start;
  }

  public char getEnd() {
    return end;
  }

  @Override
  public boolean contains(char c) {
    return c >= start && c <= end;
  }
}
