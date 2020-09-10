import java.util.*;
class Perfil {
    String id;
    Map<String, Perfil> seguidos;
    Map<String, Perfil> seguidores;

    void follow(Perfil other){
        if(seguidos.containsKey(other.id))
            return;
        seguidos.put(other.id, other);
        other.seguidores.put(this.id, this);
    }
    void unfollow(Perfil other){
        if(!seguidos.containsKey(other.id))
            return;
        seguidos.remove(other.id);
        other.seguidores.remove(this.id);
    }
}

class PerfilManager{
    Map<String, Perfil> perfis;

    void seguir(String idOne, String idTwo){
        Perfil one = perfis.get(idOne);
        Perfil two = perfis.get(idTwo);
        if(one != null && two != null)
            one.follow(two);
    }
}

main(){
    if(ui[0].equals("seguir"))//seguir mario mariana
        perfilManager.seguir(ui[1], ui[2]);
}
