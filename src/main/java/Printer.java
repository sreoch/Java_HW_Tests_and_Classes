public class Printer {

    private int sheets;

    public Printer(int sheets){
        this.sheets = sheets;
    }

    public int getSheets(){
        return this.sheets;
    }

    public void setSheets(int newSheets){
        this.sheets = newSheets;
    }

    public void Print(int numOfPages, int numOfCopies){
        int sheetsNeeded = numOfPages * numOfCopies;
        if (sheetsNeeded <= this.sheets){
            this.sheets -= sheetsNeeded;
        }
        else{
            System.out.println("Not enough sheets in printer");
        }
    }
}
