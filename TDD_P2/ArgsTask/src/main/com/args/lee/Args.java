package com.args.lee;

public class Args {
    private final Schemas schemas;
    private final Command command;

    public Args(String s, String command) {
        this.schemas = new Schemas(s);
        this.command = new Command(command);
    }

    public Object getValue(String name) {
        return schemas.getValue(name,command.getValue(name));
    }
}
