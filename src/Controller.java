/*
* File: Controller.java
* Author: Zsiga Gergely
* Copyright: 2023, zsiga Gergely
* Group: Szoft/II/1/E
* Date: 2023-11-29
* Github: https://github.com/zsi-ga/Feladat009.git
* Licenc: GNU GPL
*/

public class Controller implements Controllable {

    @Override
    public void start() {

        System.out.println("A start funkció elindult.");
    }

    @Override
    public void stop() {

        System.out.println("A stop funkció elindult.");
    }

    @Override
    public void restart() {

        System.out.println("A restart funkció elindult.");

    }

    
}

