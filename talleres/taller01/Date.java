package Taller1;

/**
 * This is an algorithm that defines an abstract type of data to
 * represent a date
 * @author: Dayana Arrieta & Juan José Quintana.
 * @version: 27/01/2021
 */

public class Date {
    int day;
    int month;
    int year;

    public Date(){
        day = this.day;
        month = this.month;
        year = this.year;
    }

    public int day(){
        return day;
    }

    public int month(){
        return month;
    }

    public int Year(){
        return year;
    }

    public int compare(Date another){
        if(this.year < another.year){
            return -1;
        }if(this.year>another.year){
            return 1;
        }if(this.month < another.month){
            return -1;
        }if(this.month > another.month){
            return 1;
        }if(this.day < another.day){
            return -1;
        }if(this.day > another.day){
            return 1;
        }return 0;

    }

    public String toString() {
        String Fecha = "";
        Fecha = this.year + "/" + this.month +"/" + this.day;
        return Fecha;
    }
}
