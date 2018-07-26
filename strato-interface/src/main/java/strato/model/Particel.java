package strato.model;

/**
 * Particel Entity
 */
public class Particel {

    private Object value;
    private Object type;

    public Particel() {
    }

    public Particel(Object value, Object type) {
        this.value = value;
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Particel{");
        sb.append("value=").append(value);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
