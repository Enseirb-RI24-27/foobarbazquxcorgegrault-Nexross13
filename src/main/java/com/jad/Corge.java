package com.jad;

public class Corge {
    private Foo foo;
    public Corge(Foo foo) {
        this.foo = null;
        this.setFoo(foo);
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo) {
        if (this.foo == foo) {
            return;
        }
        Foo oldFoo = this.foo;
        this.foo = foo;
        if (foo != null && foo.getCorge() != this) {
            foo.setCorge(this);
        }
        if (foo != null && oldFoo != null && oldFoo.getCorge() == this) {
            oldFoo.setCorge(null);
        }
    }
}
