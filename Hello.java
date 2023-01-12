class computer{
    public void welcome(){
        System.out.println("Welocme to your PC");
    }
}

class Hello{
    public static void main(String args[]){
        computer obj = new computer();
        obj.welcome();
    }
}