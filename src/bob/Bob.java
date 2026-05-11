
package bob;

import java.util.Scanner;
public class Bob {
 
  
    public static void main(String[] args) {
        String svara;
        int svar;
        int tur = 0;
        Scanner input= new Scanner(System.in);
        System.out.println("hur många spelare är ni ");
        int spelare = input.nextInt();
        input.nextLine();
        int[]plats = new int[spelare];
        String[] namn = new String[spelare];
        for (int i = 0; i < namn.length; i++) {
            System.out.println("namn på spelare " + i);
            namn[i] = input.nextLine();
        } 
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("det är spelare " + namn[tur]);
            int  tärning = (int)(Math.random()*6 + 1);
            System.out.println("du slog en " +tärning);
            plats[tur] = plats[tur] + tärning;
               
           //räkna platsen upp tills nån har vunnit   
           if (plats[tur] <= 100) {
                System.out.println("du är på plats " + plats[tur]);
                
               
                //händelse block som låter användare ha lite roligt 
                if (plats[tur] == 2) {
                    System.out.println("här händer +2 om du får rätt");
                    System.out.println("vad är 2 + 2");
                    svar = input.nextInt();
                    if (svar==4) {
             
                       plats[tur]+=2;  
                        System.out.println("du fick rätt");
                    }
                    else{
                         plats[tur]--; 
                        System.out.println("du fick fel");
                        System.out.println("och gick bak ett steg");
                    }
                   
                    System.out.println("du är på plats " + plats[tur]);
                   
                }
                // den slumpar tre tärningar som ska bli större än 15 eller mindre än 10
                else if (plats[tur] == 77) {
                    System.out.println("här är det -7 om du fått otur ");
                    int a  = (int)(Math.random()*6 + 1);
                    int b  = (int)(Math.random()*6 + 1);
                    int c  = (int)(Math.random()*6 + 1);
                      System.out.println("summan blev " + a+b+c);
                    if (a+b+c >=15) {
                        plats[tur]+=7; 
                        System.out.println("du fick tur");
                        
                    }
                    else if(a+b+c <= 10)  {
                        plats[tur]-=7; 
                        System.out.println("du fick otur");
                    }
                  
                    System.out.println("du är på plats " + plats[tur]);  
                }
                // den låter spelarna svara på en fråga om jorden 
                else if (plats[tur] == 7) {
                    System.out.println("här är det -2 om du får fel på denna fråga");
                    System.out.println("vad är det största landet");
                    svara = input.nextLine();
                    if (svara.equals("ryssland") ) {
                        plats[tur]+=2;
                        System.out.println("du fick rätt");
                    }
                    else{
                    plats[tur]-=2;
                        System.out.println("du fick fel");
                    }
                    
                    System.out.println("du är på plats " + plats[tur]); 
                } 
                //den kollar om man fått yatzy och om man inte fått då är det inte yatzy
                else if (plats[tur] == 15) {
                    System.out.println("här är det +1 om du får yatzy");
                    boolean yatzy = false;
                    for (int j = 0; j < 3; j++) {
                    
                    int a  = (int)(Math.random()*6 + 1);
                    int b  = (int)(Math.random()*6 + 1);
                    int c  = (int)(Math.random()*6 + 1);
                    int d  = (int)(Math.random()*6 + 1);
                    int e  = (int)(Math.random()*6 + 1);
                    System.out.print(a);
                    System.out.print(b);
                    System.out.print(c);
                    System.out.print(d);
                    System.out.println(e);
                    if (a==b && b==c && c==d && d==e ) {
                        yatzy = true;
                        plats[tur]++; 
                        System.out.println("du fick yatzy +1");
                        break;
                    }
                      
                    }
                    if (yatzy == false) {
                         plats[tur]--; 
                         System.out.println("du fick inte yatzy -1");
                    }
                  
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 28) {
                    System.out.println("här är det +3");
                    plats[tur]+=3;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 41) {
                    System.out.println("här är det -10");
                    plats[tur]-=10;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur]== 59) {
                    System.out.println("här är det +5");
                    plats[tur]+=5;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 64) {
                    System.out.println("här är det -7");
                    plats[tur]-=7;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 82) {
                    System.out.println("här är det +11");
                    plats[tur]+=11;
                    System.out.println("du är på plats " + plats[tur]);
                }
                else if (plats[tur] == 99) {
                    System.out.println("här är det -40");
                    plats[tur]-=40;
                    System.out.println("du är på plats " + plats[tur]);
                }
            // vinst markör        
            }
           else if (plats[tur] >= 100) {
               
               
               break;
            }
           //startar om cykeln av spelare
           tur++;
            if (tur ==namn.length) {
              tur=0;  
            }
           
        }
        System.out.println(namn[tur] + " vann");
        
       
    }
    
}
