package DesignPatterns.Structural.Proxy;

//Treats groups of objects the same as individual objects (tree structures).

class InternetProxy implements Internet{
    private RealInternet internet = new RealInternet();
    public void connect(String website){
        if(website.contains("blocked")){
            System.out.println("Access denied to " + website);
        } else {
            internet.connect(website);
        }
    }
}
