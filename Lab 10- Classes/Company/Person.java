class Person
{
    private String name, address, phone;

    public Person(String n, String a, String p)
    {
        name = n;
        address = a;
        phone = p;
    }

    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhone() {return phone;}
    public void setName(String n) {name=n;}
    public void setAddress(String a) {address=a;}
    public void setPhone(String p) {phone = p;}

    public boolean equals(Person x)
    {
        return name.equals(x.name)&&
                address.equals(x.address)&&
                phone.equals(x.phone);
    }

    public String toString()
    {
        return "Name:"+name+"\nAddress:"+address+"\nPhone:"+phone;
    }
}
