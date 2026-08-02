
public class Month {
    private int monthNumber;
    
    public Month(int m) {
        if (m > 12 || m < 1)
            monthNumber = 1;
        else
            monthNumber = m;
    }
    public void setMonthNumber(int m){
        if (m > 12 || m < 1)
            monthNumber = 1;
        else
            monthNumber = m;
    }
    public int getMonthNumber() {
        return monthNumber;
    }
    public String getMonthName() {
        String[] monthArray = {"January","February","March","April","May",
            "June","July","August","September","October","November","December"};
        return monthArray[monthNumber - 1];
    }
    public String getSeason() {
        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "Winter";
        } else if (monthNumber >= 3 && monthNumber <= 5) {
            return "Spring";
        } else if (monthNumber >= 6 && monthNumber <= 8) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
    public String toString() {
        return "Month Number: " + monthNumber + "\nMonth Name: " + getMonthName()
                + "\nSeason: " + getSeason();
    }
    public boolean equals(Month month2){
        return monthNumber == month2.getMonthNumber();
    }
}
