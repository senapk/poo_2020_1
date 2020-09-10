import java.util.Map;

public class Hospital{
    Map<String, Medico> medicos;
    Map<String, Paciente> pacientes;


    void addMedico(String id){
        if(medicos.containsKey(id))
            return;
        medicos.put(id, new Medico(id));
    }
    void addPaciente(String id){
        ...
    }

    void vincular(String idMedico, String idPaciente){
        Medico medico = medicos.get(idMedico);
        Paciente paciente = pacientes.get(idPaciente);
        if(medico != null && paciente != null)
            medico.addPaciente(paciente);
    }

    void rmMedico(String idMedico){
        obter o medico
        para cada paciente desse medico
            medico.rmPaciente(paciente)
        remove o medico
    }
}