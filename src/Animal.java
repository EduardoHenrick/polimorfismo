public abstract class Animal {
    
    private String nome;

    private Integer velocidade;

public Animal(Integer velocidade, String nome) {
    this.velocidade = velocidade;
    this.nome = nome;
}

    public Integer getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}

  
