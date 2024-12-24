package org.example.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

  public static ListNode fromIntStream(IntStream stream) {
    List<ListNode> tmpList = stream.mapToObj(ListNode::new).collect(Collectors.toList());

    for (int i = 0; i < tmpList.size() - 1; i++){
      tmpList.get(i).next = tmpList.get(i + 1);
    }

    return tmpList.get(0);
  }
}