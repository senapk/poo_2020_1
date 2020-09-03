import java.util.*;

class Contato{
    boolean favorited;
}

class Agenda{
    Map<String, Contato> contatos;
//    Map<String, Contato> favoritos;
    void favoritar(string id){
        Contato contato = contatos.get(id);
        if(contato == null)
            return;
        if(contato.isFavorited())
            return;
        contato.setFavorited(true);
        favoritos.put(id, contato);
    }

    Collection<Contato> getFavoritos(){
        // ArrayList<Contato> saida = new ArrayList<>();
        // for(Contato contato : contatos.values())
        //     if(contato.isFavorited())
        //         saida.add(contato);
        // return saida;
        //return new ArrayList<Contato>(contato.values());
        return contato.values();
    }
}