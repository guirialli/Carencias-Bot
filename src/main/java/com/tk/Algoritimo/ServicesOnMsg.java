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
       

        if(message.indexOf("#") == -1 ){
            return AleatoryNum.genNumberInt(bound);
        }

        else{
            int aux;
            aux = Integer.parseInt(message.substring(message.lastIndexOf("#")+1, message.length()));
            if(aux>bound || aux <=0)
                aux = AleatoryNum.genNumberInt(bound); 
            return aux;
        }
    }

    public static String acariciaoString(String message){
        if(message.equals("[]"))
            return "";
        else            
            return message.substring(message.length()-20, message.length() -2);
        
        
    }

}
