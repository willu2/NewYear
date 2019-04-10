import java.util.Random;

public enum DecorType

          {
            NewYearTree, House, Flat, Office, Shop, KinderGarden;

            public static DecorType getdecorType() {
                Random random = new Random();
                return values()[random.nextInt(values().length)];
            }

    private DecorType decorType;

    public DecorType getDecorType() {
        return decorType;
    }

    DecorType() {
    }
}
