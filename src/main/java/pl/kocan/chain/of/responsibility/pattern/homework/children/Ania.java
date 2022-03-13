package pl.kocan.chain.of.responsibility.pattern.homework.children;

import pl.kocan.chain.of.responsibility.pattern.homework.request.MotherRequest;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)) {
            System.out.println("Ania zdjęła słoik z półki!");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }

}
