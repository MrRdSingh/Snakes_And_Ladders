
package snake_game;

import java.awt.Color;
import java.util.Random;
import javax.swing.text.Highlighter;
public class game extends javax.swing.JFrame {

    public game() {
        initComponents();
        
        show.setText(enter_in.ply1name +"   #");
        show2.setText(enter_in.ply2name+""+enter_in.ply2);
        dice.setVisible(false);
        s_pic.setVisible(false);
        l_pic.setVisible(false);
       w_pic.setVisible(false); 
       
    }
    
    static String dics;
    static int t=1;
    static int point1=0,point2=0;
    static int t1=0,t2=0;
    static Highlighter h;
    
    public void compare1(int i)
    { switch (i) {
            case 1:
                a1.setText(enter_in.ply1);       
                a1.setHighlighter(h);
                a1.setForeground(Color.red);
                a1.setBackground(Color.WHITE);
               break;
            case 2:
                a2.setText(enter_in.ply1);      
                a2.setHighlighter(h);           
                a2.setForeground(Color.red);     
                a2.setBackground(Color.WHITE);
                break;
            case 3:
                a3.setText(enter_in.ply1);      
                a3.setHighlighter(h);          
                a3.setForeground(Color.red);
                a3.setBackground(Color.WHITE);
                break;
            case 4:
                a4.setText(enter_in.ply1);      
                a4.setHighlighter(h);        
                a4.setForeground(Color.red);      
                a4.setBackground(Color.WHITE);
                break;
            case 5:
                a5.setText(enter_in.ply1);    
                a5.setHighlighter(h);       
                a5.setForeground(Color.red);  
                a5.setBackground(Color.WHITE);
                break;
            case 6:
                a6.setText(enter_in.ply1);  
                a6.setHighlighter(h);        
                a6.setForeground(Color.red);    
                a6.setBackground(Color.WHITE);
                break;
            case 7:
                a7.setText(enter_in.ply1);      
                a7.setHighlighter(h);           
                a7.setForeground(Color.red);    
                a7.setBackground(Color.WHITE);
                break;
            case 8:
                a8.setText(enter_in.ply1);    
                a8.setHighlighter(h);         
                a8.setForeground(Color.red);    
                a8.setBackground(Color.WHITE);
                break;
            case 9:
                a9.setText(enter_in.ply1);    
                a9.setHighlighter(h);          
                a9.setForeground(Color.red);   
                a9.setBackground(Color.WHITE);
                break;
            case 10:
                a10.setText(enter_in.ply1);    
                a10.setHighlighter(h);           
                a10.setForeground(Color.red);     
                a10.setBackground(Color.WHITE);
                break;
            case 11:
                a11.setText(enter_in.ply1);     
                a11.setHighlighter(h);           
                a11.setForeground(Color.red);     
                a11.setBackground(Color.WHITE);
                break;
            case 12:
                a12.setText(enter_in.ply1);    
                a12.setHighlighter(h);           
                a12.setForeground(Color.red);     
                a12.setBackground(Color.WHITE);
                break;
            case 13:
                a13.setText(enter_in.ply1);     
                a13.setHighlighter(h);           
                a13.setForeground(Color.red);       
                a13.setBackground(Color.WHITE);
                break;
            case 14:
                a14.setText(enter_in.ply1); 
                a14.setHighlighter(h);    
                a14.setForeground(Color.red);   
                a14.setBackground(Color.WHITE);
                break;
            case 15:
                a15.setText(enter_in.ply1);   
                a15.setHighlighter(h);         
                a15.setForeground(Color.red);     
                a15.setBackground(Color.WHITE);
                break;
            case 16:
                a16.setText(enter_in.ply1);  
                a16.setHighlighter(h);         
                a16.setForeground(Color.red);    
                a16.setBackground(Color.WHITE);
                break;
            case 17:
                a17.setText(enter_in.ply1);    
                a17.setHighlighter(h);          
                a17.setForeground(Color.red);    
                a17.setBackground(Color.WHITE);
                break;
            case 18:
                a18.setText(enter_in.ply1);    
                a18.setHighlighter(h);          
                a18.setForeground(Color.red);     
                a18.setBackground(Color.WHITE);
                break;
            case 19:
                a19.setText(enter_in.ply1);     
                a19.setHighlighter(h);      
                a19.setForeground(Color.red);    
                a19.setBackground(Color.WHITE);
                break;
            case 20:
                a20.setText(enter_in.ply1);    
                a20.setForeground(Color.red);    
                a20.setBackground(Color.WHITE);
                break;
            case 21:
                a21.setText(enter_in.ply1);    
                a21.setForeground(Color.red);    
                a21.setBackground(Color.WHITE);
                
                break;
            case 22:
                a22.setText(enter_in.ply1);       
                a22.setForeground(Color.red);     
                a22.setBackground(Color.WHITE);
               
                break;
            case 23:
                a23.setText(enter_in.ply1);       
                 a23.setForeground(Color.red);     
                a23.setBackground(Color.WHITE);
               
                break;
            case 24:
                a24.setText(enter_in.ply1);       
                 a24.setForeground(Color.red);     
                a24.setBackground(Color.WHITE);
               
                break;
            case 25:
                a25.setText(enter_in.ply1);       
                a25.setForeground(Color.red);     
                a25.setBackground(Color.WHITE);
               
                break;
            case 26:
                a26.setText(enter_in.ply1);       
                 a26.setForeground(Color.red);     
                a26.setBackground(Color.WHITE);
               
                break;
            case 27:
                a27.setText(enter_in.ply1);       
                 a27.setForeground(Color.red);     
                a27.setBackground(Color.WHITE);
               
                break;
            case 28:
                a28.setText(enter_in.ply1);       
                 a28.setForeground(Color.red);     
                a28.setBackground(Color.WHITE);
               
                break;
            case 29:
                a29.setText(enter_in.ply1);       
                 a29.setForeground(Color.red);     
                a29.setBackground(Color.WHITE);
               
                break;
            case 30:
                a30.setText(enter_in.ply1);       
                 a30.setForeground(Color.red);     
                a30.setBackground(Color.WHITE);
               
                break;
            case 31:
                a31.setText(enter_in.ply1);       
                 a31.setForeground(Color.red);     
                a31.setBackground(Color.WHITE);
               
                break;
            case 32:
                a32.setText(enter_in.ply1);       
                 a32.setForeground(Color.red);     
                a32.setBackground(Color.WHITE);
               
                break;
            case 33:
                a33.setText(enter_in.ply1);       
                 a33.setForeground(Color.red);     
                a33.setBackground(Color.WHITE);
               
                break;
            case 34:
                a34.setText(enter_in.ply1);       
                 a34.setForeground(Color.red);     
                a34.setBackground(Color.WHITE);
               
                break;
            case 35:
                a35.setText(enter_in.ply1);       
                 a35.setForeground(Color.red);     
                a35.setBackground(Color.WHITE);
               
                break;
            case 36:
                a36.setText(enter_in.ply1);       
                a36.setForeground(Color.red);     
                a36.setBackground(Color.WHITE);
               
                break;
            case 37:
                a37.setText(enter_in.ply1);       
                 a37.setForeground(Color.red);     
                a37.setBackground(Color.WHITE);
               
                break;
            case 38:
                a38.setText(enter_in.ply1);       
                 a38.setForeground(Color.red);     
                a38.setBackground(Color.WHITE);
               
                break;
            case 39:
                a39.setText(enter_in.ply1);       
                 a39.setForeground(Color.red);     
                a39.setBackground(Color.WHITE);
               
                break;
            case 40:
                a40.setText(enter_in.ply1);       
                 a40.setForeground(Color.red);     
                a40.setBackground(Color.WHITE);
               
                break;
            case 41:
                a41.setText(enter_in.ply1);       
                a41.setForeground(Color.red);     
                a41.setBackground(Color.WHITE);
               
                break;
            case 42:
                a42.setText(enter_in.ply1);       
                a42.setForeground(Color.red);     
                a42.setBackground(Color.WHITE);
               
                break;
            case 43:
                a43.setText(enter_in.ply1);       
                a43.setForeground(Color.red);     
                a43.setBackground(Color.WHITE);
               
                break;
            case 44:
                a44.setText(enter_in.ply1);       
                a44.setForeground(Color.red);     
                a44.setBackground(Color.WHITE);
               
                break;
            case 45:
                a45.setText(enter_in.ply1);       
                a45.setForeground(Color.red);     
                a45.setBackground(Color.WHITE);
               
                break;
            case 46:
                a46.setText(enter_in.ply1);       
                a46.setForeground(Color.red);     
                a46.setBackground(Color.WHITE);
               
                break;
            case 47:
                a47.setText(enter_in.ply1);       
                a47.setForeground(Color.red);     
                a47.setBackground(Color.WHITE);
               
                break;
            case 48:
                a48.setText(enter_in.ply1);       
                a48.setForeground(Color.red);     
                a48.setBackground(Color.WHITE);
               
                break;
            case 49:
                a49.setText(enter_in.ply1);       
                a49.setForeground(Color.red);     
                a49.setBackground(Color.WHITE);
               
                break;
            case 50:
                a50.setText(enter_in.ply1);       
                a50.setForeground(Color.red);     
                a50.setBackground(Color.WHITE);
               
                break;
            case 51:
                a51.setText(enter_in.ply1);       
                a51.setForeground(Color.red);     
                a51.setBackground(Color.WHITE);
               
                break;
            case 52:
                a52.setText(enter_in.ply1);       
                a52.setForeground(Color.red);     
                a52.setBackground(Color.WHITE);
               
                break;
            case 53:
                a53.setText(enter_in.ply1);       
                a53.setForeground(Color.red);     
                a53.setBackground(Color.WHITE);
               
                break;
            case 54:
                a54.setText(enter_in.ply1);       
                a54.setForeground(Color.red);     
                a54.setBackground(Color.WHITE);
               
                break;
            case 55:
                a55.setText(enter_in.ply1);       
                a55.setForeground(Color.red);     
                a55.setBackground(Color.WHITE);
               
                break;
            case 56:
                a56.setText(enter_in.ply1);       
                a56.setForeground(Color.red);     
                a56.setBackground(Color.WHITE);
               
                break;
            case 57:
                a57.setText(enter_in.ply1);       
                a57.setForeground(Color.red);     
                a57.setBackground(Color.WHITE);
               
                break;
            case 58:
                a58.setText(enter_in.ply1);       
                a58.setForeground(Color.red);     
                a58.setBackground(Color.WHITE);
               
                break;
            case 59:
                a59.setText(enter_in.ply1);       
                a59.setForeground(Color.red);     
                a59.setBackground(Color.WHITE);
               
                break;
            case 60:
                a60.setText(enter_in.ply1);       
                a60.setForeground(Color.red);     
                a60.setBackground(Color.WHITE);
               
                break;
            case 61:
                a61.setText(enter_in.ply1);       
                 a61.setForeground(Color.red);     
                a61.setBackground(Color.WHITE);
               
                break;
            case 62:
                a62.setText(enter_in.ply1);       
                 a62.setForeground(Color.red);     
                a62.setBackground(Color.WHITE);
               
                break;
            case 63:
                a63.setText(enter_in.ply1);       
                 a63.setForeground(Color.red);     
                a63.setBackground(Color.WHITE);
               
                break;
            case 64:
                a64.setText(enter_in.ply1);       
                 a64.setForeground(Color.red);     
                a64.setBackground(Color.WHITE);
               
                break;
            case 65:
                a65.setText(enter_in.ply1);       
                a65.setForeground(Color.red);     
                a65.setBackground(Color.WHITE);
               
                break;
            case 66:
                a66.setText(enter_in.ply1);       
                 a66.setForeground(Color.red);     
                a66.setBackground(Color.WHITE);
               
                break;
            case 67:
                a67.setText(enter_in.ply1);       
                 a67.setForeground(Color.red);     
                a67.setBackground(Color.WHITE);
               
                break;
            case 68:
                a68.setText(enter_in.ply1);       
                 a68.setForeground(Color.red);     
                a68.setBackground(Color.WHITE);
               
                break;
            case 69:
                a69.setText(enter_in.ply1);       
                 a69.setForeground(Color.red);     
                a69.setBackground(Color.WHITE);
               
                break;
            case 70:
                a70.setText(enter_in.ply1);       
                 a70.setForeground(Color.red);     
                a70.setBackground(Color.WHITE);
               
                break;
            case 71:
                a71.setText(enter_in.ply1);       
                a71.setForeground(Color.red);     
                a71.setBackground(Color.WHITE);
               
                break;
            case 72:
                a72.setText(enter_in.ply1);       
                a72.setForeground(Color.red);     
                a72.setBackground(Color.WHITE);
               
                break;
            case 73:
                a73.setText(enter_in.ply1);       
                a73.setForeground(Color.red);     
                a73.setBackground(Color.WHITE);
               
                break;
            case 74:
                a74.setText(enter_in.ply1);       
                a74.setForeground(Color.red);     
                a74.setBackground(Color.WHITE);
               
                break;
            case 75:
                a75.setText(enter_in.ply1);       
                a75.setForeground(Color.red);     
                a75.setBackground(Color.WHITE);
               
                break;
            case 76:
                a76.setText(enter_in.ply1);       
                a76.setForeground(Color.red);     
                a76.setBackground(Color.WHITE);
               
                break;
            case 77:
                a77.setText(enter_in.ply1);       
                a77.setForeground(Color.red);     
                a77.setBackground(Color.WHITE);
               
                break;
            case 78:
                a78.setText(enter_in.ply1);       
                a78.setForeground(Color.red);     
                a78.setBackground(Color.WHITE);
               
                break;
            case 79:
                a79.setText(enter_in.ply1);       
                a79.setForeground(Color.red);     
                a79.setBackground(Color.WHITE);
               
                break;
            case 80:
                a80.setText(enter_in.ply1);       
                a80.setForeground(Color.red);     
                a80.setBackground(Color.WHITE);
               
                break;
            case 81:
                a81.setText(enter_in.ply1);       
                a81.setForeground(Color.red);     
                a81.setBackground(Color.WHITE);
               
                break;
            case 82:
                a82.setText(enter_in.ply1);       
                a82.setForeground(Color.red);     
                a82.setBackground(Color.WHITE);
               
                break;
            case 83:
                a83.setText(enter_in.ply1);       
                a83.setForeground(Color.red);     
                a83.setBackground(Color.WHITE);
               
                break;
            case 84:
                a84.setText(enter_in.ply1);       
                a84.setForeground(Color.red);     
                a84.setBackground(Color.WHITE);
               
                break;
            case 85:
                a85.setText(enter_in.ply1);       
                a85.setForeground(Color.red);     
                a85.setBackground(Color.WHITE);
               
                break;
            case 86:
                a86.setText(enter_in.ply1);       
                a86.setForeground(Color.red);     
                a86.setBackground(Color.WHITE);
               
                break;
            case 87:
                a87.setText(enter_in.ply1);       
                a87.setForeground(Color.red);     
                a87.setBackground(Color.WHITE);
               
                break;
            case 88:
                a88.setText(enter_in.ply1);       
                a88.setForeground(Color.red);     
                a88.setBackground(Color.WHITE);
               
                break;
            case 89:
                a89.setText(enter_in.ply1);       
                a89.setForeground(Color.red);     
                a89.setBackground(Color.WHITE);
               
                break;
            case 90:
                a90.setText(enter_in.ply1);       
                a90.setForeground(Color.red);     
                a90.setBackground(Color.WHITE);
               
                break;
            case 91:
                a91.setText(enter_in.ply1);       
                a91.setForeground(Color.red);     
                a91.setBackground(Color.WHITE);
               
                break;
            case 92:
                a92.setText(enter_in.ply1);       
                a92.setForeground(Color.red);     
                a92.setBackground(Color.WHITE);
               
                break;
            case 93:
                a93.setText(enter_in.ply1);       
                a93.setForeground(Color.red);     
                a93.setBackground(Color.WHITE);
               
                break;
            case 94:
                a94.setText(enter_in.ply1);       
                a94.setForeground(Color.red);     
                a94.setBackground(Color.WHITE);
               
                break;
            case 95:
                a95.setText(enter_in.ply1);       
                a95.setForeground(Color.red);     
                a95.setBackground(Color.WHITE);
               
                break;
            case 96:
                a96.setText(enter_in.ply1);       
                a96.setForeground(Color.red);     
                a96.setBackground(Color.WHITE);
               
                break;
            case 97:
                a97.setText(enter_in.ply1);       
                a97.setForeground(Color.red);     
                a97.setBackground(Color.WHITE);
               
                break;
            case 98:
                a98.setText(enter_in.ply1);       
                a98.setForeground(Color.red);     
                a98.setBackground(Color.WHITE);
               
                break;
            case 99:
                a99.setText(enter_in.ply1);       
                a99.setForeground(Color.red);     
                a99.setBackground(Color.WHITE);
               
                break;
            case 100:
                a100.setText("Win");
             a100.setForeground(Color.red);     
                a100.setBackground(Color.WHITE);
               
                //  show.setText(enter_in.ply1+" Congratulations ...you win");
                
                break;
            default:
                break;
        
        }
       
    }
      public void compare2(int i)
    {  
        switch (i) {
            case 1:
                a1.setText(enter_in.ply2);       
                a1.setHighlighter(h);
                a1.setForeground(Color.blue);
                a1.setBackground(Color.WHITE);
               break;
            case 2:
                a2.setText(enter_in.ply2);      
                a2.setHighlighter(h);           
                a2.setForeground(Color.blue);     
                a2.setBackground(Color.WHITE);
                break;
            case 3:
                a3.setText(enter_in.ply2);      
                a3.setHighlighter(h);          
                a3.setForeground(Color.blue);
                a3.setBackground(Color.WHITE);
                break;
            case 4:
                a4.setText(enter_in.ply2);      
                a4.setHighlighter(h);        
                a4.setForeground(Color.blue);      
                a4.setBackground(Color.WHITE);
                break;
            case 5:
                a5.setText(enter_in.ply2);    
                a5.setHighlighter(h);       
                a5.setForeground(Color.blue);  
                a5.setBackground(Color.WHITE);
                break;
            case 6:
                a6.setText(enter_in.ply2);  
                a6.setHighlighter(h);        
                a6.setForeground(Color.blue);    
                a6.setBackground(Color.WHITE);
                break;
            case 7:
                a7.setText(enter_in.ply2);      
                a7.setHighlighter(h);           
                a7.setForeground(Color.blue);    
                a7.setBackground(Color.WHITE);
                break;
            case 8:
                a8.setText(enter_in.ply2);    
                a8.setHighlighter(h);         
                a8.setForeground(Color.blue);    
                a8.setBackground(Color.WHITE);
                break;
            case 9:
                a9.setText(enter_in.ply2);    
                a9.setHighlighter(h);          
                a9.setForeground(Color.blue);   
                a9.setBackground(Color.WHITE);
                break;
            case 10:
                a10.setText(enter_in.ply2);    
                a10.setHighlighter(h);           
                a10.setForeground(Color.blue);     
                a10.setBackground(Color.WHITE);
                break;
            case 11:
                a11.setText(enter_in.ply2);     
                a11.setHighlighter(h);           
                a11.setForeground(Color.blue);     
                a11.setBackground(Color.WHITE);
                break;
            case 12:
                a12.setText(enter_in.ply2);    
                a12.setHighlighter(h);           
                a12.setForeground(Color.blue);     
                a12.setBackground(Color.WHITE);
                break;
            case 13:
                a13.setText(enter_in.ply2);     
                a13.setHighlighter(h);           
                a13.setForeground(Color.blue);       
                a13.setBackground(Color.WHITE);
                break;
            case 14:
                a14.setText(enter_in.ply2); 
                a14.setHighlighter(h);    
                a14.setForeground(Color.blue);   
                a14.setBackground(Color.WHITE);
                break;
            case 15:
                a15.setText(enter_in.ply2);   
                a15.setHighlighter(h);         
                a15.setForeground(Color.blue);     
                a15.setBackground(Color.WHITE);
                break;
            case 16:
                a16.setText(enter_in.ply2);  
                a16.setHighlighter(h);         
                a16.setForeground(Color.blue);    
                a16.setBackground(Color.WHITE);
                break;
            case 17:
                a17.setText(enter_in.ply2);    
                a17.setHighlighter(h);          
                a17.setForeground(Color.blue);    
                a17.setBackground(Color.WHITE);
                break;
            case 18:
                a18.setText(enter_in.ply2);    
                a18.setHighlighter(h);          
                a18.setForeground(Color.blue);     
                a18.setBackground(Color.WHITE);
                break;
            case 19:
                a19.setText(enter_in.ply2);     
                a19.setHighlighter(h);      
                a19.setForeground(Color.blue);    
                a19.setBackground(Color.WHITE);
                break;
            case 20:
                a20.setText(enter_in.ply2);    
                a20.setForeground(Color.blue);    
                a20.setBackground(Color.WHITE);
                break;
            case 21:
                a21.setText(enter_in.ply2);    
                a21.setForeground(Color.blue);    
                a21.setBackground(Color.WHITE);
                
                break;
            case 22:
                a22.setText(enter_in.ply2);       
                a22.setForeground(Color.blue);     
                a22.setBackground(Color.WHITE);
               
                break;
            case 23:
                a23.setText(enter_in.ply2);       
                 a23.setForeground(Color.blue);     
                a23.setBackground(Color.WHITE);
               
                break;
            case 24:
                a24.setText(enter_in.ply2);       
                 a24.setForeground(Color.blue);     
                a24.setBackground(Color.WHITE);
               
                break;
            case 25:
                a25.setText(enter_in.ply2);       
                a25.setForeground(Color.blue);     
                a25.setBackground(Color.WHITE);
               
                break;
            case 26:
                a26.setText(enter_in.ply2);       
                 a26.setForeground(Color.blue);     
                a26.setBackground(Color.WHITE);
               
                break;
            case 27:
                a27.setText(enter_in.ply2);       
                 a27.setForeground(Color.blue);     
                a27.setBackground(Color.WHITE);
               
                break;
            case 28:
                a28.setText(enter_in.ply2);       
                 a28.setForeground(Color.blue);     
                a28.setBackground(Color.WHITE);
               
                break;
            case 29:
                a29.setText(enter_in.ply2);       
                 a29.setForeground(Color.blue);     
                a29.setBackground(Color.WHITE);
               
                break;
            case 30:
                a30.setText(enter_in.ply2);       
                 a30.setForeground(Color.blue);     
                a30.setBackground(Color.WHITE);
               
                break;
            case 31:
                a31.setText(enter_in.ply2);       
                 a31.setForeground(Color.blue);     
                a31.setBackground(Color.WHITE);
               
                break;
            case 32:
                a32.setText(enter_in.ply2);       
                 a32.setForeground(Color.blue);     
                a32.setBackground(Color.WHITE);
               
                break;
            case 33:
                a33.setText(enter_in.ply2);       
                 a33.setForeground(Color.blue);     
                a33.setBackground(Color.WHITE);
               
                break;
            case 34:
                a34.setText(enter_in.ply2);       
                 a34.setForeground(Color.blue);     
                a34.setBackground(Color.WHITE);
               
                break;
            case 35:
                a35.setText(enter_in.ply2);       
                 a35.setForeground(Color.blue);     
                a35.setBackground(Color.WHITE);
               
                break;
            case 36:
                a36.setText(enter_in.ply2);       
                a36.setForeground(Color.blue);     
                a36.setBackground(Color.WHITE);
               
                break;
            case 37:
                a37.setText(enter_in.ply2);       
                 a37.setForeground(Color.blue);     
                a37.setBackground(Color.WHITE);
               
                break;
            case 38:
                a38.setText(enter_in.ply2);       
                 a38.setForeground(Color.blue);     
                a38.setBackground(Color.WHITE);
               
                break;
            case 39:
                a39.setText(enter_in.ply2);       
                 a39.setForeground(Color.blue);     
                a39.setBackground(Color.WHITE);
               
                break;
            case 40:
                a40.setText(enter_in.ply2);       
                 a40.setForeground(Color.blue);     
                a40.setBackground(Color.WHITE);
               
                break;
            case 41:
                a41.setText(enter_in.ply2);       
                a41.setForeground(Color.blue);     
                a41.setBackground(Color.WHITE);
               
                break;
            case 42:
                a42.setText(enter_in.ply2);       
                a42.setForeground(Color.blue);     
                a42.setBackground(Color.WHITE);
               
                break;
            case 43:
                a43.setText(enter_in.ply2);       
                a43.setForeground(Color.blue);     
                a43.setBackground(Color.WHITE);
               
                break;
            case 44:
                a44.setText(enter_in.ply2);       
                a44.setForeground(Color.blue);     
                a44.setBackground(Color.WHITE);
               
                break;
            case 45:
                a45.setText(enter_in.ply2);       
                a45.setForeground(Color.blue);     
                a45.setBackground(Color.WHITE);
               
                break;
            case 46:
                a46.setText(enter_in.ply2);       
                a46.setForeground(Color.blue);     
                a46.setBackground(Color.WHITE);
               
                break;
            case 47:
                a47.setText(enter_in.ply2);       
                a47.setForeground(Color.blue);     
                a47.setBackground(Color.WHITE);
               
                break;
            case 48:
                a48.setText(enter_in.ply2);       
                a48.setForeground(Color.blue);     
                a48.setBackground(Color.WHITE);
               
                break;
            case 49:
                a49.setText(enter_in.ply2);       
                a49.setForeground(Color.blue);     
                a49.setBackground(Color.WHITE);
               
                break;
            case 50:
                a50.setText(enter_in.ply2);       
                a50.setForeground(Color.blue);     
                a50.setBackground(Color.WHITE);
               
                break;
            case 51:
                a51.setText(enter_in.ply2);       
                a51.setForeground(Color.blue);     
                a51.setBackground(Color.WHITE);
               
                break;
            case 52:
                a52.setText(enter_in.ply2);       
                a52.setForeground(Color.blue);     
                a52.setBackground(Color.WHITE);
               
                break;
            case 53:
                a53.setText(enter_in.ply2);       
                a53.setForeground(Color.blue);     
                a53.setBackground(Color.WHITE);
               
                break;
            case 54:
                a54.setText(enter_in.ply2);       
                a54.setForeground(Color.blue);     
                a54.setBackground(Color.WHITE);
               
                break;
            case 55:
                a55.setText(enter_in.ply2);       
                a55.setForeground(Color.blue);     
                a55.setBackground(Color.WHITE);
               
                break;
            case 56:
                a56.setText(enter_in.ply2);       
                a56.setForeground(Color.blue);     
                a56.setBackground(Color.WHITE);
               
                break;
            case 57:
                a57.setText(enter_in.ply2);       
                a57.setForeground(Color.blue);     
                a57.setBackground(Color.WHITE);
               
                break;
            case 58:
                a58.setText(enter_in.ply2);       
                a58.setForeground(Color.blue);     
                a58.setBackground(Color.WHITE);
               
                break;
            case 59:
                a59.setText(enter_in.ply2);       
                a59.setForeground(Color.blue);     
                a59.setBackground(Color.WHITE);
               
                break;
            case 60:
                a60.setText(enter_in.ply2);       
                a60.setForeground(Color.blue);     
                a60.setBackground(Color.WHITE);
               
                break;
            case 61:
                a61.setText(enter_in.ply2);       
                 a61.setForeground(Color.blue);     
                a61.setBackground(Color.WHITE);
               
                break;
            case 62:
                a62.setText(enter_in.ply2);       
                 a62.setForeground(Color.blue);     
                a62.setBackground(Color.WHITE);
               
                break;
            case 63:
                a63.setText(enter_in.ply2);       
                 a63.setForeground(Color.blue);     
                a63.setBackground(Color.WHITE);
               
                break;
            case 64:
                a64.setText(enter_in.ply2);       
                 a64.setForeground(Color.blue);     
                a64.setBackground(Color.WHITE);
               
                break;
            case 65:
                a65.setText(enter_in.ply2);       
                a65.setForeground(Color.blue);     
                a65.setBackground(Color.WHITE);
               
                break;
            case 66:
                a66.setText(enter_in.ply2);       
                 a66.setForeground(Color.blue);     
                a66.setBackground(Color.WHITE);
               
                break;
            case 67:
                a67.setText(enter_in.ply2);       
                 a67.setForeground(Color.blue);     
                a67.setBackground(Color.WHITE);
               
                break;
            case 68:
                a68.setText(enter_in.ply2);       
                 a68.setForeground(Color.blue);     
                a68.setBackground(Color.WHITE);
               
                break;
            case 69:
                a69.setText(enter_in.ply2);       
                 a69.setForeground(Color.blue);     
                a69.setBackground(Color.WHITE);
               
                break;
            case 70:
                a70.setText(enter_in.ply2);       
                 a70.setForeground(Color.blue);     
                a70.setBackground(Color.WHITE);
               
                break;
            case 71:
                a71.setText(enter_in.ply2);       
                a71.setForeground(Color.blue);     
                a71.setBackground(Color.WHITE);
               
                break;
            case 72:
                a72.setText(enter_in.ply2);       
                a72.setForeground(Color.blue);     
                a72.setBackground(Color.WHITE);
               
                break;
            case 73:
                a73.setText(enter_in.ply2);       
                a73.setForeground(Color.blue);     
                a73.setBackground(Color.WHITE);
               
                break;
            case 74:
                a74.setText(enter_in.ply2);       
                a74.setForeground(Color.blue);     
                a74.setBackground(Color.WHITE);
               
                break;
            case 75:
                a75.setText(enter_in.ply2);       
                a75.setForeground(Color.blue);     
                a75.setBackground(Color.WHITE);
               
                break;
            case 76:
                a76.setText(enter_in.ply2);       
                a76.setForeground(Color.blue);     
                a76.setBackground(Color.WHITE);
               
                break;
            case 77:
                a77.setText(enter_in.ply2);       
                a77.setForeground(Color.blue);     
                a77.setBackground(Color.WHITE);
               
                break;
            case 78:
                a78.setText(enter_in.ply2);       
                a78.setForeground(Color.blue);     
                a78.setBackground(Color.WHITE);
               
                break;
            case 79:
                a79.setText(enter_in.ply2);       
                a79.setForeground(Color.blue);     
                a79.setBackground(Color.WHITE);
               
                break;
            case 80:
                a80.setText(enter_in.ply2);       
                a80.setForeground(Color.blue);     
                a80.setBackground(Color.WHITE);
               
                break;
            case 81:
                a81.setText(enter_in.ply2);       
                a81.setForeground(Color.blue);     
                a81.setBackground(Color.WHITE);
               
                break;
            case 82:
                a82.setText(enter_in.ply2);       
                a82.setForeground(Color.blue);     
                a82.setBackground(Color.WHITE);
               
                break;
            case 83:
                a83.setText(enter_in.ply2);       
                a83.setForeground(Color.blue);     
                a83.setBackground(Color.WHITE);
               
                break;
            case 84:
                a84.setText(enter_in.ply2);       
                a84.setForeground(Color.blue);     
                a84.setBackground(Color.WHITE);
               
                break;
            case 85:
                a85.setText(enter_in.ply2);       
                a85.setForeground(Color.blue);     
                a85.setBackground(Color.WHITE);
               
                break;
            case 86:
                a86.setText(enter_in.ply2);       
                a86.setForeground(Color.blue);     
                a86.setBackground(Color.WHITE);
               
                break;
            case 87:
                a87.setText(enter_in.ply2);       
                a87.setForeground(Color.blue);     
                a87.setBackground(Color.WHITE);
               
                break;
            case 88:
                a88.setText(enter_in.ply2);       
                a88.setForeground(Color.blue);     
                a88.setBackground(Color.WHITE);
               
                break;
            case 89:
                a89.setText(enter_in.ply2);       
                a89.setForeground(Color.blue);     
                a89.setBackground(Color.WHITE);
               
                break;
            case 90:
                a90.setText(enter_in.ply2);       
                a90.setForeground(Color.blue);     
                a90.setBackground(Color.WHITE);
               
                break;
            case 91:
                a91.setText(enter_in.ply2);       
                a91.setForeground(Color.blue);     
                a91.setBackground(Color.WHITE);
               
                break;
            case 92:
                a92.setText(enter_in.ply2);       
                a92.setForeground(Color.blue);     
                a92.setBackground(Color.WHITE);
               
                break;
            case 93:
                a93.setText(enter_in.ply2);       
                a93.setForeground(Color.blue);     
                a93.setBackground(Color.WHITE);
               
                break;
            case 94:
                a94.setText(enter_in.ply2);       
                a94.setForeground(Color.blue);     
                a94.setBackground(Color.WHITE);
               
                break;
            case 95:
                a95.setText(enter_in.ply2);       
                a95.setForeground(Color.blue);     
                a95.setBackground(Color.WHITE);
               
                break;
            case 96:
                a96.setText(enter_in.ply2);       
                a96.setForeground(Color.blue);     
                a96.setBackground(Color.WHITE);
               
                break;
            case 97:
                a97.setText(enter_in.ply2);       
                a97.setForeground(Color.blue);     
                a97.setBackground(Color.WHITE);
               
                break;
            case 98:
                a98.setText(enter_in.ply2);       
                a98.setForeground(Color.blue);     
                a98.setBackground(Color.WHITE);
               
                break;
            case 99:
                a99.setText(enter_in.ply2);       
                a99.setForeground(Color.blue);     
                a99.setBackground(Color.WHITE);
               
                break;
            case 100:
                a100.setText("Win");
             a100.setForeground(Color.blue);     
                a100.setBackground(Color.WHITE);
               
                //  show.setText(enter_in.ply2+" Congratulations ...you win");
                
                break;
            default:
                break;
        
        }
    }

