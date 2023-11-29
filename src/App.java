
/*
* File: App.java
* Author: Zsiga Gergely
* Copyright: 2023, zsiga Gergely
* Group: Szoft/II/1/E
* Date: 2023-11-29
* Github: https://github.com/zsi-ga/Feladat009.git
* Licenc: GNU GPL
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Controller controller = new Controller();

        controller.start();
        controller.stop();
        controller.restart();

    }


}