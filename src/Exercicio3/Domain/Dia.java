package Exercicio3.Domain;

import java.util.ArrayList;

public class Dia {

    private int DiaMes;

    private ArrayList<Compromisso> compromissos = new ArrayList<>();

    public void Dia(int DiaMes) {

        this.DiaMes = DiaMes;

    }

    public void AdicionarCompromisso(Compromisso compromisso) {

        this.compromissos.add(compromisso);

    }

    public Compromisso ConsultarCompromisso(int hora) {

        Compromisso compromissoRet = new Compromisso();

        for (Compromisso compromisso : compromissos) {
            
            if(compromisso.getHora() == hora){

                compromissoRet = compromisso;

            }
            else{

                System.out.println("Compromisso Not Found");
                
                throw new Exception("Not found")

            }

        }

        return compromissoRet;

    }

    public void ExcluirCompromisso(int hora) {

        for (Compromisso compromisso : compromissos) {
            
            if(compromisso.getHora() == hora){

                 compromisso = null;

            }
            else{

                System.out.println("Compromisso Not Found");
                
                throw new Exception("Not found")

            }

        }

    }

    public String ListarCompromissos() {

        return this.compromissos.toString();

    }

}
