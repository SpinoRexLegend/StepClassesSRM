import java.util.*;

public class Unit12 {

    static class Bogie {
        private String name;
        private int capacity;
        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
        public String getName() { return name; }
        public int getCapacity() { return capacity; }
    }

    public List<Bogie> loopFilter(List<Bogie> bogies, int limit) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > limit) {
                result.add(b);
            }
        }
        return result;
    }

    public List<Bogie> streamFilter(List<Bogie> bogies, int limit) {
        return bogies.stream().filter(b -> b.getCapacity() > limit).toList();
    }

    public long measureLoopTime(List<Bogie> bogies, int limit) {
        long start = System.nanoTime();
        loopFilter(bogies, limit);
        long end = System.nanoTime();
        return end - start;
    }

    public long measureStreamTime(List<Bogie> bogies, int limit) {
        long start = System.nanoTime();
        streamFilter(bogies, limit);
        long end = System.nanoTime();
        return end - start;
    }

    public boolean testLoopFilteringLogic(List<Bogie> bogies, int limit) {
        List<Bogie> result = loopFilter(bogies, limit);
        return result.stream().allMatch(b -> b.getCapacity() > limit);
    }

    public boolean testStreamFilteringLogic(List<Bogie> bogies, int limit) {
        List<Bogie> result = streamFilter(bogies, limit);
        return result.stream().allMatch(b -> b.getCapacity() > limit);
    }

    public boolean testLoopAndStreamResultsMatch(List<Bogie> bogies, int limit) {
        return loopFilter(bogies, limit).size() == streamFilter(bogies, limit).size();
    }

    public boolean testExecutionTimeMeasurement(List<Bogie> bogies, int limit) {
        long loopTime = measureLoopTime(bogies, limit);
        long streamTime = measureStreamTime(bogies, limit);
        return loopTime > 0 && streamTime > 0;
    }

    public boolean testLargeDatasetProcessing(int size, int limit) {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            bogies.add(new Bogie("Bogie" + i, i));
        }
        List<Bogie> loopResult = loopFilter(bogies, limit);
        List<Bogie> streamResult = streamFilter(bogies, limit);
        return loopResult.size() == streamResult.size();
    }
}