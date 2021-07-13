package JavaExercises;

import java.util.*;

public class LRUCache {

    private Deque<Integer> doublyQueue;
    private HashSet<Integer> hashSet;
    private final int CACHE_SIZE;

    LRUCache(int capacity) {
        doublyQueue = new LinkedList<>();
        hashSet = new HashSet<>();
        CACHE_SIZE = capacity;
    }

    //  refer page within cache
    public void refer(int page) {
        if (!hashSet.contains(page)) {
            if (doublyQueue.size() == CACHE_SIZE) {
                int last = doublyQueue.removeLast();
                hashSet.remove(last);
            }
        } else {
            doublyQueue.remove(page);
        }

        doublyQueue.push(page);
        hashSet.add(page);
    }

    // display contents of cache
    public void display() {
        Iterator<Integer> itr = doublyQueue.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
