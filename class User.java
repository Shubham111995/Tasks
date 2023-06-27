class User 
{
    
    public String name;
    public String address;
    public String phoneNumber;

    User(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User Name - " + this.name + "\naddress - " + this.address + "\nphone Number - "
                + this.phoneNumber + "\n";
    }
}