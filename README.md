Feladat 009

Adott a következő interfész:

public interface Controllable {
    void start();
    void stop();
    void restart();
}

Készítsen osztályt Controller néven, amely megvalósítja az interfészt. Az egyes metódusok, csak egy szöveg kiíratásával küldjenek üzenetet, hogy az adott funkció elindult.