public enum Material
{
    CERAMIC(5.99),
    STAINLESS_STEEL(3.99),
    GLASS(2.99),
    BAMBOO(7.99),
    PORCELAIN(10.99),
    PLASTIC(.99);

    private double price;

    private Material(double price)
    {
        this.price = price;
    }
}
