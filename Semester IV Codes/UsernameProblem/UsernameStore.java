package UsernameProblem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UsernameStore {
    private final ConcurrentHashMap<String, AtomicInteger> usernames = new ConcurrentHashMap<>();

    public boolean exists(String username) {
        return usernames.containsKey(username);
    }

    public void add(String username) {
        usernames.putIfAbsent(username, new AtomicInteger(0));
    }

    public void incrementPopularity(String username) {
        usernames.computeIfAbsent(username, k -> new AtomicInteger(0)).incrementAndGet();
    }

    public int getPopularity(String username) {
        return usernames.getOrDefault(username, new AtomicInteger(0)).get();
    }
}