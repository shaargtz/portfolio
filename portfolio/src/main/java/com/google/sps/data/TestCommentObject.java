package com.google.sps.servlets;

import java.util.ArrayList;

public final class TestCommentObject {

  private final ArrayList<String> commentList;

  public void addComment(String comment) {
    commentList.add(comment);
  }
}
