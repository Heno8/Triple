package club.aborigen.triple;

public class Triple<K, V, P> {
    public K value1;
    public V value2;
    public P value3;

    public Triple(K value1, V value2, P value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                ", value3=" + value3 +
                '}';
    }
}
