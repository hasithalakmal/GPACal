/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpacal;

/**
 *
 * @author Massa
 */
public class Validations {

    public boolean isValidSubjectCode(Object[][] data, int scode) {
        boolean b = true;
        for (int i = 0; i <= data.length; i++) {
            if (data[i][0] == null) {
                break;
            }
            int val1 = (int) data[i][0];
            if (val1 == scode) {
                b = false;
            }
        }
        return b;
    }
    
    public boolean isValidCredit(int x){
          boolean b = true;
          if(x>15){
              b=false;
          }
          return b;
    }
    
    public float getGPA(Object[][] data){
        float gpa =0;
        int numbserOfCredits =0;
        float total = 0,multi=0;
            for(int i=0;i<data.length;i++){
                if(data[i][0]==null){
                  //  numbserOfSubject =i;
                 //   System.out.println("subject = "+i);
                    break;
                }
                int credit = (int) data[i][1];
                numbserOfCredits = numbserOfCredits+credit;
                String x = (String) data[i][2];
                switch (x){
                    case "A+":
                        multi =(float) 4.25;
                        break;
                    case "A":
                        multi =(float) 4.00;
                        break;
                    case "A-":
                        multi =(float) 3.75;
                        break;
                        
                    case "B+":
                        multi =(float) 3.25;
                        break;
                    case "B":
                        multi =(float) 3.00;
                        break;
                    case "B-":
                        multi =(float) 2.75;
                        break;
                        
                    case "C+":
                        multi =(float) 2.25;
                        break;
                    case "C":
                        multi =(float) 2.00;
                        break;
                    case "C-":
                        multi =(float) 1.75;
                        break;
                        
                    case "D+":
                        multi =(float) 1.25;
                        break;
                    case "D":
                        multi =(float) 1.00;
                        break;
                    case "D-":
                        multi =(float) 0.75;
                        break;
                   
                    case "E":
                        multi =(float) 0.00;
                        break;
                }
                
                float current = credit*multi;
                total = total+current;
               // System.out.println(total);
            }
            
            gpa = total/numbserOfCredits;
            System.out.println("tot = "+total);
            System.out.println("GPA = "+gpa);
        
        return gpa;
    }
    
    public String getClass(float gpa){
        String msg ="";
        if(gpa>3.5){
            msg="Congratulations!!! You Have First class Degree";
        }else if(gpa>3.25){
            msg="Congratulations!!! You Have Second Upper Degree";
        }else if(gpa>3.0){
            msg="Congratulations!!! You Have Second Lower Degree";
        }else if(gpa>2.0){
            msg="Congratulations!!! You Have Simple Pass Degree";
        }else{
            msg = "Sorry!!! You are not pass the Degree";
        }
        return msg;
    }

}
