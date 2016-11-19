package samples.com.roboguicefull;

/**
 * Created by raul on 18/11/2016.
 */

public class People {
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    @Override
    public String toString() {
        return "People{" +
                "something='" + something + '\'' +
                '}';
    }
}
