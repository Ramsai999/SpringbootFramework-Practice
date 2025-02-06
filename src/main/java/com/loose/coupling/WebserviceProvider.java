package com.loose.coupling;

public class WebserviceProvider implements UserDataProvider{

    @Override
    public String getUserDetails() {
        return "the message is from WebServuce";


    }




}
