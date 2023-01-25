package ArraysCollections;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    Usuario (String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nEmail: " + this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return nome.equals(usuario.nome) && email.equals(usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario){
            Usuario user = (Usuario) obj;
            boolean nomeIgual = user.nome.equals(this.nome);
            boolean emailIgual = user.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
 */
}