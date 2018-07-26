import strato.model.Container;
import strato.model.Domain;
import strato.model.Particel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsistencyTest {

    public static void main(String[] args) {

        // create different type of particels
        Particel one = new Particel("one", "oneType");
        Particel two = new Particel(2, 2);
        Particel three = new Particel(true, false);
        Particel four = new Particel(true, 3);
        Particel five = new Particel("five", 4);

        // create different domains list
        List<Particel> first = new ArrayList<>();
        List<Particel> second = new ArrayList<>();
        List<Particel> third = new ArrayList<>();

        // populate domains list
        first.add(one);
        first.add(three);
        first.add(five);
        second.add(two);
        second.add(four);
        second.add(five);
        third.add(one);
        third.add(four);
        third.add(five);

        // create domain
        Domain domainone = new Domain("one", first);
        Domain domaintwo = new Domain(2, second);
        Domain domainthree = new Domain(true, third);

        // create and container
        Map<Object, Domain> domains = new HashMap<>();
        domains.put("primo", domainone);
        domains.put(2, domaintwo);
        domains.put(false, domainthree);

        // populate container
        Container container = new Container(domains);

        System.out.println("*****************************");
        System.out.println(container);
        System.out.println("*****************************");
    }
}