    public void set_back(int i) {
        switch (i) {

            case 1:
                a1.setText("Start");
                a1.setForeground(Color.black);
                a1.setBackground(Color.red);
                break;
            case 2:
                a2.setText("2");
                a2.setForeground(Color.black);
                a2.setBackground(Color.blue);
                break;
            case 3:
                a3.setText("3");
                a3.setForeground(Color.black);
                a3.setBackground(Color.yellow);
                break;
            case 4:
                a4.setText("4");
                a4.setForeground(Color.black);
                a4.setBackground(Color.green);
                break;
            case 5:
                a5.setText("5");
                a5.setForeground(Color.black);
                a5.setBackground(Color.red);
                break;
            case 6:
                a6.setText("6");
                a6.setForeground(Color.black);
                a6.setBackground(Color.blue);
                break;
            case 7:
                a7.setText("Ladder");
                a7.setForeground(Color.black);
                a7.setBackground(Color.yellow);
                break;
            case 8:
                a8.setText("8");
                a8.setForeground(Color.black);
                a8.setBackground(Color.green);
                break;
            case 9:
                a9.setText("9");
                a9.setForeground(Color.black);
                a9.setBackground(Color.red);
                break;
            case 10:
                a10.setText("10");
                a10.setForeground(Color.black);
                a10.setBackground(Color.blue);
                break;
            case 11:
                a11.setText("11");
                a11.setForeground(Color.black);
                a11.setBackground(Color.red);
                break;
            case 12:
                a12.setText("12");
                a12.setForeground(Color.black);
                a12.setBackground(Color.green);
                break;

            case 13:
                a13.setText("13");
                a13.setForeground(Color.black);
                a13.setBackground(Color.yellow);
                break;
            case 14:
                a14.setText("Snake");
                a14.setForeground(Color.black);
                a14.setBackground(Color.blue);
                break;
            case 15:
                a15.setText("15");
                a15.setForeground(Color.black);
                a15.setBackground(Color.red);
                break;
            case 16:
                a16.setText("16");
                a16.setForeground(Color.black);
                a16.setBackground(Color.green);
                break;
            case 17:
                a17.setText("17");
                a17.setForeground(Color.black);
                a17.setBackground(Color.yellow);
                break;
            case 18:
                a18.setText("Ladder");
                a18.setForeground(Color.black);
                a18.setBackground(Color.blue);
                break;
            case 19:
                a19.setText("19");
                a19.setForeground(Color.black);
                a19.setBackground(Color.red);
                break;
            case 20:
                a20.setText("20");
                a20.setForeground(Color.black);
                a20.setBackground(Color.green);
                break;
            case 21:
                a21.setText("21");
                a21.setForeground(Color.black);
                a21.setBackground(Color.yellow);
                break;
            case 22:
                a22.setText("22");
                a22.setForeground(Color.black);
                a22.setBackground(Color.green);
                break;
            case 23:
                a23.setText("23");
                a23.setForeground(Color.black);
                a23.setBackground(Color.red);
                break;
            case 24:
                a24.setText("24");
                a24.setForeground(Color.black);
                a24.setBackground(Color.blue);
                break;
            case 25:
                a25.setText("25");
                a25.setForeground(Color.black);
                a25.setBackground(Color.yellow);
                break;
            case 26:
                a26.setText("26");
                a26.setForeground(Color.black);
                a26.setBackground(Color.green);
                break;
            case 27:
                a27.setText("27");
                a27.setForeground(Color.black);
                a27.setBackground(Color.red);
                break;
            case 28:
                a28.setText("28");
                a28.setForeground(Color.black);
                a28.setBackground(Color.blue);
                break;
            case 29:
                a29.setText("29");
                a29.setForeground(Color.black);
                a29.setBackground(Color.yellow);
                break;
            case 30:
                a30.setText("30");
                a30.setForeground(Color.black);
                a30.setBackground(Color.green);
                break;
            case 31:
                a31.setText("31");
                a31.setForeground(Color.black);
                a31.setBackground(Color.yellow);
                break;
            case 32:
                a32.setText("32");
                a32.setForeground(Color.black);
                a32.setBackground(Color.blue);
                break;
            case 33:
                a33.setText("33");
                a33.setForeground(Color.black);
                a33.setBackground(Color.red);
                break;
            case 34:
                a34.setText("34");
                a34.setForeground(Color.black);
                a34.setBackground(Color.green);
                break;
            case 35:
                a35.setText("Ladder");
                a35.setForeground(Color.pink);
                a35.setBackground(Color.yellow);
                break;
            case 36:
                a36.setText("36");
                a36.setForeground(Color.black);
                a36.setBackground(Color.blue);
                break;
            case 37:
                a37.setText("37");
                a37.setForeground(Color.black);
                a37.setBackground(Color.red);
                break;
            case 38:
                a38.setText("38");
                a38.setForeground(Color.black);
                a38.setBackground(Color.green);
                break;
            case 39:
                a39.setText("Snake");
                a39.setForeground(Color.black);
                a39.setBackground(Color.yellow);
                break;
            case 40:
                a40.setText("40");
                a40.setForeground(Color.black);
                a40.setBackground(Color.blue);
                break;
            case 41:
                a41.setText("41");
                a41.setForeground(Color.black);
                a41.setBackground(Color.red);
                break;
            case 42:
                a42.setText("42");
                a42.setForeground(Color.black);
                a42.setBackground(Color.blue);
                break;
            case 43:
                a43.setText("43");
                a43.setForeground(Color.black);
                a43.setBackground(Color.yellow);
                break;
            case 44:
                a44.setText("44");
                a44.setForeground(Color.black);
                a44.setBackground(Color.green);
                break;
            case 45:
                a45.setText("45");
                a45.setForeground(Color.black);
                a45.setBackground(Color.red);
                break;
            case 46:
                a46.setText("Snake");
                a46.setForeground(Color.black);
                a46.setBackground(Color.blue);
                break;
            case 47:
                a47.setText("47");
                a47.setForeground(Color.black);
                a47.setBackground(Color.yellow);
                break;
            case 48:
                a48.setText("48");
                a48.setForeground(Color.black);
                a48.setBackground(Color.green);
                break;
            case 49:
                a49.setText("49");
                a49.setForeground(Color.black);
                a49.setBackground(Color.red);
                break;
            case 50:
                a50.setText("50");
                a50.setForeground(Color.black);
                a50.setBackground(Color.blue);
                break;
            case 51:
                a51.setText("51");
                a51.setForeground(Color.black);
                a51.setBackground(Color.red);
                break;
            case 52:
                a52.setText("52");
                a52.setForeground(Color.black);
                a52.setBackground(Color.green);
                break;
            case 53:
                a53.setText("53");
                a53.setForeground(Color.black);
                a53.setBackground(Color.yellow);
                break;
            case 54:
                a54.setText("54");
                a54.setForeground(Color.black);
                a54.setBackground(Color.blue);
                break;
            case 55:
                a55.setText("Ladder");
                a55.setForeground(Color.black);
                a55.setBackground(Color.red);
                break;
            case 56:
                a56.setText("56");
                a56.setForeground(Color.black);
                a56.setBackground(Color.green);
                break;
            case 57:
                a57.setText("57");
                a57.setForeground(Color.black);
                a57.setBackground(Color.yellow);
                break;
            case 58:
                a58.setText("Snake");
                a58.setForeground(Color.red);
                a58.setBackground(Color.blue);
                break;
            case 59:
                a59.setText("Ladder");
                a59.setForeground(Color.yellow);
                a59.setBackground(Color.red);
                break;
            case 60:
                a60.setText("60");
                a60.setForeground(Color.black);
                a60.setBackground(Color.green);
                break;
            case 61:
                a61.setText("61");
                a61.setForeground(Color.black);
                a61.setBackground(Color.yellow);
                break;
            case 62:
                a62.setText("62");
                a62.setForeground(Color.black);
                a62.setBackground(Color.green);
                break;
            case 63:
                a63.setText("63");
                a63.setForeground(Color.black);
                a63.setBackground(Color.red);
                break;
            case 64:
                a64.setText("64");
                a64.setForeground(Color.black);
                a64.setBackground(Color.blue);
                break;
            case 65:
                a65.setText("65");
                a65.setForeground(Color.black);
                a65.setBackground(Color.yellow);
                break;
            case 66:
                a66.setText("66");
                a66.setForeground(Color.black);
                a66.setBackground(Color.green);
                break;
            case 67:
                a67.setText("67");
                a67.setForeground(Color.black);
                a67.setBackground(Color.red);
                break;
            case 68:
                a68.setText("68");
                a68.setForeground(Color.black);
                a68.setBackground(Color.blue);
                break;
            case 69:
                a69.setText("69");
                a69.setForeground(Color.black);
                a69.setBackground(Color.yellow);
                break;
            case 70:
                a70.setText("70");
                a70.setForeground(Color.black);
                a70.setBackground(Color.green);
                break;
            case 71:
                a71.setText("Ladder");
                a71.setForeground(Color.black);
                a71.setBackground(Color.yellow);
                break;
            case 72:
                a72.setText("72");
                a72.setForeground(Color.black);
                a72.setBackground(Color.blue);
                break;
            case 73:
                a73.setText("73");
                a73.setForeground(Color.black);
                a73.setBackground(Color.red);
                break;
            case 74:
                a74.setText("Snake");
                a74.setForeground(Color.yellow);
                a74.setBackground(Color.green);
                break;
            case 75:
                a75.setText("75");
                a75.setForeground(Color.black);
                a75.setBackground(Color.yellow);
                break;
            case 76:
                a76.setText("76");
                a76.setForeground(Color.black);
                a76.setBackground(Color.blue);
                break;
            case 77:
                a77.setText("77");
                a77.setForeground(Color.black);
                a77.setBackground(Color.red);
                break;
            case 78:
                a78.setText("78");
                a78.setForeground(Color.black);
                a78.setBackground(Color.green);
                break;
            case 79:
                a79.setText("79");
                a79.setForeground(Color.black);
                a79.setBackground(Color.yellow);
                break;
            case 80:
                a80.setText("80");
                a80.setForeground(Color.black);
                a80.setBackground(Color.blue);
                break;
            case 81:
                a81.setText("81");
                a81.setForeground(Color.black);
                a81.setBackground(Color.red);
                break;
            case 82:
                a82.setText("82");
                a82.setForeground(Color.black);
                a82.setBackground(Color.blue);
                break;
            case 83:
                a83.setText("83");
                a83.setForeground(Color.black);
                a83.setBackground(Color.yellow);
                break;
            case 84:
                a84.setText("84");
                a84.setForeground(Color.black);
                a84.setBackground(Color.green);
                break;
            case 85:
                a85.setText("Snake");
                a85.setForeground(Color.green);
                a85.setBackground(Color.red);
                break;
            case 86:
                a86.setText("86");
                a86.setForeground(Color.black);
                a86.setBackground(Color.blue);
                break;
            case 87:
                a87.setText("87");
                a87.setForeground(Color.black);
                a87.setBackground(Color.yellow);
                break;
            case 88:
                a88.setText("88");
                a88.setForeground(Color.black);
                a88.setBackground(Color.green);
                break;
            case 89:
                a89.setText("89");
                a89.setForeground(Color.black);
                a89.setBackground(Color.red);
                break;
            case 90:
                a90.setText("90");
                a90.setForeground(Color.black);
                a90.setBackground(Color.blue);
                break;
            case 91:
                a91.setText("Snake");
                a91.setForeground(Color.black);
                a91.setBackground(Color.red);
                break;
            case 92:
                a92.setText("92");
                a92.setForeground(Color.black);
                a92.setBackground(Color.green);
                break;
            case 93:
                a93.setText("93");
                a93.setForeground(Color.black);
                a93.setBackground(Color.yellow);
                break;
            case 94:
                a94.setText("94");
                a94.setForeground(Color.black);
                a94.setBackground(Color.blue);
                break;
            case 95:
                a95.setText("95");
                a95.setForeground(Color.black);
                a95.setBackground(Color.red);
                break;
            case 96:
                a96.setText("96");
                a96.setForeground(Color.black);
                a96.setBackground(Color.green);
                break;
            case 97:
                a97.setText("97");
                a97.setForeground(Color.black);
                a97.setBackground(Color.yellow);
                break;
            case 98:
                a98.setText("Snake");
                a98.setForeground(Color.black);
                a98.setBackground(Color.blue);
                break;
            case 99:
                a99.setText("99");
                a99.setForeground(Color.black);
                a99.setBackground(Color.red);
                break;
            case 100:
                a100.setText("Home");
                a100.setForeground(Color.black);
                a100.setBackground(Color.green);
                break;
            default:
                break;
        }

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        w_pic = new javax.swing.JLabel();
        s_pic = new javax.swing.JLabel();
        l_pic = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        a100 = new javax.swing.JTextField();
        a99 = new javax.swing.JTextField();
        a98 = new javax.swing.JTextField();
        a97 = new javax.swing.JTextField();
        a96 = new javax.swing.JTextField();
        a95 = new javax.swing.JTextField();
        a94 = new javax.swing.JTextField();
        a93 = new javax.swing.JTextField();
        a92 = new javax.swing.JTextField();
        a91 = new javax.swing.JTextField();
        a89 = new javax.swing.JTextField();
        a90 = new javax.swing.JTextField();
        a81 = new javax.swing.JTextField();
        a82 = new javax.swing.JTextField();
        a83 = new javax.swing.JTextField();
        a84 = new javax.swing.JTextField();
        a85 = new javax.swing.JTextField();
        a86 = new javax.swing.JTextField();
        a87 = new javax.swing.JTextField();
        a88 = new javax.swing.JTextField();
        a71 = new javax.swing.JTextField();
        a74 = new javax.swing.JTextField();
        a72 = new javax.swing.JTextField();
        a77 = new javax.swing.JTextField();
        a79 = new javax.swing.JTextField();
        a75 = new javax.swing.JTextField();
        a73 = new javax.swing.JTextField();
        a76 = new javax.swing.JTextField();
        a78 = new javax.swing.JTextField();
        a80 = new javax.swing.JTextField();
        a64 = new javax.swing.JTextField();
        a67 = new javax.swing.JTextField();
        a62 = new javax.swing.JTextField();
        a70 = new javax.swing.JTextField();
        a65 = new javax.swing.JTextField();
        a63 = new javax.swing.JTextField();
        a69 = new javax.swing.JTextField();
        a61 = new javax.swing.JTextField();
        a68 = new javax.swing.JTextField();
        a59 = new javax.swing.JTextField();
        a66 = new javax.swing.JTextField();
        a51 = new javax.swing.JTextField();
        a53 = new javax.swing.JTextField();
        a60 = new javax.swing.JTextField();
        a54 = new javax.swing.JTextField();
        a56 = new javax.swing.JTextField();
        a58 = new javax.swing.JTextField();
        a55 = new javax.swing.JTextField();
        a57 = new javax.swing.JTextField();
        a52 = new javax.swing.JTextField();
        a48 = new javax.swing.JTextField();
        a41 = new javax.swing.JTextField();
        a43 = new javax.swing.JTextField();
        a44 = new javax.swing.JTextField();
        a45 = new javax.swing.JTextField();
        a49 = new javax.swing.JTextField();
        a50 = new javax.swing.JTextField();
        a46 = new javax.swing.JTextField();
        a47 = new javax.swing.JTextField();
        a42 = new javax.swing.JTextField();
        a32 = new javax.swing.JTextField();
        a36 = new javax.swing.JTextField();
        a33 = new javax.swing.JTextField();
        a38 = new javax.swing.JTextField();
        a37 = new javax.swing.JTextField();
        a31 = new javax.swing.JTextField();
        a35 = new javax.swing.JTextField();
        a40 = new javax.swing.JTextField();
        a39 = new javax.swing.JTextField();
        a34 = new javax.swing.JTextField();
        a30 = new javax.swing.JTextField();
        a28 = new javax.swing.JTextField();
        a29 = new javax.swing.JTextField();
        a22 = new javax.swing.JTextField();
        a27 = new javax.swing.JTextField();
        a25 = new javax.swing.JTextField();
        a23 = new javax.swing.JTextField();
        a24 = new javax.swing.JTextField();
        a26 = new javax.swing.JTextField();
        a21 = new javax.swing.JTextField();
        a15 = new javax.swing.JTextField();
        a18 = new javax.swing.JTextField();
        a16 = new javax.swing.JTextField();
        a12 = new javax.swing.JTextField();
        a13 = new javax.swing.JTextField();
        a17 = new javax.swing.JTextField();
        a20 = new javax.swing.JTextField();
        a11 = new javax.swing.JTextField();
        a19 = new javax.swing.JTextField();
        a14 = new javax.swing.JTextField();
        a5 = new javax.swing.JTextField();
        a10 = new javax.swing.JTextField();
        a9 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        a6 = new javax.swing.JTextField();
        a8 = new javax.swing.JTextField();
        a1 = new javax.swing.JTextField();
        a4 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a7 = new javax.swing.JTextField();
        dice = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        replay = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        show2 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        show3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        setLocation(new java.awt.Point(300, 50));
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        jLabel4.setBackground(new java.awt.Color(86, 66, 200));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 0);

