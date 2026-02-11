package UsernameProblem;

import java.util.List;

public class UsernameResult {
    private final boolean available;
    private final List<String> suggestions;
    private final int popularity;

    public UsernameResult(boolean available, List<String> suggestions, int popularity) {
        this.available = available;
        this.suggestions = suggestions;
        this.popularity = popularity;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public int getPopularity() {
        return popularity;
    }
}