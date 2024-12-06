
class Veena {
    
    int StoreRoom(int money, String returnProduct) {
        if(returnProduct.equals("")){
            System.out.println("No Product Returned");
        } else{
            System.out.println("This Product Returned:"+returnProduct);
        }
        int addNumber = money - 20;
        return addNumber;
    }
    
    void Store() {
        int value = 100+ 100;
    }
    
    int iamByte1() {
        return -128;
    }
    
    public static void main(String[] args) {
        
        Veena reference = new Veena();
        
        int Rajesh = reference.StoreRoom(40, "Red Label");
        int veena = reference.StoreRoom(100, "");
        int deelip = reference.StoreRoom(50, "");
        
        System.out.println("Rajesh:"+Rajesh);
        System.out.println("Veena:"+veena);
        System.out.println("Deelip:" +deelip);
        reference.Store();
        
    }
}




