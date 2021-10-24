public class CadastraUsuarios {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
ArrayList listaDeUsuarios = new ArrayList();
Usuario usuario = new Usuario();
int op = 0;

	System.out.println("Digite 1 para cadastrar usuários ou 0 para sair !");
	op = scanner.nextInt();
	
	while(op != 0){
		System.out.println("Bem vindo ao sistema de cadastros de usuários");
		System.out.println("Digite o nome do usuário");
		usuario.setNome(scanner.nextLine());
		
		System.out.println("Digite o cargo do usuário");
		usuario.setCargo(scanner.nextLine());
		
		System.out.println("Digite o login");
		usuario.setLogin(scanner.nextLine());
		
		System.out.println("Digite a senha");
		usuario.setLogin(scanner.nextLine());
		
		listaDeUsuarios.add(usuario);
		usuario = new Usuario();
		
		System.out.println("Digite 1 para cadastrar usuários ou 0 para sair !");
		op = scanner.nextInt();
	}

}