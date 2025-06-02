package nupurlearning.com;

public class Shop
{
    String shopName;
    int shopId;

    public void setValue(String shopNameArg,int shopIdArg)
    {
        shopName=shopNameArg;
        shopId= shopIdArg;

    }

    public void adMessage()
    {
        System.out.println("sale starts at  "+shopName+" today");
    }


}
