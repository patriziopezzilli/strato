package strato.model;

import java.util.Map;

public class Container {

    private Map<Object, Domain> domains;

    public Container() {
    }

    public Container(Map<Object, Domain> domains) {
        this.domains = domains;
    }

    public Map<Object, Domain> getDomains() {
        return domains;
    }

    public void setDomains(Map<Object, Domain> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Container{");
        sb.append("domains=").append(domains);
        sb.append('}');
        return sb.toString();
    }
}
