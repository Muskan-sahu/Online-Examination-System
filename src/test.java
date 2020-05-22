
public class test {
    public static void main(String[] args){
        int f=77,s=2,t=21,e;
        for(int i=1;i<=20;i++){
     System.out.println("changecolor(cq_t"+t+", jRadioButton"+f+", jRadioButton"+(f+1)+", jRadioButton"+(f+2)+", jRadioButton"+(f+3)+");\n" +
"savebutton_c(\""+t+"\", jRadioButton"+f+", jRadioButton"+(f+1)+", jRadioButton"+(f+2)+", jRadioButton"+(f+3)+");\n" +
"question_panel.removeAll();\n" +
"question_panel.add(jq"+s+");\n" +
"question_panel.repaint();\n" +
"question_panel.revalidate(); ");
      System.out.println("");
        f+=4;
        s++;
        t++;
        }
    }
   
    
}
