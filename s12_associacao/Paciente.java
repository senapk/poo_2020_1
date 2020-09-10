import java.util.*;
public class Paciente{
    String id;
    Map<String, Medico> medicos;
    public Paciente(String id){
        this.id = id;
        medicos = new TreeMap<String, Medico>();
    }
    public void addMedico(Medico medico){
        if(medicos.containsKey(medico.id))
            return;
        medicos.put(medico.id, medico);
        medico.addPaciente(this);
    }
    public static void main(String[] args) {
        Paciente fulano = new Paciente("Fu");
        Medico sicrano = new Medico("Si");
        fulano.addMedico(sicrano);
    }
}

