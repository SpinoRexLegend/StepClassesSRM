package UsernameProblem;

import java.util.List;

public class UsernameChecker {
    private final UsernameStore store;
    private final UsernameSuggester suggester;

    public UsernameChecker(UsernameStore store, UsernameSuggester suggester) {
        this.store = store;
        this.suggester = suggester;
    }

    public UsernameResult check(String username) {
        store.incrementPopularity(username);

        if (store.exists(username)) {
            List<String> alternatives = suggester.suggest(username, store);
            return new UsernameResult(false, alternatives, store.getPopularity(username));
        }
        else {
            store.add(username);
            return new UsernameResult(true, List.of(), store.getPopularity(username));
        }
    }
}