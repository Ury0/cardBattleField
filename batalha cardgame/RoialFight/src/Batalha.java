public class Batalha {
     String[] nivel = {"e","d","c","b","a","s"};
     String[] tipo = {"pedra","papel","tesoura"};
     Carta ataque;
     Carta defesa;
     public Batalha(){
     }
     public Batalha(Carta ataque, Carta defesa){
        this.ataque = ataque;
        this.defesa = defesa;
     }
     public int round(){
        int index;
        if(compNivel(this.ataque.getNivel(), this.defesa.getNivel())){
            index = 1;
            System.out.print("vitoria");
        }else{
            index = joquempo(this.ataque.getTipo(), this.defesa.getTipo());
        }
        return index;
     }
     public boolean compNivel(String nivelATK, String nivelDEF){
        boolean superior;
        if(nivelATK.equals(nivelDEF)){
            System.out.println("=<");
            superior = false; 
        }else{
            if(intNivel(nivelATK)>3){
                if((intNivel(nivelATK))>(intNivel(nivelDEF))){
                    System.out.print(">"); 
                    superior = true; 
                }else{
                    System.out.print("<=");
                    superior = false;
                }
            }else{
                if((intNivel(nivelATK))-1>(intNivel(nivelDEF))){
                    System.out.print(">"); 
                    superior = true; 
                }else{
                    System.out.print("<=");
                    superior = false;
                }
            }
        }
        return superior;
     }
     public int joquempo(String tipoATK, String tipoDEF){
        int index=2;
        if(tipoATK.equals(tipoDEF)){
            index = 0;
            System.out.println("empate");
        }else{
            switch(tipoATK){
                case "pedra":
                    if(tipoDEF.equals("papel")){
                        index =-1;
                        System.out.print("derrota");
                    }else{
                        index = 1;
                        System.out.print("vitoria");
                    }
                break;
                case "papel":
                    if(tipoDEF.equals("tesoura")){
                        index = -1;
                        System.out.print("derrota");
                    }else{
                        index = 1;
                        System.out.print("vitoria");
                    }
                break;
                case "tesoura":
                    if(tipoDEF.equals("pedra")){
                        index = -1;
                        System.out.print("derrota");
                    }else{
                        index = 1;
                        System.out.print("vitoria");
                    }
                break;
            }
        }
            return index;
     }
     public int intNivel(String nivel){
        int i;
        for(i=0;i<this.nivel.length;i++){
            if(nivel.equals(this.nivel[i])){
                break;
            }
        }
        return i;
     }
}


