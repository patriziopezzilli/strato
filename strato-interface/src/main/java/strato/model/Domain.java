package strato.model;

import java.util.List;

public class Domain {

    private Object key;
    private List<Particel> particels;

    public Domain() {
    }

    public Domain(Object key, List<Particel> particels) {
        this.key = key;
        this.particels = particels;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public List<Particel> getParticels() {
        return particels;
    }

    public void setParticels(List<Particel> particels) {
        this.particels = particels;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Domain{");
        sb.append("key=").append(key);
        sb.append(", particels=").append(particels);
        sb.append('}');
        return sb.toString();
    }
}
