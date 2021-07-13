package JavaExercises;

public class LRUCasheUse {

    public static void main(String[] args){
        LRUCache cache = new LRUCache(4);

        cache.refer(1);
        cache.refer(2);
        cache.refer(3);
        cache.refer(1);
        cache.refer(4);
        cache.refer(5);
        cache.refer(2);
        cache.refer(2);
        cache.refer(1);

        System.out.println("Content of cache: ");
        cache.display();
    }
}
