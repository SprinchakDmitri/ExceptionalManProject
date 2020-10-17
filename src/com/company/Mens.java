package com.company;

public enum Mens {

    POOR_STUDENT(true,false,false,false,true),
    BUISNESMAN(false,true,true,false,false),
    PROGRAMMER(true,true,false,false,true),
    FACTORY_WORKER(false,false,true,true,false),
    ARTIST(false,true,true,true,false);


    private final boolean catLover;
    private final boolean heIsRitch;
    private final boolean hasACar;
    private final boolean makeSports;
    private final boolean heIsIntrovert;


    Mens(boolean catLover, boolean heIsRitch, boolean hasACar, boolean makeSports, boolean heIsIntrovert) {
        this.catLover = catLover;
        this.heIsRitch = heIsRitch;
        this.hasACar = hasACar;
        this.makeSports = makeSports;
        this.heIsIntrovert = heIsIntrovert;
    }

    public boolean heIsCatLover(){
        return catLover;
    }

    public boolean heIsRich() { return heIsRitch; }

    public boolean heHasACar() {
        return hasACar;
    }

    public boolean heMakesSports() {
        return makeSports;
    }

    public boolean heIsIntrovert() {
        return heIsIntrovert;
    }
}
