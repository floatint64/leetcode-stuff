package org.example.common;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode() {}
  public ListNode(int val) { this.val = val; }
  public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  public List<Integer> toList() {
    List<Integer> result = new ArrayList<>();

    var curr = this;

    while (curr != null) {
      result.add(curr.val);
      curr = curr.next;
    }

    return result;
  }
}