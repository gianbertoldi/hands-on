package bergs.cap.capuaajm.Utils;

import com.github.javafaker.Faker;

public class Contato {
    private final String nome;
    private final String sobreNome;
    private final String telefone;
    private final String tipoTelefone;
    private final String email;

    public Contato() {
        Faker faker = new Faker();
        this.nome = faker.name().firstName();
        this.sobreNome = faker.name().lastName();
        this.telefone = faker.phoneNumber().cellPhone();
        this.tipoTelefone = "Mobile";
        this.email = this.nome + this.sobreNome + "@email.com";
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public String getEmail() {
        return email;
    }

    Contato(String nome, String sobreNome, String telefone, String tipoTelefone, String email) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.email = email;
    }

}
