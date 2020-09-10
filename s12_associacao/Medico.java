import java.util.*;
public class Medico {
    String id;
    Map<String, Paciente> pacientes;
    public Medico(String id){
        this.id = id;
        pacientes = new TreeMap<String, Paciente>();
    }
    public void addPaciente(Paciente paciente){
        if(pacientes.containsKey(paciente.id))
            return;
        pacientes.put(paciente.id, paciente);
        paciente.addMedico(this);
    }
}
