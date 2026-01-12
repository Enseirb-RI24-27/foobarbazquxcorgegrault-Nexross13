package com.jad;
import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new ArrayList<>();
        this.qux = new Qux();
        this.corge = null;
        this.graults = new ArrayList<>();
    }

    public void addBaz(Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }

    public Bar getBar() {
        return bar;
    }

    public List<Baz> getBazs() {
        return bazs;
    }

    public Corge getCorge() {
        return corge;
    }

    public List<Grault> getGraults() {
        return graults;
    }

    public Qux getQux() {
        return qux;
    }

    public void setCorge(Corge corge) {
        if (this.corge == corge) {
            return;
        }
        Corge oldCorge = this.corge;
        this.corge = corge;
        if (oldCorge != null && corge != null) {
            oldCorge.setFoo(null);
        }
        if (corge != null && corge.getFoo() != this) {
            corge.setFoo(this);
        }
    }
}
