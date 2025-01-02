package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionLabels {
    class Span {
        private int start;
        private int end; // inclusive

        public Span(int s, int e) {
            start = s;
            end = e;
        }
    }

    public List<Integer> partitionLabels(String s) {

        Map<Character, Integer> lastPosMap = new HashMap<>();
        List<Span> spans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            lastPosMap.computeIfAbsent(c, s::lastIndexOf);
            int lastPos = lastPosMap.get(c);
            spans.add(new Span(i, lastPos));
        }

        spans.sort(Comparator.comparingInt(a -> a.start));

        // merge

        List<Span> mergedSpans = new ArrayList<>();

        for (int i = 0; i < spans.size(); i++) {
            Span span = spans.get(i);

            if (!(!mergedSpans.isEmpty() && mergedSpans.get(mergedSpans.size() - 1).end >= span.end)) {
                int newEnd = span.end;
                for (int j = i + 1; j < spans.size(); j++) {
                    Span nextSpan = spans.get(j);
                    if (nextSpan.start <= newEnd) {
                        newEnd = Math.max(newEnd, nextSpan.end);
                    }
                }
                mergedSpans.add(new Span(span.start, newEnd));
            }
        }



        return mergedSpans
                .stream()
                .map(x -> x.end - x.start + 1)
                .collect(Collectors.toList());
    }
}
