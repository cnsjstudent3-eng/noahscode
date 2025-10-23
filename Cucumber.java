public class Cucumber{
    private String color;
    private double lenght;
    private List thelist;
    public String getcolor(){
        return(color);
    }
    public void getthestring(){
        for(int x=0; x<thelist.lenght; x++){
            system.out.println(thelist.get(i));
        }
    }
    public double getlenght(){
        return(lenght);
    }
    public Cucumber(String colorinp, double lenghtinp, List thelistinp){
        color = colorinp;
        lenght = lenghtinp;
        thelist = thelistinp;
    }
    

    public static void main(String[] args){
        int[] watda = {"oke i guess list go here now","old list ahead:","ahh yes","the list","indeed","what a list this is","truly, a list for the ages"};
        Cucumber myCucumber = new Cucumber("green",0.2,watda );
        system.out.print(myCucumber.getthestring());
        System.out.println("hello yes u have reached dado house of fine pharmaceutical also laundry and tan. please also visit dado short term loan and vhs rental store while in town.\nyes i am dado of course purveyor of fine dado business. pls forgive spelling error hamster is often walk about the keyboard and lkuglkjm;olfbjkinjuk hamstr\noh u r interest in see cat log of valuable remedy? yes i show this 2 u. dado has what fixes the ails in u. pls see cat log below. again sry for any mispells, dado uppercase key broke.");

    }

}