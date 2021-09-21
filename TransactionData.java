/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orpis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;



/**
 *
 * @author Dell
 */
public class TransactionData {
    private String type,value,points;
    private Date transDate;
    public TransactionData(String type,String value,String points, Date transDate){
        this.type=type;
        this.value=value;
        this.points=points;
        this.transDate=transDate;
        
    }
    public String getType(){
        return type;
    }
    public String getValue(){
        return value;
    }
    public String getPoints(){
        return points;
    }
    public String getTransDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            java.util.Date d1=transDate;
            String date=formatter.format(d1);
            return date;
    }
}
