{
    public int estado, volume, maximo,canal;
    
    public abstract void botaoCinco();
    public abstract void botaoSeis();
    
    public void feedbackDispositivo(){
        if(estado>maximo || estado <0)estado=0;
        System.out.println("Atualmente em: "+estado);
    }
    
    public void botaoSete(){ canal++;
        System.out.println("Canal : "+canal);
    }
    public void botaoSeis(){ canal--;
        System.out.println("Canal : "+canal);
    }
    
    public void botaoSete(){ volume++;
        System.out.println("Volume em: "+volume);
    }
    public void botaoOito(){ volume--;
        System.out.println("Volume em: "+volume);
    }

}
