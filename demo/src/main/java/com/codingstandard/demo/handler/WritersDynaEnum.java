package com.codingstandard.demo.handler;


public class WritersDynaEnum extends PropertiesDynaEnum {
    static {
        System.out.println("ClassLoaded");
        init(WritersDynaEnum.class);
    }
    private final String nationality;

    protected WritersDynaEnum(String name, int ordinal, String nationality) {
        super(name, ordinal);
        this.nationality = nationality;
    }

    public String nationality() {
        return nationality;
    }

    /**
     * Explicit definition of values() is needed here to trigger static initializer.
     * @return
     */
    public static WritersDynaEnum[] values() {
        return values(WritersDynaEnum.class);
    }

}