class Mobile{
    Mobile(){
        System.out.println("Basic Mobile is Manufactured");
    }
    void basicMobile(){

    }
}
class CameraMobile extends Mobile{
    CameraMobile(){
        System.out.println("Camera Mobile is Manufactured");
    }
    void newFeature(){
        System.out.println("Camera Mobile with 5MG px");
    }
}
class AndroidMobile extends CameraMobile{
    AndroidMobile(){
        System.out.println("Android Mobile is Manufactured");
    }
    void androidMobile(){
        System.out.println("Touch Screen Mobile is Manufactured");
    }
}

class week52{
    public static void main(String[] args){
        AndroidMobile mobile = new AndroidMobile();
        mobile.newFeature();
        mobile.androidMobile();
    }
}