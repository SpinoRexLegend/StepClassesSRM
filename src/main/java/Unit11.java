import java.util.*;

public class Unit11 {

    static class GoodsBogie {
        private String type;
        private String cargo;
        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
        public String getType() { return type; }
        public String getCargo() { return cargo; }
    }

    public static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream().allMatch(b -> {
            if (b.getType().equalsIgnoreCase("Cylindrical")) {
                return b.getCargo().equalsIgnoreCase("Petroleum");
            }
            return true;
        });
    }

    public boolean testSafety_AllBogiesValid() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Rectangular", "Coal")
        );
        return isTrainSafe(bogies);
    }

    public boolean testSafety_CylindricalWithInvalidCargo() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Coal")
        );
        return isTrainSafe(bogies);
    }

    public boolean testSafety_NonCylindricalBogiesAllowed() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Rectangular", "Grain"),
                new GoodsBogie("Box", "Coal")
        );
        return isTrainSafe(bogies);
    }

    public boolean testSafety_MixedBogiesWithViolation() {
        List<GoodsBogie> bogies = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Cylindrical", "Coal"),
                new GoodsBogie("Rectangular", "Grain")
        );
        return isTrainSafe(bogies);
    }

    public boolean testSafety_EmptyBogieList() {
        List<GoodsBogie> bogies = new ArrayList<>();
        return isTrainSafe(bogies);
    }
}