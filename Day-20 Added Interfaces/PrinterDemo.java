interface Printer {
    public void print();
    
}
class LaserPrinter implements Printer{
    @Override
    public void print(){
        System.out.println("Laser is printing ");
    }

}
class InkjetPrinter implements Printer{
    @Override
    public void print(){
    System.out.println("Inkjet is speaking");
    }

}
class PrinterDemo{
    public static void main(String[] args) {
        InkjetPrinter p = new InkjetPrinter();
        LaserPrinter l = new LaserPrinter();
        p.print();
        l.print();
        
    }
}