        w_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/win.gif"))); // NOI18N
        getContentPane().add(w_pic);
        w_pic.setBounds(60, 30, 470, 300);

        s_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/snake.gif"))); // NOI18N
        getContentPane().add(s_pic);
        s_pic.setBounds(50, 70, 480, 272);

        l_pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/ladder_climb.gif"))); // NOI18N
        getContentPane().add(l_pic);
        l_pic.setBounds(180, 10, 248, 344);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 34, 14);

        a100.setEditable(false);
        a100.setBackground(java.awt.Color.green);
        a100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a100.setText("Home");
        a100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a100ActionPerformed(evt);
            }
        });
        getContentPane().add(a100);
        a100.setBounds(40, 10, 51, 34);

        a99.setEditable(false);
        a99.setBackground(java.awt.Color.red);
        a99.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a99.setText("99");
        getContentPane().add(a99);
        a99.setBounds(90, 10, 51, 34);

        a98.setEditable(false);
        a98.setBackground(java.awt.Color.blue);
        a98.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a98.setForeground(java.awt.Color.gray);
        a98.setText("Snake");
        a98.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(a98);
        a98.setBounds(140, 10, 51, 34);

        a97.setEditable(false);
        a97.setBackground(java.awt.Color.yellow);
        a97.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a97.setText("97");
        getContentPane().add(a97);
        a97.setBounds(190, 10, 51, 34);

        a96.setEditable(false);
        a96.setBackground(java.awt.Color.green);
        a96.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        a96.setText("96");
        getContentPane().add(a96);
        a96.setBounds(240, 10, 51, 34);

        a95.setEditable(false);
        a95.setBackground(java.awt.Color.red);
        a95.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a95.setText("95");
        getContentPane().add(a95);
        a95.setBounds(290, 10, 51, 34);

        a94.setBackground(java.awt.Color.blue);
        a94.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a94.setText("94");
        getContentPane().add(a94);
        a94.setBounds(340, 10, 51, 34);

        a93.setEditable(false);
        a93.setBackground(java.awt.Color.yellow);
        a93.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a93.setText("93");
        getContentPane().add(a93);
        a93.setBounds(390, 10, 51, 34);

        a92.setEditable(false);
        a92.setBackground(java.awt.Color.green);
        a92.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a92.setText("92");
        getContentPane().add(a92);
        a92.setBounds(440, 10, 51, 34);

        a91.setEditable(false);
        a91.setBackground(java.awt.Color.red);
        a91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a91.setForeground(new java.awt.Color(0, 153, 153));
        a91.setText("Snake");
        a91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a91ActionPerformed(evt);
            }
        });
        getContentPane().add(a91);
        a91.setBounds(490, 10, 51, 34);

        a89.setBackground(java.awt.Color.red);
        a89.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        a89.setText("89");
        getContentPane().add(a89);
        a89.setBounds(440, 40, 51, 34);

        a90.setBackground(java.awt.Color.blue);
        a90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a90.setText("90");
        a90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a90ActionPerformed(evt);
            }
        });
        getContentPane().add(a90);
        a90.setBounds(490, 40, 51, 34);

        a81.setBackground(java.awt.Color.red);
        a81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a81.setText("81");
        getContentPane().add(a81);
        a81.setBounds(40, 40, 51, 34);

        a82.setBackground(java.awt.Color.blue);
        a82.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a82.setText("82");
        getContentPane().add(a82);
        a82.setBounds(90, 40, 51, 34);

        a83.setBackground(java.awt.Color.yellow);
        a83.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a83.setText("83");
        getContentPane().add(a83);
        a83.setBounds(140, 40, 51, 34);

        a84.setBackground(java.awt.Color.green);
        a84.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a84.setText("84");
        getContentPane().add(a84);
        a84.setBounds(190, 40, 51, 34);

        a85.setBackground(java.awt.Color.red);
        a85.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a85.setForeground(new java.awt.Color(51, 255, 0));
        a85.setText("Snake");
        getContentPane().add(a85);
        a85.setBounds(240, 40, 51, 34);

        a86.setBackground(java.awt.Color.blue);
        a86.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a86.setText("86");
        getContentPane().add(a86);
        a86.setBounds(290, 40, 51, 34);

        a87.setBackground(java.awt.Color.yellow);
        a87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a87.setText("87");
        getContentPane().add(a87);
        a87.setBounds(340, 40, 51, 34);

        a88.setBackground(java.awt.Color.green);
        a88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a88.setText("88");
        getContentPane().add(a88);
        a88.setBounds(390, 40, 51, 34);

        a71.setBackground(java.awt.Color.yellow);
        a71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a71.setForeground(java.awt.SystemColor.activeCaption);
        a71.setText("Ladder");
        a71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a71ActionPerformed(evt);
            }
        });
        getContentPane().add(a71);
        a71.setBounds(490, 70, 51, 34);

        a74.setBackground(java.awt.Color.green);
        a74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a74.setForeground(new java.awt.Color(248, 218, 32));
        a74.setText("Snake");
        getContentPane().add(a74);
        a74.setBounds(340, 70, 51, 34);

        a72.setBackground(java.awt.Color.blue);
        a72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a72.setText("72");
        getContentPane().add(a72);
        a72.setBounds(440, 70, 51, 34);

        a77.setBackground(java.awt.Color.red);
        a77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a77.setText("77");
        getContentPane().add(a77);
        a77.setBounds(190, 70, 51, 34);

        a79.setBackground(java.awt.Color.yellow);
        a79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a79.setText("79");
        getContentPane().add(a79);
        a79.setBounds(90, 70, 51, 34);

        a75.setBackground(java.awt.Color.yellow);
        a75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a75.setText("75");
        getContentPane().add(a75);
        a75.setBounds(290, 70, 51, 34);

        a73.setBackground(java.awt.Color.red);
        a73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a73.setText("73");
        getContentPane().add(a73);
        a73.setBounds(390, 70, 51, 34);

        a76.setBackground(java.awt.Color.blue);
        a76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a76.setText("76");
        getContentPane().add(a76);
        a76.setBounds(240, 70, 51, 34);

        a78.setBackground(java.awt.Color.green);
        a78.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a78.setText("78");
        getContentPane().add(a78);
        a78.setBounds(140, 70, 51, 34);

        a80.setBackground(java.awt.Color.blue);
        a80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a80.setText("80");
        getContentPane().add(a80);
        a80.setBounds(40, 70, 51, 34);

        a64.setBackground(java.awt.Color.blue);
        a64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a64.setText("64");
        getContentPane().add(a64);
        a64.setBounds(190, 100, 51, 34);

        a67.setBackground(java.awt.Color.red);
        a67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a67.setText("67");
        getContentPane().add(a67);
        a67.setBounds(340, 100, 51, 34);

        a62.setBackground(java.awt.Color.green);
        a62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a62.setText("62");
        getContentPane().add(a62);
        a62.setBounds(90, 100, 51, 34);

        a70.setBackground(java.awt.Color.green);
        a70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a70.setText("70");
        a70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a70ActionPerformed(evt);
            }
        });
        getContentPane().add(a70);
        a70.setBounds(490, 100, 51, 34);

        a65.setBackground(java.awt.Color.yellow);
        a65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a65.setText("65");
        getContentPane().add(a65);
        a65.setBounds(240, 100, 51, 34);

        a63.setBackground(java.awt.Color.red);
        a63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a63.setText("63");
        getContentPane().add(a63);
        a63.setBounds(140, 100, 51, 34);

        a69.setBackground(java.awt.Color.yellow);
        a69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a69.setText("69");
        getContentPane().add(a69);
        a69.setBounds(440, 100, 51, 34);

        a61.setBackground(java.awt.Color.yellow);
        a61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a61.setText("61");
        getContentPane().add(a61);
        a61.setBounds(40, 100, 51, 34);

        a68.setBackground(java.awt.Color.blue);
        a68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a68.setText("68");
        getContentPane().add(a68);
        a68.setBounds(390, 100, 51, 34);

        a59.setBackground(java.awt.Color.red);
        a59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a59.setForeground(java.awt.Color.orange);
        a59.setText("Ladder");
        getContentPane().add(a59);
        a59.setBounds(90, 130, 51, 34);

        a66.setBackground(java.awt.Color.green);
        a66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a66.setText("66");
        getContentPane().add(a66);
        a66.setBounds(290, 100, 51, 34);

        a51.setBackground(java.awt.Color.red);
        a51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a51.setText("51");
        a51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a51ActionPerformed(evt);
            }
        });
        getContentPane().add(a51);
        a51.setBounds(490, 130, 51, 34);

        a53.setBackground(java.awt.Color.yellow);
        a53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a53.setText("53");
        getContentPane().add(a53);
        a53.setBounds(390, 130, 51, 34);

        a60.setBackground(java.awt.Color.green);
        a60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a60.setText("60");
        getContentPane().add(a60);
        a60.setBounds(40, 130, 51, 34);

        a54.setBackground(java.awt.Color.blue);
        a54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a54.setText("54");
        getContentPane().add(a54);
        a54.setBounds(340, 130, 51, 34);

        a56.setBackground(java.awt.Color.green);
        a56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a56.setText("56");
        getContentPane().add(a56);
        a56.setBounds(240, 130, 51, 34);

        a58.setBackground(java.awt.Color.blue);
        a58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a58.setForeground(new java.awt.Color(255, 0, 0));
        a58.setText("Snake");
        getContentPane().add(a58);
        a58.setBounds(140, 130, 51, 34);

        a55.setBackground(java.awt.Color.red);
        a55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a55.setForeground(new java.awt.Color(154, 9, 238));
        a55.setText("Ladder");
        getContentPane().add(a55);
        a55.setBounds(290, 130, 51, 34);

        a57.setBackground(java.awt.Color.yellow);
        a57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a57.setText("57");
        getContentPane().add(a57);
        a57.setBounds(190, 130, 51, 34);

        a52.setBackground(java.awt.Color.green);
        a52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a52.setText("52");
        getContentPane().add(a52);
        a52.setBounds(440, 130, 51, 34);

        a48.setBackground(java.awt.Color.green);
        a48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a48.setText("48");
        getContentPane().add(a48);
        a48.setBounds(390, 160, 51, 34);

        a41.setBackground(java.awt.Color.red);
        a41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a41.setText("41");
        a41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a41ActionPerformed(evt);
            }
        });
        getContentPane().add(a41);
        a41.setBounds(40, 160, 51, 34);

        a43.setBackground(java.awt.Color.yellow);
        a43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a43.setText("43");
        getContentPane().add(a43);
        a43.setBounds(140, 160, 51, 34);

        a44.setBackground(java.awt.Color.green);
        a44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a44.setText("44");
        getContentPane().add(a44);
        a44.setBounds(190, 160, 51, 34);

        a45.setBackground(java.awt.Color.red);
        a45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a45.setText("45");
        getContentPane().add(a45);
        a45.setBounds(240, 160, 51, 34);

        a49.setBackground(java.awt.Color.red);
        a49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a49.setText("49");
        getContentPane().add(a49);
        a49.setBounds(440, 160, 51, 34);

        a50.setBackground(java.awt.Color.blue);
        a50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a50.setText("50");
        a50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a50ActionPerformed(evt);
            }
        });
        getContentPane().add(a50);
        a50.setBounds(490, 160, 51, 34);

        a46.setBackground(java.awt.Color.blue);
        a46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a46.setForeground(new java.awt.Color(204, 51, 255));
        a46.setText("Snake");
        getContentPane().add(a46);
        a46.setBounds(290, 160, 51, 34);

        a47.setBackground(java.awt.Color.yellow);
        a47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a47.setText("47");
        getContentPane().add(a47);
        a47.setBounds(340, 160, 51, 34);

        a42.setBackground(java.awt.Color.blue);
        a42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a42.setText("42");
        getContentPane().add(a42);
        a42.setBounds(90, 160, 51, 34);

        a32.setBackground(java.awt.Color.blue);
        a32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a32.setText("32");
        getContentPane().add(a32);
        a32.setBounds(440, 190, 51, 34);

        a36.setBackground(java.awt.Color.blue);
        a36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a36.setText("36");
        getContentPane().add(a36);
        a36.setBounds(240, 190, 51, 34);

        a33.setBackground(java.awt.Color.red);
        a33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a33.setText("33");
        getContentPane().add(a33);
        a33.setBounds(390, 190, 51, 34);

        a38.setBackground(java.awt.Color.green);
        a38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a38.setText("38");
        getContentPane().add(a38);
        a38.setBounds(140, 190, 51, 34);

        a37.setBackground(java.awt.Color.red);
        a37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a37.setText("37");
        getContentPane().add(a37);
        a37.setBounds(190, 190, 51, 34);

        a31.setBackground(java.awt.Color.yellow);
        a31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a31.setText("31");
        a31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a31ActionPerformed(evt);
            }
        });
        getContentPane().add(a31);
        a31.setBounds(490, 190, 51, 34);

        a35.setBackground(java.awt.Color.yellow);
        a35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a35.setForeground(java.awt.Color.magenta);
        a35.setText("Ladder");
        getContentPane().add(a35);
        a35.setBounds(290, 190, 51, 34);

        a40.setBackground(java.awt.Color.blue);
        a40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a40.setText("40");
        getContentPane().add(a40);
        a40.setBounds(40, 190, 51, 34);

        a39.setBackground(java.awt.Color.yellow);
        a39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a39.setForeground(new java.awt.Color(204, 102, 0));
        a39.setText("Snake");
        getContentPane().add(a39);
        a39.setBounds(90, 190, 51, 34);

        a34.setBackground(java.awt.Color.green);
        a34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a34.setText("34");
        getContentPane().add(a34);
        a34.setBounds(340, 190, 51, 34);

        a30.setBackground(java.awt.Color.green);
        a30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a30.setText("30");
        a30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a30ActionPerformed(evt);
            }
        });
        getContentPane().add(a30);
        a30.setBounds(490, 220, 51, 34);

        a28.setBackground(java.awt.Color.blue);
        a28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a28.setText("28");
        getContentPane().add(a28);
        a28.setBounds(390, 220, 51, 34);

        a29.setBackground(java.awt.Color.yellow);
        a29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a29.setText("29");
        getContentPane().add(a29);
        a29.setBounds(440, 220, 51, 34);

        a22.setBackground(java.awt.Color.green);
        a22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a22.setText("22");
        getContentPane().add(a22);
        a22.setBounds(90, 220, 51, 34);

        a27.setBackground(java.awt.Color.red);
        a27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a27.setText("27");
        getContentPane().add(a27);
        a27.setBounds(340, 220, 51, 34);

        a25.setBackground(java.awt.Color.yellow);
        a25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a25.setText("25");
        getContentPane().add(a25);
        a25.setBounds(240, 220, 51, 34);

        a23.setBackground(java.awt.Color.red);
        a23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a23.setText("23");
        getContentPane().add(a23);
        a23.setBounds(140, 220, 51, 34);

        a24.setBackground(java.awt.Color.blue);
        a24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a24.setText("24");
        getContentPane().add(a24);
        a24.setBounds(190, 220, 51, 34);

        a26.setBackground(java.awt.Color.green);
        a26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a26.setText("26");
        getContentPane().add(a26);
        a26.setBounds(290, 220, 51, 34);

        a21.setBackground(java.awt.Color.yellow);
        a21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a21.setText("21");
        getContentPane().add(a21);
        a21.setBounds(40, 220, 51, 34);

        a15.setBackground(java.awt.Color.red);
        a15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a15.setText("15");
        getContentPane().add(a15);
        a15.setBounds(290, 250, 51, 34);

        a18.setBackground(java.awt.Color.blue);
        a18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a18.setForeground(java.awt.Color.cyan);
        a18.setText("Ladder");
        getContentPane().add(a18);
        a18.setBounds(140, 250, 51, 34);

        a16.setBackground(java.awt.Color.green);
        a16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a16.setText("16");
        getContentPane().add(a16);
        a16.setBounds(240, 250, 51, 34);

        a12.setBackground(java.awt.Color.green);
        a12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a12.setText("12");
        getContentPane().add(a12);
        a12.setBounds(440, 250, 51, 34);

        a13.setBackground(java.awt.Color.yellow);
        a13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a13.setText("13");
        getContentPane().add(a13);
        a13.setBounds(390, 250, 51, 34);

        a17.setBackground(java.awt.Color.yellow);
        a17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a17.setText("17");
        getContentPane().add(a17);
        a17.setBounds(190, 250, 51, 34);

        a20.setBackground(java.awt.Color.green);
        a20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a20.setText("20");
        getContentPane().add(a20);
        a20.setBounds(40, 250, 51, 34);

        a11.setBackground(java.awt.Color.red);
        a11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a11.setText("11");
        a11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a11ActionPerformed(evt);
            }
        });
        getContentPane().add(a11);
        a11.setBounds(490, 250, 51, 34);

        a19.setBackground(java.awt.Color.red);
        a19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a19.setText("19");
        getContentPane().add(a19);
        a19.setBounds(90, 250, 51, 34);

        a14.setBackground(java.awt.Color.blue);
        a14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a14.setForeground(new java.awt.Color(255, 153, 153));
        a14.setText("Snake");
        a14.setCaretColor(new java.awt.Color(255, 0, 0));
        getContentPane().add(a14);
        a14.setBounds(340, 250, 51, 34);

        a5.setBackground(java.awt.Color.red);
        a5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a5.setText("5");
        a5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ActionPerformed(evt);
            }
        });
        getContentPane().add(a5);
        a5.setBounds(240, 280, 51, 34);

        a10.setBackground(java.awt.Color.blue);
        a10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a10.setText("10");
        a10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a10ActionPerformed(evt);
            }
        });
        getContentPane().add(a10);
        a10.setBounds(490, 280, 51, 34);

        a9.setBackground(java.awt.Color.red);
        a9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a9.setText("9");
        getContentPane().add(a9);
        a9.setBounds(440, 280, 51, 34);

        a3.setBackground(java.awt.Color.yellow);
        a3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a3.setText("3");
        getContentPane().add(a3);
        a3.setBounds(140, 280, 51, 34);

        a6.setBackground(java.awt.Color.blue);
        a6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a6.setText("6");
        getContentPane().add(a6);
        a6.setBounds(290, 280, 51, 34);

        a8.setBackground(java.awt.Color.green);
        a8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a8.setText("8");
        getContentPane().add(a8);
        a8.setBounds(390, 280, 51, 34);

        a1.setBackground(java.awt.Color.red);
        a1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a1.setText("Start");
        getContentPane().add(a1);
        a1.setBounds(40, 280, 51, 34);

        a4.setBackground(java.awt.Color.green);
        a4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a4.setText("4");
        getContentPane().add(a4);
        a4.setBounds(190, 280, 51, 34);

        a2.setBackground(java.awt.Color.blue);
        a2.setFont(a2.getFont().deriveFont(a2.getFont().getStyle() | java.awt.Font.BOLD));
        a2.setText("2");
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2);
        a2.setBounds(90, 280, 51, 34);

        a7.setBackground(java.awt.Color.yellow);
        a7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a7.setForeground(java.awt.Color.blue);
        a7.setText("Ladder");
        getContentPane().add(a7);
        a7.setBounds(340, 280, 51, 34);

        dice.setBackground(java.awt.Color.blue);
        dice.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/dice.gif"))); // NOI18N
        dice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diceActionPerformed(evt);
            }
        });
        getContentPane().add(dice);
        dice.setBounds(250, 340, 60, 60);

        ok.setBackground(java.awt.Color.blue);
        ok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("1");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(250, 350, 60, 50);

        replay.setBackground(java.awt.Color.white);
        replay.setText(" REPLAY");
        replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replayActionPerformed(evt);
            }
        });
        getContentPane().add(replay);
        replay.setBounds(390, 370, 80, 30);

        exit.setBackground(java.awt.Color.white);
        exit.setText("Quit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(90, 370, 70, 30);

        show2.setBackground(new java.awt.Color(255, 255, 255));
        show2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show2.setForeground(java.awt.Color.blue);
        getContentPane().add(show2);
        show2.setBounds(360, 330, 160, 30);

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setForeground(java.awt.Color.blue);
        getContentPane().add(show);
        show.setBounds(70, 330, 150, 30);
        getContentPane().add(show3);
        show3.setBounds(210, 390, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_game/folder/img1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 580, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a91ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a91ActionPerformed

    private void a90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a90ActionPerformed

    private void a71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a71ActionPerformed

    private void a70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a70ActionPerformed

    private void a51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a51ActionPerformed

    private void a50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a50ActionPerformed

    private void a31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a31ActionPerformed

    private void a30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a30ActionPerformed

    private void a11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a11ActionPerformed

    private void a10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a10ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void a5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a5ActionPerformed

    private void a100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a100ActionPerformed

    private void diceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diceActionPerformed

player_move();
   dice.setVisible(false);
   ok.setVisible(true);
   
       
    }//GEN-LAST:event_diceActionPerformed
public void sleep_game(){
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
        }
    }
