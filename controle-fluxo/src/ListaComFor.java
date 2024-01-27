public class ListaComFor {

    public static void main(String[] args) {
        
        String alunos [] = {"Roberta", "Julio", "Carlitus", "Bilbéx", "Dan"};
        
        for(int i=0; i<alunos.length; i++){

            System.out.println("O aluno indice " + i + " chama-se " + alunos[i]);

        }

        for(String aluno:alunos){

            System.out.println(aluno);

        }

    }    

}
