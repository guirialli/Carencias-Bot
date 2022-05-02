package com.tk.Algoritimo;

public class ServicesOnMsg {
    
    public static String shorC(String message){
        return message.substring(0, 2);
    }
    public static String cutAction(String message){
        String aux=null;
        int indice=2;
        StringBuilder builder = new StringBuilder(); 
        if(message.length()>2){
            do {
                aux = message.substring(indice, indice+1);
                if(!aux.equals(" "))
                    builder.append(aux);
                indice++;
            } while (!aux.equals(" "));
    
            return builder.toString();
        }
        else
             return " ";
    }


    public static int cutINT(String message, int bound){
        int sub=1;
        String builder="";
        if(message.indexOf("#") == -1 ){
            int aux =  AleatoryNum.genNumberInt(bound);
            if (aux ==0)
                aux = cutINT(message, bound);
            return aux;
        }

        else{
           
            String aux;
            do {
                aux = message.substring(message.length()-sub);
                if(aux.indexOf("#") == -1)
                    builder=aux;
                sub++;
            } while (aux.indexOf("#") == -1);

            sub = Integer.parseInt(builder);
            if(sub>bound || sub <=0)
                sub = AleatoryNum.genNumberInt(bound); 
            return sub;
        }
    }

    public static String acariciaoString(String message){
        if(message.equals("[]"))
            return "";
        else            
            return message.substring(message.length()-20, message.length() -2);
        
        
    }

}
