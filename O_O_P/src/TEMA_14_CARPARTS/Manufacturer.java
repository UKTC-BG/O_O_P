package TEMA_14_CARPARTS;

class Manufacturer {

    private String name; // Име на производител
    private String country; // Страна
    private String address; // Адрес
    private String phoneNumber; // Телефон / GSM
    private String email; // E-mail



    // КОНСТРУКТОР С ПАРАМЕТРИ
    public Manufacturer(String name,
                        String country,
                        String address,
                        String phoneNumber,
                        String email) {

        this.name = name;
        this.country = country;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }


    // GETTERS AND SETTERS ==========================================

    //GETTERS : -------------------------------------
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }


    // SETTERS : --------------------------------------
    public void setName(String setname) { this.name = setname; }
    public void setCountry(String setcountry) { this.country = setcountry; }
    public void setAddress(String setaddress) { this.address = setaddress; }
    public void setPhoneNumber(String setphonenumber) { this.phoneNumber = setphonenumber; }
    public void setEmail(String setemail) { this.email = setemail; }



    // /////////////////////////////////////////////////////////

    @Override
    public String toString(){

        StringBuilder result = new StringBuilder();

        // result.append("MANUFACTURERS : " + "\n");
        result.append("Name: " + this.name + "\n");
        result.append("Country: " + this.country + "\n");
        result.append("Address: " + this.address + "\n");
        result.append("Phone: " + this.phoneNumber + "\n");
        result.append("Email: " + this.email + "\n");


        return result.toString();

        // this.name +
                // " <" + this.country+
                // "," + this.address +
                //"," + this.phoneNumber +
                //"," + this.email +
                //">";
    }

}