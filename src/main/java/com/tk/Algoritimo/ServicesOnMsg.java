package com.tk.Algoritimo;


public class ServicesOnMsg {
    
    public static String shorC(String message, int posFinal){
        return message.substring(0, posFinal);
    }

    public static String shorC(String message, int posIni, int posFinal){
        return message.substring(posIni, posFinal);
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
        String[] msgVet= message.split(" ");
        if(msgVet[msgVet.length-1].indexOf("#") == -1  || msgVet[msgVet.length-1].indexOf("[") != -1){
            return AleatoryNum.genNumberInt(bound);
        }

        else{
            int aux;
            aux = Integer.parseInt(msgVet[msgVet.length-1].substring(msgVet[msgVet.length-1].lastIndexOf("#")+1, msgVet[msgVet.length-1].length()));
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
