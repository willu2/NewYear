public class OrnamentEntity implements Comparable<OrnamentEntity> {

    private String name;

    private DecorType decorType;
    public OrnamentEntity(DecorType decorType, String name ) {

        this.decorType = decorType;
        this.name = name;
    }

    public OrnamentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DecorType getDecorType() {
        return decorType;
    }

    public void setDecorType(DecorType decorType) {
        this.decorType = decorType;
    }


    @Override
    public String toString() {
        return "Decor [type=" + decorType + "]";
    }

    public int compareTo(OrnamentEntity o) {
        return this.getDecorType().compareTo(o.getDecorType());
    }
}
