import java.util.*;

public class Unit13 {

    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    static class PassengerBogie {
        private String type;
        private int capacity;
        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }
        public String getType() { return type; }
        public int getCapacity() { return capacity; }
    }

    public boolean testException_ValidCapacityCreation(String type, int capacity) throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie(type, capacity);
        return b.getCapacity() > 0;
    }

    public boolean testException_NegativeCapacityThrowsException(String type, int capacity) {
        try {
            new PassengerBogie(type, capacity);
            return false;
        } catch (InvalidCapacityException e) {
            return true;
        }
    }

    public boolean testException_ZeroCapacityThrowsException(String type, int capacity) {
        try {
            new PassengerBogie(type, capacity);
            return false;
        } catch (InvalidCapacityException e) {
            return true;
        }
    }

    public boolean testException_ExceptionMessageValidation(String type, int capacity) {
        try {
            new PassengerBogie(type, capacity);
            return false;
        } catch (InvalidCapacityException e) {
            return e.getMessage().equals("Capacity must be greater than zero");
        }
    }

    public boolean testException_ObjectIntegrityAfterCreation(String type, int capacity) throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie(type, capacity);
        return b.getType().equals(type) && b.getCapacity() == capacity;
    }

    public boolean testException_MultipleValidBogiesCreation(List<Integer> capacities) {
        try {
            List<PassengerBogie> bogies = new ArrayList<>();
            for (int c : capacities) {
                bogies.add(new PassengerBogie("Sleeper", c));
            }
            return bogies.size() == capacities.size();
        } catch (InvalidCapacityException e) {
            return false;
        }
    }
}