/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.zielu.fun.friendsteaser;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Tomasz Zielinski <tomasz.zielinski@ed.ac.uk>
 */
public class MessagePrinter {
    
    public static void main(String[] args) { 
        MessagePrinter instance = new MessagePrinter();
        instance.run();
    } 
    
    public void run() {
        // http://www.network-science.de/ascii/
        List<String> lines = Arrays.asList(
            "***********",
            "*********************",
            "",
"    JJJ",                                     
"    JJJ   eee  rr rr   oooo    eee  nn nnn",  
"    JJJ ee   e rrr  r oo  oo ee   e nnn  nn", 
"JJ  JJJ eeeee  rr     oo  oo eeeee  nn   nn", 
" JJJJJ   eeeee rr      oooo   eeeee nn   nn",
"",
"   ...",
"",
"WW      WW iii lll lll", 
"WW      WW     lll lll", 
"WW   W  WW iii lll lll", 
" WW WWW WW iii lll lll", 
"  WW   WW  iii lll lll",
"",
"   ...",
"",
"TTTTTTT                           kk",     
"  TTT    oooo  mm mm mmmm    eee  kk  kk", 
"  TTT   oo  oo mmm  mm  mm ee   e kkkkk",  
"  TTT   oo  oo mmm  mm  mm eeeee  kk kk",  
"  TTT    oooo  mmm  mm  mm  eeeee kk  kk ",
          "",
            "******************************",
            "****************************************"
        
        );
        
        print(lines);
    }

    void print(List<String> lines) {
        print(lines, 10);
    }

    void print(List<String> lines, int delay) {
        
        for (String line: lines) {
            print(line, delay);
            System.out.println();
        }
    }

    void print(String line, int delay) {
        
        Random rnd = new Random();
        line.chars().forEach( ch -> {
            try {
                Thread.sleep(delay+(long)(rnd.nextDouble()*2.0*delay));
                System.out.print((char)ch);
                System.out.flush();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
