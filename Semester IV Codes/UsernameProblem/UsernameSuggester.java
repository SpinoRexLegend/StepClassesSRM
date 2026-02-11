package UsernameProblem;

import java.util.ArrayList;
import java.util.List;

public class UsernameSuggester {
    public List<String> suggest(String username, UsernameStore store) {
        List<String> suggestions = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String candidate = username + i;

            if (!store.exists(candidate)) {
                suggestions.add(candidate);
            }
        }
        return suggestions;
    }
}