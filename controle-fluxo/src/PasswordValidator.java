public class PasswordValidator {

    public static void main(String[] args) {
        String keyUser = "julio123";
        String response = keyUser == "julio123" ? "Admin" : keyUser == "caio123" ? "professor" : keyUser == "jao123" ? "Aluno" : "Sem Cadastro";
        System.out.println(response);

        if (keyUser == "julio123"){
            System.out.println("administrador");
        }else if (keyUser =="caio123") {
            System.out.println( "professor");
        }else if (keyUser == "jao123"){
            System.out.println("aluno");
        }else
            System.out.println("Cadastrar Usuário");

        switch (keyUser) {
            case "julio123":
                System.out.println("admin again");
                break;
        
            default:
                System.out.println("sem cadastro");
                break;
        }

    }
}