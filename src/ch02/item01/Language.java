package ch02.item01;

public interface Language {

    void description();
    static Language of(String country) {
        if (country.equals("한국")) {
            return new Korean();
        } else if (country.equals("일본")) {
            return new Japanese();
        } else {
            return new English();
        }
    }
}