public void colour_player2(){
    show2.setForeground(Color.blue);
    show.setForeground(Color.MAGENTA);
                     
}
public void colour_player1(){
    show.setForeground(Color.blue);
     show2.setForeground(Color.MAGENTA);
                    
}
public void player_move(){
    int player=1,x=1;
t+=x;
 player=(t%2==0)?1:2;
 show3.setText(null);
 
 if(player==1)
                {
                     int n1=Integer.parseInt(dics);
                     if(point1==0)
                     {
                         if(n1==1)
                         {
                             point1+=1;
                             compare1(point1);
                           t1=1;
                           colour_player1();
                         }
                         else
                         {
                         colour_player1();
                         }   
                     }
          
                     else {
                          if(point1==point2)
                        {
                            compare2(point2);
                        }
                 else   
                set_back(t1);
                point1+=n1;
                switch(point1){
                    
                    case 7:   point1=29;
                          
                    compare1(point1);
                              t1=29;
                         colour_player1();
                         l_pic.setVisible(true);
                              break;
                    case 14:   point1=6;
                              compare1(point1);
                              t1=6;
                             colour_player1();
                             s_pic.setVisible(true);
                              break; 
                     case 35:   point1=70;
                              compare1(point1);
                              t1=70;
                             colour_player1();
                             l_pic.setVisible(true);
                             break;
                    case 39:   point1=4;
                              compare1(point1);
                              t1=4;
                         colour_player1();
                              s_pic.setVisible(true);
                              break;
                    case 18:   point1=45;
                              compare1(point1);
                              t1=45;
                            colour_player1();
                              l_pic.setVisible(true);
                               break;
                    case 46:   point1=28;
                              compare1(point1);
                              t1=28;
                              colour_player1();
                              s_pic.setVisible(true);
                              break;
                    case 55:   point1=89;
                              compare1(point1);
                              t1=89;
                             colour_player1();
                             l_pic.setVisible(true);
                               break;
                    case 58:   point1=17;
                              compare1(point1);
                              t1=17;
                             colour_player1();
                             s_pic.setVisible(true);
                               break;
                    case 59:   point1=84;
                              compare1(point1);
                              t1=84;
                              colour_player1();
                              l_pic.setVisible(true);
                              break;
                    case 71:   point1=96;
                              compare1(point1);
                              t1=96;
                         colour_player1();
                             l_pic.setVisible(true);
                                break;
                    case 74:   point1=65;
                              compare1(point1);
                              t1=65;
                         colour_player1();
                         s_pic.setVisible(true);
                              break;
                    case 85:   point1=53;
                              compare1(point1);
                              t1=53;
                         colour_player1();
                              s_pic.setVisible(true);
                               break;
                    case 91:   point1=72;
                              compare1(point1);
                              t1=72;
                         colour_player1();
                          s_pic.setVisible(true);
                              break;
                    case 98:   point1=44;
                              compare1(point1);
                              t1=44;
                         colour_player1();
                         s_pic.setVisible(true);
                              break;
                     case 101:  
                                point1=point1-n1;
                                t1=t1-n1;
                                compare1(point1);
                         colour_player1();
                                break; 
                    case 102:  
                                point1=point1-n1;
                                t1=t1-n1;
                                compare1(point1);
                              colour_player1();
                               break; 
                     case 103:  
                                point1=point1-n1;
                                t1=t1-n1;
                                compare1(point1);
                         colour_player1();       
                               break;           
                    
                     case 104:  
                                point1=point1-n1;
                                t1=t1-n1;
                                compare1(point1);
                         colour_player1();       
                               break; 
                     case 105:  
                                point1=point1-n1;
                                t1=t1-n1;
                                compare1(point1);
                         colour_player1();       
                               break;
                     case 100:replay.setVisible(true);
                             dice.setVisible(false); 
                            ok.setVisible(false);
                            show.setText(enter_in.ply1 +" win");
                         show.setForeground(Color.magenta);
                           show2.setForeground(Color.white);
                         
                            break;
                     
                    default:
                        
                        compare1(point1);
                        
                           t1=t1+n1;
                            colour_player1();
                           break;
                }
                    
                     }
                }
       else if(player==2)
                {    
                   int n2=Integer.parseInt(dics);
                    if(point2==0)
                     {
                         if(n2==1)
                         {
                           point2+=1;
                           compare2(point2);
                           t2=1;
                         colour_player2();
                         }
                             
                         else{
                         colour_player2();
                         }
                             
                     }
          
                     else {
                         if(point1==point2)
                        {
                            compare1(point1);
                        }
                else
                 set_back(t2);
                    point2+=n2;
                  switch(point2){
                    
                    case 7:   point2=29;
                              compare2(point2);
                              t2=29;
                         colour_player2();
                        l_pic.setVisible(true);
                               break;
                    case 14:   point2=6;
                              compare2(point2);
                              t2=6;
                         colour_player2();
                         s_pic.setVisible(true);
                             break; 
                     case 35:   point2=70;
                              compare2(point2);
                              t2=70;
                         colour_player2();
                             l_pic.setVisible(true);
                              break;
                    case 39:   point2=4;
                              compare2(point2);
                              t2=4;
                         colour_player2();
                          s_pic.setVisible(true);
                              break;
                    case 18:   point2=45;
                              compare2(point2);
                              t2=45;
                         colour_player2();
                              l_pic.setVisible(true);
                               break;
                    case 46:   point2=28;
                              compare2(point2);
                              t2=28;
                         colour_player2();
                          s_pic.setVisible(true);
                             break;
                    case 55:   point2=89;
                              compare2(point2);
                              t2=89;
                         colour_player2();
                        l_pic.setVisible(true);
                               break;
                    case 58:   point2=17;
                              compare2(point2);
                              t2=17;
                         colour_player2();
                         s_pic.setVisible(true);
                              break;
                    case 59:   point2=84;
                              compare2(point2);
                              t2=84;
                         colour_player2();
                             l_pic.setVisible(true);
                               break;
                    case 71:   point2=96;
                              compare2(point2);
                              t2=96;
                         colour_player2();
                              l_pic.setVisible(true);
                              break;
                    case 74:   point2=65;
                              compare2(point2);
                              t2=65;
                         colour_player2();
                        s_pic.setVisible(true);
                               break;
                    case 85:   point2=53;
                              compare2(point2);
                              t2=53;
                         colour_player2();
                        s_pic.setVisible(true);
                               break;
                    case 91:   point2=72;
                              compare2(point2);
                              t2=72;
                         colour_player2();
                         s_pic.setVisible(true);
                              break;
                    case 98:   point2=44;
                              compare2(point2);
                              t2=44;
                         colour_player2();
                        s_pic.setVisible(true);
                               break;
                    case 101:  
                                point2=point2-n2;
                                t2=t2-n2;
                                compare2(point2);
                         colour_player2();      
                               break; 
                    case 102:  
                                point2=point2-n2;
                                t2=t2-n2;
                                compare2(point2);
                         colour_player2();       
                               break; 
                     case 103:  
                                 point2=point2-n2;
                                t2=t2-n2;
                                compare2(point2);
                         colour_player2();       
                               break;          
                    
                     case 104:  
                                 point2=point2-n2;
                                t2=t2-n2;
                                compare2(point2);
             colour_player2();                   
                               break; 
                     case 105:  
                                point2=point2-n2;
                                t2=t2-n2;
                                compare2(point2);
             colour_player2();
             break; 
                     case 100:          
                               replay.setVisible(true);
                    dice.setVisible(false); 
                    ok.setVisible(false);
                    show2.setText(enter_in.ply2 + " win");
                           show2.setForeground(Color.magenta);
                           show.setForeground(Color.white);
                        
                             break;
                    default: compare2(point2);
                           t2=t2+n2;
             colour_player2();              
                         
                           break;
                }
            }
        } 
           
               
              
     
    
      
      if(point1==100||point2==100)
      {
          ok.setVisible(false);
          
      }  
}
public void for_dice(){
     
    Random obj=new Random();
int num=obj.nextInt(6)+1;
String dic=Integer.toString(num);

if(num==1)
{
    dics="1";
    ok.setText(dic);
}
else if(num==2)
{
    dics="2";
    ok.setText(dic);
}
else if(num==3)
{
    dics="3";
    ok.setText(dic);
}
else if(num==4)
{
    dics="4";
    ok.setText(dic);
}

else if(num==5)
{
    dics="5";
    ok.setText(dic);
}

else if(num==6)
{
    dics="6";
    ok.setText(dic);
}


}


    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      for_dice();


