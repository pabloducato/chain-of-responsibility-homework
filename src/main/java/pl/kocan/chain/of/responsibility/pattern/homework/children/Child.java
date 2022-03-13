package pl.kocan.chain.of.responsibility.pattern.homework.children;

import pl.kocan.chain.of.responsibility.pattern.homework.request.MotherRequest;

public abstract class Child {

    private Child tallerChild;

    public abstract void processRequest(MotherRequest motherRequest);

    Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

}
