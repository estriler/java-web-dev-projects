package org.example;

public class SmartPhone extends Computer{
    private String provider;
    private boolean phoneCall = false;

    public SmartPhone(String aProvider, boolean aPhoneCall, double aPrice, int aRam, int aMemory, boolean aHasVirus){
        super(aPrice, aRam, aMemory, aHasVirus);
        provider = aProvider;
        phoneCall = aPhoneCall;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public boolean isPhoneCall() {
        return phoneCall;
    }

    public void setPhoneCall(boolean phoneCall) {
        this.phoneCall = phoneCall;
    }
}
