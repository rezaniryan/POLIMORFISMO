package polimorfismo;

public class pessoa {
	
	    //classe base
	    protected String nome;

	    public pessoa(String nome) {
	        this.nome = nome;
	    }

	    public String enviarEmail(String corpoMensagem) {
	        return "Olá " + nome + "!\n" + corpoMensagem;
	    }
	}

	    //classe para o professor
	class Professor extends pessoa {
	    public Professor(String nome) {
	        super("Prof. " + nome);
	    }
	}

	    //classe para o aluno
	class Aluno extends pessoa {
	    public Aluno(String nome) {
	        super("Aluno " + nome);
	    }
	    
	    // testa o codigo
	    public static void main(String[] args) {
	        //cria os objetos
	        Professor professor = new Professor("Ohatão do grau");
	        Aluno aluno = new Aluno("Menor pecinha");

	        //envia o email
	        String emailProfessor = professor.enviarEmail("Faz o codigo ai truta.");
	        String emailAluno = aluno.enviarEmail("Vish, ta embaçado.");

	        //mostra os emails
	        System.out.println(emailProfessor);
	        System.out.println(emailAluno);
	    }
	}



