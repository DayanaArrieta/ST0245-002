public class Fecha {
    int day;
    int month;
    int year;
    public Fecha(){
        day = this.day;
        month = this.month;
        year = this.year;
    }

    public int day(){
        return day;
    }

    public int mes(){
        return month;
    }

    public int Year(){
        return year;
    }

    public int comparar(Fecha otra){
        if(this.year < otra.year){
            return -1;
        }if(this.year>otra.year){
            return 1;
        }if(this.month < otra.month){
            return -1;
        }if(this.month > otra.month){
            return 1;
        }if(this.day < otra.day){
            return -1;
        }if(this.day > otra.day){
            return 1;
        }return 0;

    }

    public String tostring(int d){
        String date = "";
        switch (d){
            case 1 :
                date = "this date after other date";
                break;
            case 2 :
                date = "this date before other date";
                break;
            case 3 :
                date = "Equal dates";
        }
        return date;
    }
}