dice.setVisible(true);
ok.setVisible(false);
l_pic.setVisible(false);
s_pic.setVisible(false);
w_pic.setVisible(false);
       // TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void replayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replayActionPerformed
for(int i=1;i<101;i++)
{
set_back(i);
}

dice.setVisible(false); 
      ok.setVisible(true); 
      show.setText(enter_in.ply1name+"   #");                
      show2.setText(enter_in.ply2name+"   $"); 
      show.setForeground(Color.MAGENTA);
      show.setForeground(Color.MAGENTA);
      
      
point1=0;
point2=0;
t=1;
t1=0;
t2=0;
// TODO add your handling code here:
    }//GEN-LAST:event_replayActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
new quit().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void a41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a41ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a10;
    private javax.swing.JTextField a100;
    private javax.swing.JTextField a11;
    private javax.swing.JTextField a12;
    private javax.swing.JTextField a13;
    private javax.swing.JTextField a14;
    private javax.swing.JTextField a15;
    private javax.swing.JTextField a16;
    private javax.swing.JTextField a17;
    private javax.swing.JTextField a18;
    private javax.swing.JTextField a19;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a20;
    private javax.swing.JTextField a21;
    private javax.swing.JTextField a22;
    private javax.swing.JTextField a23;
    private javax.swing.JTextField a24;
    private javax.swing.JTextField a25;
    private javax.swing.JTextField a26;
    private javax.swing.JTextField a27;
    private javax.swing.JTextField a28;
    private javax.swing.JTextField a29;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField a30;
    private javax.swing.JTextField a31;
    private javax.swing.JTextField a32;
    private javax.swing.JTextField a33;
    private javax.swing.JTextField a34;
    private javax.swing.JTextField a35;
    private javax.swing.JTextField a36;
    private javax.swing.JTextField a37;
    private javax.swing.JTextField a38;
    private javax.swing.JTextField a39;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField a40;
    private javax.swing.JTextField a41;
    private javax.swing.JTextField a42;
    private javax.swing.JTextField a43;
    private javax.swing.JTextField a44;
    private javax.swing.JTextField a45;
    private javax.swing.JTextField a46;
    private javax.swing.JTextField a47;
    private javax.swing.JTextField a48;
    private javax.swing.JTextField a49;
    private javax.swing.JTextField a5;
    private javax.swing.JTextField a50;
    private javax.swing.JTextField a51;
    private javax.swing.JTextField a52;
    private javax.swing.JTextField a53;
    private javax.swing.JTextField a54;
    private javax.swing.JTextField a55;
    private javax.swing.JTextField a56;
    private javax.swing.JTextField a57;
    private javax.swing.JTextField a58;
    private javax.swing.JTextField a59;
    private javax.swing.JTextField a6;
    private javax.swing.JTextField a60;
    private javax.swing.JTextField a61;
    private javax.swing.JTextField a62;
    private javax.swing.JTextField a63;
    private javax.swing.JTextField a64;
    private javax.swing.JTextField a65;
    private javax.swing.JTextField a66;
    private javax.swing.JTextField a67;
    private javax.swing.JTextField a68;
    private javax.swing.JTextField a69;
    private javax.swing.JTextField a7;
    private javax.swing.JTextField a70;
    private javax.swing.JTextField a71;
    private javax.swing.JTextField a72;
    private javax.swing.JTextField a73;
    private javax.swing.JTextField a74;
    private javax.swing.JTextField a75;
    private javax.swing.JTextField a76;
    private javax.swing.JTextField a77;
    private javax.swing.JTextField a78;
    private javax.swing.JTextField a79;
    private javax.swing.JTextField a8;
    private javax.swing.JTextField a80;
    private javax.swing.JTextField a81;
    private javax.swing.JTextField a82;
    private javax.swing.JTextField a83;
    private javax.swing.JTextField a84;
    private javax.swing.JTextField a85;
    private javax.swing.JTextField a86;
    private javax.swing.JTextField a87;
    private javax.swing.JTextField a88;
    private javax.swing.JTextField a89;
    private javax.swing.JTextField a9;
    private javax.swing.JTextField a90;
    private javax.swing.JTextField a91;
    private javax.swing.JTextField a92;
    private javax.swing.JTextField a93;
    private javax.swing.JTextField a94;
    private javax.swing.JTextField a95;
    private javax.swing.JTextField a96;
    private javax.swing.JTextField a97;
    private javax.swing.JTextField a98;
    private javax.swing.JTextField a99;
    private javax.swing.JButton dice;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l_pic;
    private javax.swing.JButton ok;
    private javax.swing.JButton replay;
    private javax.swing.JLabel s_pic;
    private javax.swing.JLabel show;
    private javax.swing.JLabel show2;
    private javax.swing.JLabel show3;
    private javax.swing.JLabel w_pic;
    // End of variables declaration//GEN-END:variables
}
