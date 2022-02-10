public class BonusMilesService {
    public int calculate(int coast) {
        int bonus = 20;

        int miles = coast / bonus;
        return miles;
    }
}
