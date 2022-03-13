package pl.kocan.chain.of.responsibility.pattern.homework.request;

import pl.kocan.chain.of.responsibility.pattern.homework.children.Shelf;

public class MotherRequest {

    private Shelf shelf;

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }

    public Shelf getShelf() {
        return shelf;
    }

}
