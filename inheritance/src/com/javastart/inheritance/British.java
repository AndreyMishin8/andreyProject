package com.javastart.inheritance;

public class British extends Cat {

    private String name;

    public British(int age, String owner, String name) {

        super(age, owner);
        this.name = name;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;

    }


    @Override
    public String toString() {
        return " Cat name = " + name + " cat age = " + getAge() + " Cat owner = " + getOwner();

    }

    public boolean equals(Object o) {

        if (this == o) {
            return true;

        }
        if (o == null) {

            return false;
        }
        if (getClass() == o.getClass()){

            British outsideObject = (British) o;
            return name.equals(outsideObject.name)&& getAge() == outsideObject.getAge() && getOwner().equals(outsideObject.getOwner());
        }
        return false;
    }
}


