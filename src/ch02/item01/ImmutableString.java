package ch02.item01;

public class ImmutableString {
    private final String name;

    public ImmutableString(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
